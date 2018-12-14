package com.jieweifu.services.cms.impl;

import com.jieweifu.common.dbservice.DB;
import com.jieweifu.models.cms.ChildType;
import com.jieweifu.models.cms.Products;
import com.jieweifu.services.cms.ProductTypeService;
import com.jieweifu.services.cms.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Jin
 * @date 2018/11/22
 */
@Service
public class ProductsServiceImpl implements ProductsService {

    private DB db;
    private ProductTypeService productTypeService;

    @Autowired
    public ProductsServiceImpl(DB db, ProductTypeService productTypeService) {
        this.db = db;
        this.productTypeService = productTypeService;
    }

    @Override
    public void saveProducts(Products products) {
        db.insert()
                .save(products)
                .execute();
    }

    @Override
    public void updateProducts(Products products) {
        db.update()
                .save(products)
                .execute();
    }

    @Override
    public void removeProducts(Integer id) {
        db.update()
                .table(Products.class)
                .set("deleted", 1)
                .where("id = ?", id)
                .execute();
    }

    @Override
    public Products getProducts(Integer id) {
        return db.select()
                .from(Products.class)
                .where("id = ? AND deleted = 0", id)
                .queryForEntity(Products.class);
    }

    @Override
    public List<Products> getAllProducts() {
        return db.select()
                .from(Products.class)
                .where("deleted = 0")
                .queryForList(Products.class);
    }

    @Override
    public List<Products> listProducts(int pageIndex, int pageSize) {
        return db.select()
                .from(Products.class)
                .where("deleted = 0")
                .limit(pageIndex, pageSize)
                .queryForList(Products.class);
    }

    @Override
    public Page<Products> findPaginated(Pageable pageable) {
        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        List<Products> list = db.select()
                .from(Products.class)
                .where("deleted = 0")
                .limit(currentPage, pageSize)
                .queryForList(Products.class);

        Page<Products> productPage
                = new PageImpl<Products>(list, pageable, list.size());

        return productPage;
    }

    @Override
    public Page<Products> listProductsByChild(Pageable pageable, Integer childId) {
        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        List<Products> list = db.select()
                .from(Products.class)
                .where("child_type_id = ? AND deleted = 0", childId)
                .limit(currentPage, pageSize)
                .queryForList(Products.class);

        Page<Products> products
                = new PageImpl<>(list, pageable, list.size());
        return products;
    }

    @Override
    public int getTotalByChild(Integer childId) {
        return db.select()
                .from(Products.class)
                .where("child_type_id = ? AND deleted = 0", childId)
                .total();
    }

    @Override
    public Page<Products> listProductsByParent(Pageable pageable, Integer parentId) {
        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        List<ChildType> childTypeList = productTypeService.getChildTypesByParentId(parentId);
        List<Integer> childIds = childTypeList.stream().map(ChildType::getId).collect(Collectors.toList());

        List<Products> list = new ArrayList<>();
        if (childIds != null && childIds.size() > 0) {
            list = db.select()
                    .from(Products.class)
                    .where("child_type_id IN ? AND deleted = 0", childIds)
                    .limit(currentPage, pageSize)
                    .queryForList(Products.class);
        }

        Page<Products> products
                = new PageImpl<>(list, pageable, list.size());
        return products;
    }

    @Override
    public int getTotalByParent(Integer parentId) {
        List<ChildType> childTypeList = productTypeService.getChildTypesByParentId(parentId);
        List<Integer> childIds = childTypeList.stream().map(ChildType::getId).collect(Collectors.toList());
        return childIds.size() > 0 ? db.select()
                .from(Products.class)
                .where("child_type_id IN ? AND deleted = 0", childIds)
                .total() : 0;
    }

    @Override
    public int getProductsTotal() {
        return db.select()
                .from(Products.class)
                .where("deleted = 0")
                .total();
    }

    @Override
    public List<Products> listProductsByChildType(int pageIndex, int pageSize, Integer childType) {
        return db.select()
                .from(Products.class)
                .where("child_type_id = ? AND deleted = 0", childType)
                .queryForList(Products.class);
    }

    @Override
    public int getProductsByChildTypeTotal(Integer childType) {
        return db.select()
                .from(Products.class)
                .where("child_type_id = ? AND deleted = 0", childType)
                .total();
    }

    @Override
    public List<Products> listProductsByParentType(int pageIndex, int pageSize, Integer childType) {
        Integer parentId = getParentIdByChildType(childType);
        List<ChildType> childTypeList = productTypeService.getChildTypesByParentId(parentId);
        List<Integer> childIds = childTypeList.stream().map(ChildType::getId).collect(Collectors.toList());
        return db.select()
                .from(Products.class)
                .where("id IN (?) AND deleted = 0", childIds)
                .queryForList(Products.class);
    }

    @Override
    public int getProductsByParentTypeTotal(Integer childType) {
        Integer parentId = getParentIdByChildType(childType);
        List<ChildType> childTypeList = productTypeService.getChildTypesByParentId(parentId);
        List<Integer> childIds = childTypeList.stream().map(ChildType::getId).collect(Collectors.toList());
        return db.select()
                .from(Products.class)
                .where("id IN (?) AND deleted = 0", childIds)
                .total();
    }

    public int getParentIdByChildType(Integer childType) {
        ChildType res = db.select()
                .from(ChildType.class)
                .where("id = ?", childType)
                .queryForEntity(ChildType.class);
        return res.getParentId();
    }
}
