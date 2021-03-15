package com.hs.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/12/14:29
 * @Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MqOrder {

    private Integer id;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;


    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT)
    private Date orderDate;

    private Integer orderId;

}
