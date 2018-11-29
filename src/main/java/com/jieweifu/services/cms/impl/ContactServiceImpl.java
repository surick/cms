package com.jieweifu.services.cms.impl;

import com.jieweifu.common.dbservice.DB;
import com.jieweifu.models.cms.Contact;
import com.jieweifu.services.cms.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Jin
 * @date 2018/11/22
 */
@Service
public class ContactServiceImpl implements ContactService {

    private DB db;

    @Autowired
    public ContactServiceImpl(DB db) {
        this.db = db;
    }

    @Override
    public void saveContact(Contact contact) {
        db.insert()
                .save(contact)
                .execute();
    }

    @Override
    public void updateContact(Contact contact) {
        db.update()
                .save(contact)
                .execute();
    }

    @Override
    public Contact getContact(Integer id) {
        return db.select()
                .from(Contact.class)
                .where("id = ?", id)
                .queryForEntity(Contact.class);
    }
}
