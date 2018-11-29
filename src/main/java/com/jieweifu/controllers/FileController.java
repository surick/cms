package com.jieweifu.controllers;

import com.froala.editor.File;
import com.froala.editor.file.FileOptions;
import com.froala.editor.file.FileValidation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Jin
 * @date 2018/11/26
 */
@Controller("File")
@RequestMapping("file")
public class FileController {
    private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    @Value("{custom.upload.file}")
    private String uploadPath;

    @PostMapping("upload")
    @ResponseBody
    public Map<Object, Object> upload(HttpServletRequest request) {
        FileOptions options = new FileOptions();
        Map<Object, Object> responseData = new HashMap<>();
        options.setValidation(new FileValidation());
        try {
            File.upload(request, uploadPath, options).forEach((key, value) -> responseData.put(key, "/uploads/file/" + value));
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("file upload error-->{}", e);
            responseData.put("error", e.toString());
        }
        return responseData;
    }

    @PostMapping("delete")
    @ResponseBody
    public String delete(HttpServletRequest request, @RequestParam String src) {
        try {
            File.delete(request, src);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("file delete error-->{}", e);
        }
        return "success";
    }
}
