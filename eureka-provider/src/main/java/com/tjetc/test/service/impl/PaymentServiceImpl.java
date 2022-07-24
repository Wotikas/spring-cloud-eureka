package com.tjetc.test.service.impl;



/*
 * @Auth hukaixuan
 * @Date 2022/7/24
 * @time 17:13
 */

import com.tjetc.test.Payment;
import com.tjetc.test.dao.PaymentDao;
import com.tjetc.test.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPayment(Long id) {
        return paymentDao.getPayment(id);
    }
}
