package com.jieweifu.models.cms;

import com.jieweifu.common.dbservice.Column;
import com.jieweifu.common.dbservice.Entity;

/**
 * @author Jin
 * @date 2018/11/22
 */
@Entity(tableName = "cms_child_type")
public class ChildType {

    @Column(primaryKey = true)
    private Integer id;

    @Column(columnName = "parent_id")
    private Integer parentId;

    @Column(columnName = "child_name")
    private String childName;

    @Column(columnName = "cn_child_name")
    private String cnChildName;

    private Integer deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getCnChildName() {
        return cnChildName;
    }

    public void setCnChildName(String cnChildName) {
        this.cnChildName = cnChildName;
    }

    @Override
    public String toString() {
        return "ChildType{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", childName='" + childName + '\'' +
                ", cnChildName='" + cnChildName + '\'' +
                ", deleted=" + deleted +
                '}';
    }
}
