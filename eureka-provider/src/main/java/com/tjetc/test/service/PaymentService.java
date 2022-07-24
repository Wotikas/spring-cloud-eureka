package com.tjetc.test.service;



/*
 * @Auth hukaixuan
 * @Date 2022/7/24
 * @time 17:12
 */

import com.tjetc.test.Payment;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPayment(Long id);
}
