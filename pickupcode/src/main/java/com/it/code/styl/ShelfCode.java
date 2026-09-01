package com.it.code.styl;

public class ShelfCode extends Code{
    public ShelfCode(String pickupCode){
        super.setPickupCode(pickupCode);
    }

    @Override
    public String getPattern() {
        return "货架号-层数-序号";
    }
}
