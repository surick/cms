package com.jieweifu.controllers.cms;

import com.jieweifu.common.utils.ErrorUtil;
import com.jieweifu.models.Result;
import com.jieweifu.models.cms.About;
import com.jieweifu.services.cms.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author Jin
 * @date 2018/11/22
 */
@RestController("CmsAbout")
@RequestMapping("cms/about")
public class AboutController {

    private AboutService aboutService;

    @Autowired
    public AboutController(AboutService aboutService) {
        this.aboutService = aboutService;
    }

    @PostMapping("saveAbout")
    public Result saveAbout(@Valid @RequestBody About about, Errors errors) {
        if (errors.hasErrors()) {
            return new Result().setError(ErrorUtil.getErrors(errors));
        }
        try {
            aboutService.saveAbout(about);
        } catch (Exception e) {
            return new Result().setError("保存失败，请刷新后重试");
        }
        Integer type = about.getType();
        String msg = null;
        switch (type) {
            case 1:
                msg = "新增company profile成功";
                break;
            case 2:
                msg = "新增culture成功";
                break;
            case 3:
                msg = "新增honors成功";
                break;
            case 4:
                msg = "新增technology成功";
                break;
            default:
                break;
        }
        return new Result().setMessage(msg);
    }

    @PutMapping("updateAbout")
    public Result updateAbout(@RequestBody About about) {
        if (aboutService.getAbout(about.getType()) == null) {
            return new Result().setError("不存在");
        }
        try {
            aboutService.updateAbout(about);
        } catch (Exception e) {
            return new Result().setError("更新失败，请刷新后重试");
        }
        Integer type = about.getType();
        String msg = null;
        switch (type) {
            case 1:
                msg = "修改company profile成功";
                break;
            case 2:
                msg = "修改culture成功";
                break;
            case 3:
                msg = "修改honors成功";
                break;
            case 4:
                msg = "修改technology成功";
                break;
            default:
                break;
        }
        return new Result().setMessage(msg);
    }

    @GetMapping("getAbout/{type}")
    public Result getAbout(@PathVariable("type") Integer type) {
        if (type < 0 || type > 4) {
            return new Result().setError("type不符合规范");
        }
        About about = aboutService.getAbout(type);
        return new Result().setData(about);
    }
}
