package com.hs.product.mapper;

import com.hs.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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

    /***
     * 修改方法
     * @param product
     * @return
     */
    @Update("update `product` set product_id = #{productId},product_name = #{productName}, product_status = #{productStatus}, product_type = #{productType}, product_price = #{productPrice}")
    public int save(Product product);
}
