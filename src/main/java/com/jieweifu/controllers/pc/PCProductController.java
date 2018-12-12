package com.jieweifu.controllers.pc;

import com.jieweifu.models.cms.Products;
import com.jieweifu.services.cms.ProductsService;
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
public class PCProductController {

    @Autowired
    ProductsService productsService;

    @GetMapping("products_list")
    public String listProducts(Map<String, Object> map) {
        List<Products> list = productsService.getAllProducts();
        map.put("list", list);
        return "products_list";
    }

    @GetMapping("/cn/products_list")
    public String cnListProducts(Map<String, Object> map) {
        List<Products> list = productsService.getAllProducts();
        map.put("list", list);
        return "cn/products_list";
    }
}
