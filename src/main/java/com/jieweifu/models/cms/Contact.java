package com.jieweifu.models.cms;

import com.jieweifu.common.dbservice.Column;
import com.jieweifu.common.dbservice.Entity;

/**
 * @author Jin
 * @date 2018/11/22
 */
@Entity(tableName = "cms_contact")
public class Contact {

    @Column(primaryKey = true)
    private Integer id;

    private String content;

    @Column(columnName = "cn_content")
    private String cnContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCnContent() {
        return cnContent;
    }

    public void setCnContent(String cnContent) {
        this.cnContent = cnContent;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", cnContent='" + cnContent + '\'' +
                '}';
    }
}
