package com.tjetc.test.dao;


import com.tjetc.test.Payment;
import org.apache.ibatis.annotations.Mapper;

/*
 * @Auth hukaixuan
 * @Date 2022/7/24
 * @time 17:01
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPayment(Long id);
}
