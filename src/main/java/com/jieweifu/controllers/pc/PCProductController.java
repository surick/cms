package com.jieweifu.controllers.pc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Jin
 * @date 2018/12/11
 */
@Controller
public class PCProductController {

    @GetMapping("products_list")
    public String listProducts() {
        return "products_list";
    }
}
