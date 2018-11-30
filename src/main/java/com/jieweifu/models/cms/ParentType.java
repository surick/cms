package com.jieweifu.models.cms;

import com.jieweifu.common.dbservice.Column;
import com.jieweifu.common.dbservice.Entity;

/**
 * @author Jin
 * @date 2018/11/22
 */
@Entity(tableName = "cms_parent_type")
public class ParentType {

    @Column(primaryKey = true)
    private Integer id;

    @Column(columnName = "parent_name")
    private String parentName;

    private Integer deleted;

    @Column(columnName = "cn_parent_name")
    private String cnParentName;

    private String name;

    private Integer value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getCnParentName() {
        return cnParentName;
    }

    public void setCnParentName(String cnParentName) {
        this.cnParentName = cnParentName;
    }

    public String getName() {
        return parentName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return id;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ParentType{" +
                "id=" + id +
                ", parentName='" + parentName + '\'' +
                ", deleted=" + deleted +
                ", cnParentName='" + cnParentName + '\'' +
                '}';
    }
}
