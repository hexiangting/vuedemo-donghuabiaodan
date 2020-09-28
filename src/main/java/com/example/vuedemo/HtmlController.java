package com.example.vuedemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author xbhdl
 * @create 2020/9/25 10:01
 */
@Controller
public class HtmlController {
    @RequestMapping(value="/index",method= RequestMethod.GET)
    public ModelAndView list(ModelAndView model){
        model.setViewName("index");
        return model;
    }
}
