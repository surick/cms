package com.jieweifu.controllers.pc;

import com.jieweifu.models.cms.About;
import com.jieweifu.services.cms.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @author Jin
 * @date 2018/12/11
 */
@Controller
public class PCAboutUsController {

    @Autowired
    AboutService aboutService;

    @GetMapping("/about")
    public String about(Map<String, Object> map) {
        About about = aboutService.getAbout(1);
        map.put("about", about);
        return "about";
    }

    @GetMapping("/cn/about")
    public String cnAbout(Map<String, Object> map) {
        About about = aboutService.getAbout(1);
        map.put("about", about);
        return "cn/about";
    }

    @GetMapping("/company_profile")
    public String profile(Map<String, Object> map) {
        About about = aboutService.getAbout(1);
        map.put("about", about);
        return "about";
    }

    @GetMapping("/culture")
    public String culture(Map<String, Object> map) {
        About about = aboutService.getAbout(2);
        map.put("about", about);
        return "culture";
    }

    @GetMapping("/cn/culture")
    public String cnCulture(Map<String, Object> map) {
        About about = aboutService.getAbout(2);
        map.put("about", about);
        return "cn/culture";
    }

    @GetMapping("/honors")
    public String honors(Map<String, Object> map) {
        About about = aboutService.getAbout(3);
        map.put("about", about);
        return "honors";
    }

    @GetMapping("/cn/honors")
    public String cnHonors(Map<String, Object> map) {
        About about = aboutService.getAbout(3);
        map.put("about", about);
        return "cn/honors";
    }

    @GetMapping("/technology")
    public String tech(Map<String, Object> map) {
        About about = aboutService.getAbout(4);
        map.put("about", about);
        return "technology";
    }

    @GetMapping("/cn/technology")
    public String cnTech(Map<String, Object> map) {
        About about = aboutService.getAbout(4);
        map.put("about", about);
        return "cn/technology";
    }
}
