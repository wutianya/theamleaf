package com.hm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/3/27.
 */
@Controller
public class HelloController {
    /**
     * 首页
     * @return
     */
    @RequestMapping("/")
    public String page(){
        return "index";
    }
}
