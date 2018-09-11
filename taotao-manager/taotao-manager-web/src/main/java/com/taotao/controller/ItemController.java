package com.taotao.controller;

import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @ResponseBody
    @RequestMapping(value = "/getItemById/{id}", method = RequestMethod.GET)
    public TbItem getItemById(@PathVariable Long id){
        return itemService.getItemById(id);
    }

    @ResponseBody
    @GetMapping(value = "/list/getItemById/{id}")
    public TbItem getItemList(@PathVariable Long id){
        return itemService.getItemById(id);
    }
}
