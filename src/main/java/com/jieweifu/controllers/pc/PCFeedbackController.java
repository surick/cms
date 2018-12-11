package com.jieweifu.controllers.pc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Jin
 * @date 2018/12/11
 */
@Controller
public class PCFeedbackController {

    @GetMapping("feedback")
    public String feedback() {
        return "feedback";
    }

    @GetMapping("feedback_list")
    public String listFeedback() {
        return "feedback_list";
    }
}
