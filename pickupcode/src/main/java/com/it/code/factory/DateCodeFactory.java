package com.it.code.factory;

import com.it.code.styl.Code;
import com.it.code.styl.DateCode;

import java.time.LocalDate;

public class DateCodeFactory implements PickupCodeFactory{
    @Override
    public Code getCode(int num) {
        LocalDate now = LocalDate.now();
        int day = now.getDayOfMonth();
        String pickupCode=day+"-"+num;
        DateCode dateCode = new DateCode(pickupCode);
        return dateCode;
    }
}
