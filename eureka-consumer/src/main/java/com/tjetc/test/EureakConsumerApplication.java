package com.tjetc.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
 * @Auth hukaixuan
 * @Date 2022/7/24
 * @time 17:28
 */
@SpringBootApplication
@EnableFeignClients
public class EureakConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EureakConsumerApplication.class, args);
    }
}
