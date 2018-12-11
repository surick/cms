package com.jieweifu.controllers.pc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Jin
 * @date 2018/12/11
 */
@Controller
public class PCIndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/en/index")
    public String enIndex() {
        return "en/index";
    }
}
