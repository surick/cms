package com.jieweifu.models.cms;

import com.jieweifu.common.dbservice.Column;
import com.jieweifu.common.dbservice.Entity;
import org.hibernate.validator.constraints.Range;

/**
 * @author Jin
 * @date 2018/11/22
 */
@Entity(tableName = "cms_about")
public class About {

    @Column(primaryKey = true)
    private Integer id;

    private String title;

    private String content;

    @Column(columnName = "cn_title")
    private String cnTitle;

    @Column(columnName = "cn_content")
    private String cnContent;

    /**
     * type
     * 1:company profile
     * 2:culture
     * 3:honors
     * 4:technology
     */
    @Range(min = 0, max = 5, message = "type非法")
    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCnTitle() {
        return cnTitle;
    }

    public void setCnTitle(String cnTitle) {
        this.cnTitle = cnTitle;
    }

    public String getCnContent() {
        return cnContent;
    }

    public void setCnContent(String cnContent) {
        this.cnContent = cnContent;
    }

    @Override
    public String toString() {
        return "About{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", cnTitle='" + cnTitle + '\'' +
                ", cnContent='" + cnContent + '\'' +
                ", type=" + type +
                '}';
    }
}
