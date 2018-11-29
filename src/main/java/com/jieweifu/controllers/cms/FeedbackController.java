package com.jieweifu.controllers.cms;

import com.jieweifu.common.utils.ErrorUtil;
import com.jieweifu.models.Result;
import com.jieweifu.models.cms.Feedback;
import com.jieweifu.services.cms.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jin
 * @date 2018/11/22
 */
@RestController("CmsFeedback")
@RequestMapping("cms/feedback")
public class FeedbackController {

    private FeedbackService feedbackService;

    @Autowired
    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @PostMapping("saveFeedback")
    public Result saveFeedback(@Valid @RequestBody Feedback feedback, Errors errors) {
        if (errors.hasErrors()) {
            return new Result().setError(ErrorUtil.getErrors(errors));
        }
        try {
            feedbackService.saveFeedback(feedback);
        } catch (Exception e) {
            return new Result().setError("保存失败，请刷新后重试");
        }
        return new Result().setMessage("新增成功");
    }

    @GetMapping("listFeedback/{pageIndex}/{pageSize}")
    public Result listFeedback(@PathVariable("pageIndex") Integer pageIndex,
                               @PathVariable("pageSize") Integer pageSize) {
        if (pageIndex < 0 || pageSize < 0) {
            return new Result().setError("页码或条目数不合法");
        }
        List<Feedback> feedbackList = feedbackService.listFeedback(pageIndex, pageSize);
        int total = feedbackService.getFeedbackTotal();
        Map<String, Object> map = new HashMap<>(3);
        map.put("list", feedbackList);
        map.put("total", total);
        return new Result().setData(map);
    }
}
