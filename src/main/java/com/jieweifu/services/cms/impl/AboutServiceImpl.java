package com.jieweifu.services.cms.impl;

import com.jieweifu.common.dbservice.DB;
import com.jieweifu.models.cms.About;
import com.jieweifu.services.cms.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Jin
 * @date 2018/11/22
 */
@Service
public class AboutServiceImpl implements AboutService {

    private DB db;

    @Autowired
    public AboutServiceImpl(DB db) {
        this.db = db;
    }

    @Override
    public void saveAbout(About about) {
        db.insert()
                .save(about)
                .execute();
    }

    @Override
    public void updateAbout(About about) {
        db.update()
                .save(about)
                .execute();
    }

    @Override
    public About getAbout(Integer type) {
        return db.select()
                .from(About.class)
                .where("type = ?", type)
                .queryForEntity(About.class);
    }
}
