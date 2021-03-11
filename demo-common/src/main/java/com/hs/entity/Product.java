package com.hs.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/10/15:33
 * @Description:
 */

@Data
@ToString
public class Product implements Serializable {

    private Integer id;

    private Integer productId;

    private String productName;

    private Integer productPrice;

    private String productType;

    private Integer productState;

    private String productStatusStr;

    public void setProductStatusStr(String productStatusStr) {
        this.productStatusStr = productStatusStr;
    }

    public String getProductStatusStr() {
        if (productState != null){
            if(productState == 0){
                productStatusStr="售罄";
            }else if (productState == 1){
                productStatusStr="待补货";
            }else if (productState == 2){
                productStatusStr="正常";
            }else if (productState == 3){
                productStatusStr="未定义";
            }
        }
        return productStatusStr;
    }
}
