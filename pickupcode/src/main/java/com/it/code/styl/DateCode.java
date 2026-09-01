package com.it.code.styl;
public class DateCode extends Code{

    public DateCode(String pickupCode){
        super.setPickupCode(pickupCode);
    }

    @Override
    public String getPattern() {
        return "日-序号";
    }

}
