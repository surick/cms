package com.jieweifu.services.cms;


import com.jieweifu.models.cms.Products;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author Jin
 * @date 2018/11/22
 */
public interface ProductsService {
    /**
     * 存
     * @param products
     */
    void saveProducts(Products products);

    /**
     * 改
     * @param products
     */
    void updateProducts(Products products);

    /**
     * 删
     * @param id
     */
    void removeProducts(Integer id);

    /**
     * 取
     * @param id
     * @return
     */
    Products getProducts(Integer id);

    /**
     * 取
     * @return
     */
    List<Products> getAllProducts();

    /**
     * 分页
     * @param pageIndex
     * @param pageSize
     * @return
     */
    List<Products> listProducts(int pageIndex, int pageSize);

    /**
     * jpa分页
     * @param pageable
     * @return
     */
    Page<Products> findPaginated(Pageable pageable);

    /**
     * 子分页
     * @param pageable
     * @param childId
     * @return
     */
    Page<Products> listProductsByChild(Pageable pageable, Integer childId);

    /**
     * 子分页数
     * @param childId
     * @return
     */
    int getTotalByChild(Integer childId);

    /**
     * 父分页
     * @param pageable
     * @param parentId
     * @return
     */
    Page<Products> listProductsByParent(Pageable pageable, Integer parentId);

    /**
     * 父分页数
     * @param parentId
     * @return
     */
    int getTotalByParent(Integer parentId);

    /**
     * 分页数
     * @return
     */
    int getProductsTotal();

    /**
     * 子类别分页
     * @param pageIndex
     * @param pageSize
     * @param childType
     * @return
     */
    List<Products> listProductsByChildType(int pageIndex, int pageSize, Integer childType);

    /**
     * 子类别分页数
     * @param childType
     * @return
     */
    int getProductsByChildTypeTotal(Integer childType);

    /**
     * 父类别分页
     * @param pageIndex
     * @param pageSize
     * @param childType
     * @return
     */
    List<Products> listProductsByParentType(int pageIndex, int pageSize, Integer childType);

    /**
     * 父类别分页数
     * @param childType
     * @return
     */
    int getProductsByParentTypeTotal(Integer childType);
}
