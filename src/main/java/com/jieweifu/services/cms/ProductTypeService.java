package com.jieweifu.services.cms;

import com.jieweifu.models.cms.ChildType;
import com.jieweifu.models.cms.ParentType;

import java.util.List;

/**
 * @author Jin
 * @date 2018/11/22
 */
public interface ProductTypeService {

    /**
     * 存父类别
     * @param parentType
     */
    void saveParentType(ParentType parentType);

    /**
     * 更新父类别
     * @param parentType
     */
    void updateParentType(ParentType parentType);

    /**
     * 删父类别
     * @param id
     * @return
     */
    String removeParentType(Integer id);

    /**
     * 父类别详情
     * @param id
     * @return
     */
    ParentType getParentTypeById(Integer id);

    /**
     * 所有父类别
     * @return
     */
    List<ParentType> getAllParentTypes();

    /**
     * 存子类别
     * @param childType
     */
    void saveChildType(ChildType childType);

    /**
     * 更新子类别
     * @param childType
     */
    void updateChildType(ChildType childType);

    /**
     * 删子类别
     * @param id
     */
    void removeChildType(Integer id);

    /**
     * 子类别详情
     * @param id
     * @return
     */
    ChildType getChildTypeById(Integer id);

    /**
     * 所有子类别
     * @return
     */
    List<ChildType> getAllChildTypes();

    /**
     * 通过父类别id获取所有子类别
     * @param parentId
     * @return
     */
    List<ChildType> getChildTypesByParentId(Integer parentId);
}
