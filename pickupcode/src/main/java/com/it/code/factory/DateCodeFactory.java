package com.it.code.factory;

import com.it.code.styl.Code;
import com.it.code.styl.DateCode;

import java.time.LocalDate;

public class DateCodeFactory implements PickupCodeFactory{
    @Override
    public Code getCode(int num) {
        LocalDate now = LocalDate.now();
        int day = now.getDayOfMonth();
        DateCode dateCode = new DateCode();
        dateCode.setPickupCode(day+"-"+num);
        return dateCode;
    }
}
