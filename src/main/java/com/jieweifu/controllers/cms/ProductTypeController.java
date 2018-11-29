package com.jieweifu.controllers.cms;

import com.jieweifu.common.utils.ErrorUtil;
import com.jieweifu.models.Result;
import com.jieweifu.models.cms.ChildType;
import com.jieweifu.models.cms.ParentType;
import com.jieweifu.services.cms.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Jin
 * @date 2018/11/22
 */
@RestController("CmsProductType")
@RequestMapping("cms/productType")
public class ProductTypeController {

    private ProductTypeService productTypeService;

    @Autowired
    public ProductTypeController(ProductTypeService productTypeService) {
        this.productTypeService = productTypeService;
    }

    @PostMapping("saveParentType")
    public Result saveParentType(@Valid @RequestBody ParentType parentType, Errors errors) {
        if (errors.hasErrors()) {
            return new Result().setError(ErrorUtil.getErrors(errors));
        }
        try {
            productTypeService.saveParentType(parentType);
        } catch (Exception e) {
            return new Result().setError(500, "系统繁忙，请刷新后重试");
        }
        return new Result().setMessage("保存成功");
    }

    @PutMapping("updateParentType")
    public Result updateParentType(@Valid @RequestBody ParentType parentType, Errors errors) {
        if (errors.hasErrors()) {
            return new Result().setError(ErrorUtil.getErrors(errors));
        }
        try {
            productTypeService.updateParentType(parentType);
        } catch (Exception e) {
            return new Result().setError("修改失败，请刷新后重试");
        }
        return new Result().setMessage("修改成功");
    }

    @DeleteMapping("removeParentType/{id}")
    public Result removeParentType(@PathVariable("id") Integer id) {
        try {
            productTypeService.removeParentType(id);
        } catch (Exception e) {
            return new Result().setError("删除失败");
        }
        return new Result().setMessage("删除成功");
    }

    @GetMapping("getParentTypeById/{id}")
    public Result getParentTypeById(@PathVariable("id") Integer id) {
        ParentType parentType = null;
        try {
            parentType = productTypeService.getParentTypeById(id);
        } catch (Exception e) {
            return new Result().setError("系统繁忙，请刷新后重试");
        }
        return new Result().setData(parentType);
    }

    @GetMapping("getAllParentTypes")
    public Result getAllParentTypes() {
        List<ParentType> list;
        try {
            list = productTypeService.getAllParentTypes();
        } catch (Exception e) {
            return new Result().setError("系统繁忙，请刷新后重试");
        }
        return new Result().setData(list, 0, list.size());
    }

    @PostMapping("saveChildType")
    public Result saveChildType(@Valid @RequestBody ChildType childType, Errors errors) {
        if (errors.hasErrors()) {
            return new Result().setError(ErrorUtil.getErrors(errors));
        }
        try {
            productTypeService.saveChildType(childType);
        } catch (Exception e) {
            return new Result().setError(500, "系统繁忙，请刷新后重试");
        }
        return new Result().setMessage("保存成功");
    }

    @PostMapping("updateChildType")
    public Result updateChildType(@Valid @RequestBody ChildType childType, Errors errors) {
        if (errors.hasErrors()) {
            return new Result().setError(ErrorUtil.getErrors(errors));
        }
        try {
            productTypeService.updateChildType(childType);
        } catch (Exception e) {
            return new Result().setError("修改失败，请刷新后重试");
        }
        return new Result().setMessage("修改成功");
    }

    @DeleteMapping("removeChildType/{id}")
    public Result removeChildType(@PathVariable("id") Integer id) {
        try {
            productTypeService.removeChildType(id);
        } catch (Exception e) {
            return new Result().setError("删除失败");
        }
        return new Result().setMessage("删除成功");
    }

    @GetMapping("getChildTypeById/{id}")
    public Result getChildTypeById(@PathVariable("id") Integer id) {
        ChildType childType = null;
        try {
            childType = productTypeService.getChildTypeById(id);
        } catch (Exception e) {
            return new Result().setError("系统繁忙，请刷新后重试");
        }
        return new Result().setData(childType);
    }

    @GetMapping("getAllChildTypes")
    public Result getAllChildTypes() {
        List<ChildType> list;
        try {
            list = productTypeService.getAllChildTypes();
        } catch (Exception e) {
            return new Result().setError("系统繁忙，请刷新后重试");
        }
        return new Result().setData(list, 0, list.size());
    }

    @GetMapping("getChildTypesByParentId/{id}")
    public Result getChildTypesBydParentId(@PathVariable("id") Integer id) {
        List<ChildType> list;
        try {
            list = productTypeService.getChildTypesByParentId(id);
        } catch (Exception e) {
            return new Result().setError("系统繁忙，请刷新后重试");
        }
        return new Result().setData(list);
    }
}
