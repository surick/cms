package com.jieweifu.controllers.cms;

import com.jieweifu.common.utils.FileUtil;
import com.jieweifu.models.Result;
import com.jieweifu.models.cms.Products;
import com.jieweifu.services.cms.ProductsService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jin
 * @date 2018/11/22
 */
@RestController("CmsProducts")
@RequestMapping("cms/products")
public class ProductsController {

    private ProductsService productsService;

    @Value("${custom.upload.products}")
    private String uploadPath;

    @Autowired
    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @PostMapping("saveProducts")
    public Result saveProducts(@RequestParam(value = "name") String name,
                               @RequestParam(value = "childTypeId") Integer id,
                               @RequestParam(value = "content", required = false) String content,
                               @RequestParam(value = "file", required = false) MultipartFile file) {
        Products products = new Products();
        if (file != null) {
            try {
                products.setImgUrl(FileUtil.uploadImage(file, uploadPath));
            } catch (Exception e) {
                e.printStackTrace();
                return new Result().setError("上传失败，请刷新再试");
            }
        }
        products.setName(name);
        products.setChildTypeId(id);
        if (StringUtils.isNotBlank(content)) {
            products.setContent(content);
        }
        try {
            productsService.saveProducts(products);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result().setError("系统繁忙，请刷新再试");
        }
        return new Result().setMessage("保存成功");
    }

    @PostMapping("updateProducts")
    public Result updateProducts(@RequestParam(value = "name") String name,
                                 @RequestParam(value = "childTypeId") Integer id,
                                 @RequestParam(value = "content", required = false) String content,
                                 @RequestParam(value = "file", required = false) MultipartFile file) {
        Products products = new Products();
        if (file != null) {
            try {
                products.setImgUrl(FileUtil.uploadImage(file, uploadPath));
            } catch (Exception e) {
                e.printStackTrace();
                return new Result().setError("图片上传失败");
            }
        }
        products.setName(name);
        products.setChildTypeId(id);
        if (StringUtils.isNotBlank(content)) {
            products.setContent(content);
        }
        try {
            productsService.updateProducts(products);
        } catch (Exception e) {
            return new Result().setError("系统繁忙，请刷新再试");
        }
        return new Result().setMessage("更新成功");
    }

    @DeleteMapping("removeProducts/{id}")
    public Result removeProducts(@PathVariable("id") Integer id) {
        if (id < 0) {
            return new Result().setError("违法参数");
        }
        try {
            productsService.removeProducts(id);
        } catch (Exception e) {
            return new Result().setError("删除失败");
        }
        return new Result().setMessage("删除成功");
    }

    @GetMapping("getProducts/{id}")
    public Result getProducts(@PathVariable("id") Integer id) {
        if (id < 0) {
            return new Result().setError("违法参数");
        }
        Products products = new Products();
        try {
            products = productsService.getProducts(id);
        } catch (Exception e) {
            return new Result().setError("系统繁忙，请稍后再试");
        }
        return new Result().setData(products);
    }

    @GetMapping("listProducts/{pageIndex}/{pageSize}")
    public Result listProducts(@PathVariable("pageIndex") Integer pageIndex,
                               @PathVariable("pageSize") Integer pageSize) {
        if (pageIndex < 0 || pageSize < 0) {
            return new Result().setError("页码或条目数不合法");
        }
        List<Products> productsList = productsService.listProducts(pageIndex, pageSize);
        int total = productsService.getProductsTotal();
        Map<String, Object> map = new HashMap<>(3);
        map.put("list", productsList);
        map.put("total", total);
        return new Result().setData(map);
    }

    @GetMapping("listProductsByChildType/{pageIndex}/{pageSize}")
    public Result listProductsByChildType(@PathVariable("pageIndex") Integer pageIndex,
                                          @PathVariable("pageSize") Integer pageSize,
                                          @RequestParam(value = "childTypeId") Integer childTypeId) {
        if (pageIndex < 0 || pageSize < 0) {
            return new Result().setError("页码或条目数不合法");
        }
        List<Products> productsList = productsService.listProductsByChildType(pageIndex, pageSize, childTypeId);
        int total = productsService.getProductsByChildTypeTotal(childTypeId);
        Map<String, Object> map = new HashMap<>(3);
        map.put("list", productsList);
        map.put("total", total);
        return new Result().setData(map);
    }

    @GetMapping("listProductsByParentType/{pageIndex}/{pageSize}")
    public Result listProductsByParentType(@PathVariable("pageIndex") Integer pageIndex,
                                           @PathVariable("pageSize") Integer pageSize,
                                           @RequestParam(value = "childTypeId") Integer parentTypeId) {
        if (pageIndex < 0 || pageSize < 0) {
            return new Result().setError("页码或条数不合法");
        }
        List<Products> productsList = productsService.listProductsByParentType(pageIndex, pageSize, parentTypeId);
        int total = productsService.getProductsByParentTypeTotal(parentTypeId);
        Map<String, Object> map = new HashMap<>(3);
        map.put("list", productsList);
        map.put("total", total);
        return new Result().setData(map);
    }
}
