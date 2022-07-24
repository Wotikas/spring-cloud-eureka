package com.tjetc.test.feign;


import com.tjetc.test.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/*
 * @Auth hukaixuan
 * @Date 2022/7/24
 * @time 17:30
 */
@FeignClient(value = "EUREKA-PROVIDER")
public interface PaymentService {

    @GetMapping("/getPayment/{id}")
    public String getPayment(@PathVariable(value = "id") Long id);

    @PostMapping("/create")
    public String create(Payment payment);
}
