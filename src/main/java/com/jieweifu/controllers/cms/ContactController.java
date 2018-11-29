package com.jieweifu.controllers.cms;

import com.jieweifu.common.utils.ErrorUtil;
import com.jieweifu.models.Result;
import com.jieweifu.models.cms.Contact;
import com.jieweifu.services.cms.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author Jin
 * @date 2018/11/22
 */
@RestController("CmsContact")
@RequestMapping("cms/contact")
public class ContactController {

    private ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping("saveContact")
    public Result saveContact(@Valid @RequestBody Contact contact, Errors errors) {
        if (errors.hasErrors()) {
            return new Result().setError(ErrorUtil.getErrors(errors));
        }
        try {
            contactService.saveContact(contact);
        } catch (Exception e) {
            return new Result().setError("保存失败，请刷新后重试");
        }

        return new Result().setMessage("保存成功");
    }

    @PutMapping("updateContact")
    public Result updateContact(@RequestBody Contact contact) {
        if (contactService.getContact(contact.getId()) == null) {
            return new Result().setError("不存在");
        }
        try {
            contactService.updateContact(contact);
        } catch (Exception e) {
            return new Result().setError("修改失败，请刷新后重试");
        }
        return new Result().setMessage("修改成功");
    }

    @GetMapping("getContact/{id}")
    public Result getContact(@PathVariable("id") Integer id) {
        if (id != 1) {
            return new Result().setError("id不符合规范");
        }
        Contact contact = contactService.getContact(id);
        return new Result().setData(contact);
    }
}
