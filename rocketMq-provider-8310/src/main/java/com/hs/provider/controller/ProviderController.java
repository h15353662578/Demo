package com.hs.provider.controller;

import com.hs.entity.MqOrder;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/12/14:41
 * @Description:
 */

@RestController
@RequestMapping("/mqProvider")
public class ProviderController {

    @Resource
    private RocketMQTemplate rocketMQTemplate;


    @GetMapping("/create")
    public MqOrder create(){
        MqOrder mqOrder = new MqOrder(2,"李龙天一","17384938573","陕西省西安市",new Date(),3);
        this.rocketMQTemplate.convertAndSend("hs-order-topic", mqOrder);
        return mqOrder;
    }

    @GetMapping("/send")
    public String send() {
        MqOrder mqOrder = new MqOrder();
        mqOrder.setOrderId(2);
        mqOrder.setOrderDate(new Date());
        mqOrder.setBuyerAddress("陕西省西安市新城区");
        mqOrder.setBuyerName("华生");
        mqOrder.setId(1);
        mqOrder.setBuyerPhone("15353662578");
        rocketMQTemplate.convertAndSend("mqOrder",mqOrder);
        System.out.println("Test生产者");
        return "ok";
    }

}
