package com.jieweifu.services.cms;

import com.jieweifu.models.cms.Contact;

/**
 * @author Jin
 * @date 2018/11/22
 */
public interface ContactService {
    /**
     * 存
     * @param contact
     */
    void saveContact(Contact contact);

    /**
     * 改
     * @param contact
     */
    void updateContact(Contact contact);

    /**
     * 查
     * @param id
     * @return
     */
    Contact getContact(Integer id);
}
