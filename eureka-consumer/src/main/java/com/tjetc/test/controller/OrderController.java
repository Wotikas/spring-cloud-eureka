package com.tjetc.test.controller;



/*
 * @Auth hukaixuan
 * @Date 2022/7/24
 * @time 17:32
 */

import com.tjetc.test.Payment;
import com.tjetc.test.feign.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentService paymentService;

    @GetMapping("/consumer/getPayment/{id}")
    public String getPayment(@PathVariable(value = "id") Long id) {
        log.info("端口："+serverPort+",消费端调用完成");
        return paymentService.getPayment(id);
    }

    @GetMapping("/consumer/create")
    public String create(Payment payment) {
        log.info("创建对象：" + payment.toString());
        return paymentService.create(payment);
    }
}
