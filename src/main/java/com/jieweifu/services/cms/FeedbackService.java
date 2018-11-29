package com.jieweifu.services.cms;

import com.jieweifu.models.cms.Feedback;

import java.util.List;

/**
 * @author Jin
 * @date 2018/11/22
 */
public interface FeedbackService {

    /**
     * 存
     * @param feedback
     */
    void saveFeedback(Feedback feedback);

    /**
     * 分页
     * @param pageIndex
     * @param pageSize
     * @return
     */
    List<Feedback> listFeedback(int pageIndex, int pageSize);

    /**
     * 总数
     * @return
     */
    int getFeedbackTotal();
}
