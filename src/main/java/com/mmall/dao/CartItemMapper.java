package com.mmall.dao;

import com.mmall.pojo.CartItem;

public interface CartItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CartItem record);

    int insertSelective(CartItem record);
}