package com.tjetc.test;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

/*
 * @Auth hukaixuan
 * @Date 2022/7/24
 * @time 16:59
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {

    private Long id;

    private String serial;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment Payment = (Payment) o;
        return Objects.equals(id, Payment.id) &&
                Objects.equals(serial, Payment.serial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serial);
    }

    @Override
    public String toString() {
        return "entity{" +
                "id=" + id +
                ", serial='" + serial + '\'' +
                '}';
    }
}
