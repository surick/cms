package com.jieweifu.models.cms;

import com.jieweifu.common.dbservice.Column;
import com.jieweifu.common.dbservice.Entity;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Jin
 * @date 2018/11/22
 */
@Entity(tableName = "cms_products")
public class Products {

    @Column(primaryKey = true)
    private Integer id;

    private String name;

    @Column(columnName = "child_type_id")
    private Integer childTypeId;

    @Column(columnName = "child_name")
    private String childName;

    @Column(columnName = "cn_child_name")
    private String cnChildName;

    @Column(columnName = "img_url")
    private String imgUrl;

    private String content;

    private Integer deleted;

    @Column(columnName = "cn_name")
    private String cnName;

    @Column(columnName = "cn_content")
    private String cnContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getChildTypeId() {
        return childTypeId;
    }

    public void setChildTypeId(Integer childTypeId) {
        this.childTypeId = childTypeId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public String getCnContent() {
        return cnContent;
    }

    public void setCnContent(String cnContent) {
        this.cnContent = cnContent;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getCnChildName() {
        return cnChildName;
    }

    public void setCnChildName(String cnChildName) {
        this.cnChildName = cnChildName;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", childTypeId=" + childTypeId +
                ", childName='" + childName + '\'' +
                ", cnChildName='" + cnChildName + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", content='" + content + '\'' +
                ", deleted=" + deleted +
                ", cnName='" + cnName + '\'' +
                ", cnContent='" + cnContent + '\'' +
                '}';
    }
}
