package com.jieweifu.controllers.pc;

import com.jieweifu.models.cms.ChildType;
import com.jieweifu.models.cms.ParentType;
import com.jieweifu.models.cms.Products;
import com.jieweifu.services.cms.ProductTypeService;
import com.jieweifu.services.cms.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Jin
 * @date 2018/12/11
 */
@Controller
public class PCProductController {

    @Autowired
    ProductsService productsService;

    @Autowired
    ProductTypeService productTypeService;

    @GetMapping("products_list")
    public String listProducts(Model model,
                               @RequestParam("page") Optional<Integer> page,
                               @RequestParam("size") Optional<Integer> size) {
        int currentPage = page.orElse(0);
        int pageSize = size.orElse(6);

        Pageable pageable = new PageRequest(currentPage, pageSize);
        Page<Products> productPage = productsService.findPaginated(pageable);

        model.addAttribute("page", productPage);

        int totalPages = productsService.getProductsTotal();

        model.addAttribute("totalPages", totalPages);

        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "products_list";
    }

    @GetMapping("/cn/products_list")
    public String cnListProducts(Model model,
                                 @RequestParam("page") Optional<Integer> page,
                                 @RequestParam("size") Optional<Integer> size) {
        int currentPage = page.orElse(0);
        int pageSize = size.orElse(6);

//        List<Products> list = productsService.listProducts(currentPage, pageSize);

        Pageable pageable = new PageRequest(currentPage, pageSize);
        Page<Products> productPage = productsService.findPaginated(pageable);

        model.addAttribute("page", productPage);

        int totalPages = productsService.getProductsTotal();
        model.addAttribute("totalPages", totalPages);

        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }

        List<ParentType> types = new ArrayList<>();
        types = productTypeService.getAllParentTypes();
        model.addAttribute("parentTypes", types);

        List<ChildType> childTypes = new ArrayList<>();
        childTypes = productTypeService.getAllChildTypes();
        model.addAttribute("childTypes", childTypes);

        return "cn/products_list";
    }
}
