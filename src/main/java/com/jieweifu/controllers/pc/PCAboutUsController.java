package com.jieweifu.controllers.pc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Jin
 * @date 2018/12/11
 */
@Controller
public class PCAboutUsController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/company_profile")
    public String profile() {
        return "about";
    }

    @GetMapping("/culture")
    public String culture() {
        return "culture";
    }

    @GetMapping("/honors")
    public String honors() {
        return "honors";
    }

    @GetMapping("/technology")
    public String tech() {
        return "technology";
    }
}
