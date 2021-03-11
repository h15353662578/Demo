package com.hs.product.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.hs.entity.Product;
import com.hs.product.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/10/15:42
 * @Description:
 */

@RestController
@RequestMapping("/product")
public class ProductController {

    @Resource
    private ProductService productService;

    @GetMapping("/findAll")
    @SentinelResource("/findAll")
    public List<Product>findAll(){
        return productService.findAll();
    }
}
