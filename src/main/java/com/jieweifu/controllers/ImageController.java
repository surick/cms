package com.jieweifu.controllers;

import com.baidu.ueditor.ActionEnter;
import com.froala.editor.Image;
import com.froala.editor.image.ImageOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Jin
 * @date 2018/11/26
 */
@Controller("Image")
@RequestMapping("image")
public class ImageController {
    @Value("${custom.upload.dir}")
    private String uploadPath;

    @RequestMapping("config")
    public void config(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("application/json");
        String rootPath = request.getSession().getServletContext().getRealPath("/");
        try {
            String exec = new ActionEnter(request, rootPath).exec();
            PrintWriter writer = response.getWriter();
            writer.write(exec);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @PostMapping("upload")
    @ResponseBody
    public Map<Object, Object> upload(HttpServletRequest request,
                                      @RequestParam(value = "height", defaultValue = "300") Integer height,
                                      @RequestParam(value = "width", defaultValue = "300") Integer width,
                                      @RequestParam(value = "keepAspectRatio", defaultValue = "false") boolean keepAspectRatio,
                                      @RequestParam(value = "onlyThumb", defaultValue = "false") boolean onlyThumb,
                                      @RequestParam(value = "noThumb", defaultValue = "false") boolean noThumb) {
        ImageOptions options = new ImageOptions();
        options.setResize(width, height, keepAspectRatio);
        if (onlyThumb) {
            options.setOnlyThumb(true);
        }
        if (noThumb) {
            options = null;
        }
        return uploadImage(request, uploadPath, options);
    }

    private Map<Object, Object> uploadImage(HttpServletRequest request, String path, ImageOptions options) {
        Map<Object, Object> responseData = new HashMap<>(3);
        try {
            Image.upload(request, path, options).forEach((key, value) -> responseData.put(key, value));
        } catch (Exception e) {
            e.printStackTrace();
            responseData.put("error", e.toString());
        }
        responseData.put("url", "http://127.0.0.1/images/" + responseData.get("link"));
        return responseData;
    }

    @PostMapping("delete")
    @ResponseBody
    public String delete(HttpServletRequest request, @RequestParam String src) {
        try {
            Image.delete(request, src);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }

}
