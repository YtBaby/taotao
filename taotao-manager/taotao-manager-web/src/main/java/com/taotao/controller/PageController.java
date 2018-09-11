package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {

    /*打开首页*/
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String returnIndex(){
        return "index";
    }

    @RequestMapping(value = "/{page}", method = RequestMethod.GET)
    public String queryItemList(@PathVariable String page){
        return page;
    }
}
