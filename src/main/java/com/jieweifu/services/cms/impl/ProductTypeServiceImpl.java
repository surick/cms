package com.jieweifu.services.cms.impl;

import com.jieweifu.common.dbservice.DB;
import com.jieweifu.models.cms.ChildType;
import com.jieweifu.models.cms.ParentType;
import com.jieweifu.services.cms.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jin
 * @date 2018/11/22
 */
@Service
public class ProductTypeServiceImpl implements ProductTypeService {

    private DB db;

    @Autowired
    public ProductTypeServiceImpl(DB db) {
        this.db = db;
    }

    @Override
    public void saveParentType(ParentType parentType) {
        db.insert()
                .save(parentType)
                .execute();
    }

    @Override
    public void updateParentType(ParentType parentType) {
        db.update()
                .save(parentType)
                .execute();
    }

    @Override
    public String removeParentType(Integer id) {
        if (getChildTypesByParentId(id) == null || getChildTypesByParentId(id).size() <= 0) {
            db.update()
                    .table(ParentType.class)
                    .set("deleted", 1)
                    .where("id = ?", id)
                    .execute();
            return "删除成功";
        }
        return "父类别下有其他子类别";
    }

    @Override
    public ParentType getParentTypeById(Integer id) {
        return db.select()
                    .from(ParentType.class)
                    .where("id = ? AND deleted = 0", id)
                    .queryForEntity(ParentType.class);
    }

    @Override
    public List<ParentType> getAllParentTypes() {
        return db.select()
                .from(ParentType.class)
                .where("deleted = 0")
                .queryForList(ParentType.class);
    }

    @Override
    public void saveChildType(ChildType childType) {
        db.insert()
                .save(childType)
                .execute();
    }

    @Override
    public void updateChildType(ChildType childType) {
        db.update()
                .save(childType)
                .execute();
    }

    @Override
    public void removeChildType(Integer id) {
        db.update()
                .table(ChildType.class)
                .set("deleted", 1)
                .where("id = ?", id)
                .execute();
    }

    @Override
    public ChildType getChildTypeById(Integer id) {
        return db.select()
                .from(ChildType.class)
                .where("id = ? AND deleted = 0", id)
                .queryForEntity(ChildType.class);
    }

    @Override
    public List<ChildType> getAllChildTypes() {
        return db.select()
                .from(ChildType.class)
                .where("deleted = 0")
                .queryForList(ChildType.class);
    }

    @Override
    public List<ChildType> getChildTypesByParentId(Integer id) {
        return db.select()
                .from(ChildType.class)
                .where("parent_id = ? AND deleted = 0", id)
                .queryForList(ChildType.class);
    }
}
