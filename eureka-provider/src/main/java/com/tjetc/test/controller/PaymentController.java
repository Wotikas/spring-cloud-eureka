package com.tjetc.test.controller;


import com.tjetc.test.Payment;
import com.tjetc.test.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/*
 * @Auth hukaixuan
 * @Date 2022/7/24
 * @time 17:14
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentService paymentService;

    @GetMapping("/getPayment/{id}")
    public String getPayment(@PathVariable(value = "id") Long id) {
        Payment payment = paymentService.getPayment(id);
        if (payment != null) {
            log.info(payment.toString());
            return "端口:" + serverPort + ",返回的数据是:" + payment.getSerial();
        }
        return null;
    }

    @PostMapping("/create")
    public String create(@RequestBody(required = false) Payment payment) {
        if (payment == null) {
            return "创建的对象不能为空";
        }
        int i = paymentService.create(payment);
        if (i > 0) {
            return "端口:" + serverPort + ",创建成功";
        } else {
            return "创建失败";
        }
    }
}
