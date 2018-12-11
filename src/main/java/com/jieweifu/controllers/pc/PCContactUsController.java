package com.jieweifu.controllers.pc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Jin
 * @date 2018/12/11
 */
@Controller
public class PCContactUsController {

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}
