package com.jieweifu.controllers.pc;

import com.jieweifu.models.cms.Contact;
import com.jieweifu.services.cms.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @author Jin
 * @date 2018/12/11
 */
@Controller
public class PCContactUsController {

    @Autowired
    ContactService contactService;

    @GetMapping("/contact")
    public String contact(Map<String, Object> map) {
        Contact contact = contactService.getContact(1);
        map.put("contact", contact);
        return "contact";
    }

    @GetMapping("/cn/contact")
    public String cnContact(Map<String, Object> map) {
        Contact contact = contactService.getContact(1);
        map.put("contact", contact);
        return "cn/contact";
    }
}
