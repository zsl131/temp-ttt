package com.zslin.web;

import com.zslin.dto.ResDto;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 钟述林 393156105@qq.com on 2016/11/18 21:28.
 */
@RestController
public class IndexController {

    @GetMapping(value = "index")
    public ResDto index(Model model) {

        return new ResDto("1", "abc");
    }
}
