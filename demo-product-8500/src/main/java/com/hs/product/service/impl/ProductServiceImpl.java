package com.hs.product.service.impl;

import com.hs.entity.Product;
import com.hs.product.mapper.ProductMapper;
import com.hs.product.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/10/15:38
 * @Description:
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productMapper;

//    @Override
//    public List<Product> findAll() {
//        List<Product> products=productMapper.findAll();
//        List<Product> products1=new ArrayList<>();
//        for (int i=0;i< products.size();i++){
//            Product pr=products.get(i);
//            if (pr.getProductState()!=3){
//                products1.add(pr);
//            }
//        }
//        return products1;
//    }

    @Override
    @Transactional
    public List<Product> findAll(){
        return productMapper.findAll();
    }

    @Override
    public int save(Product product){
        return productMapper.save(product);
    }
}
