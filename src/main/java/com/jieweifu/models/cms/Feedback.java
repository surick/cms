package com.jieweifu.models.cms;

import com.jieweifu.common.dbservice.Column;
import com.jieweifu.common.dbservice.Entity;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author Jin
 * @date 2018/11/22
 */
@Entity(tableName = "cms_feedback")
public class Feedback {

    @Column(primaryKey = true)
    private Integer id;

    private String title;

    @NotBlank(message = "内容不能为空")
    private String content;

    private String contact;

    @Column(columnName = "company_name")
    private String companyName;

    private String area;

    private String address;

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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", contact='" + contact + '\'' +
                ", companyName='" + companyName + '\'' +
                ", area='" + area + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
