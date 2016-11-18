package com.zslin.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 钟述林 393156105@qq.com on 2016/11/18 22:09.
 */
@Controller
@RequestMapping(value = "web")
public class WebController {

    @GetMapping(value = "index")
    public String index(Model model, HttpServletRequest request) {
        model.addAttribute("name", "zhangsan");
        return "web/index";
    }
}
