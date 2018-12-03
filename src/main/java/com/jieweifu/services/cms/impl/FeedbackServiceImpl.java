package com.jieweifu.services.cms.impl;

import com.jieweifu.common.dbservice.DB;
import com.jieweifu.models.cms.Feedback;
import com.jieweifu.services.cms.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jin
 * @date 2018/11/22
 */
@Service
public class FeedbackServiceImpl implements FeedbackService {

    private DB db;

    @Autowired
    public FeedbackServiceImpl(DB db) {
        this.db = db;
    }

    @Override
    public void saveFeedback(Feedback feedback) {
        db.insert()
                .save(feedback)
                .execute();
    }

    @Override
    public List<Feedback> listFeedback(int pageIndex, int pageSize) {
        return db.select()
                .from(Feedback.class)
                .limit(pageIndex, pageSize)
                .queryForList(Feedback.class);
    }

    @Override
    public int getFeedbackTotal() {
        return db.select()
                .from(Feedback.class)
                .total();
    }

    @Override
    public List<Feedback> getAllFeedBacks() {
        return db.select()
                .from(Feedback.class)
                .where("deleted = 0")
                .queryForList(Feedback.class);
    }

    @Override
    public void removeFeedBacks(Integer id) {
        db.update()
                .table(Feedback.class)
                .set("deleted", 1)
                .where("id = ?", id)
                .execute();
    }
}
