package com.jieweifu.controllers.pc;

import com.jieweifu.models.cms.Feedback;
import com.jieweifu.services.cms.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

/**
 * @author Jin
 * @date 2018/12/11
 */
@Controller
public class PCFeedbackController {

    @Autowired
    FeedbackService feedbackService;

    @GetMapping("/feedback")
    public String feedback() {
        return "feedback";
    }

    @GetMapping("/cn/feedback")
    public String cnFeedback() {
        return "cn/feedback";
    }

    @GetMapping("/feedback_list")
    public String listFeedback(Map<String, Object> map) {
        List<Feedback> feedbacks = feedbackService.getAllFeedBacks();
        map.put("feedback", feedbacks);
        return "feedback_list";
    }

    @GetMapping("/cn/feedback_list")
    public String listCnFeedback(Map<String, Object> map) {
        List<Feedback> feedbacks = feedbackService.getAllFeedBacks();
        map.put("feedback", feedbacks);
        return "cn/feedback_list";
    }
}
