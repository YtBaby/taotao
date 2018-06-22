package com.taotao.service.impl;

import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import com.taotao.mapper.TbItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper itemMapper;

    public TbItem getItemById(Long id)
    {
        TbItem tbItem = itemMapper.selectByPrimaryKey(id);
        return tbItem;
    }
}
