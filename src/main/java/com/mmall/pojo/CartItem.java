package com.mmall.pojo;

public class CartItem {
    private Integer id;

    public CartItem(Integer id) {
        this.id = id;
    }

    public CartItem() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}