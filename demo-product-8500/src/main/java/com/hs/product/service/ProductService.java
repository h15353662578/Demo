package com.hs.product.service;

import com.hs.entity.Product;

import java.util.List;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/10/15:38
 * @Description:
 */
public interface ProductService {

    /***
     * 查询全部商品
     * @return
     */
    public List<Product>findAll();

    public int save(Product product);
}
