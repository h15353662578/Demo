package com.hs.product.mapper;

import com.hs.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/10/15:36
 * @Description:
 */
@Mapper
public interface ProductMapper {

    /***
     * 查询全部商品
     * @return
     */
    @Select("select * from shop")
    public List<Product>findAll();
}
