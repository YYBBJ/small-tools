package com.it.code.styl;

public class LayerCode extends Code{
    public LayerCode(String pickupCode){
        super.setPickupCode(pickupCode);
    }

    @Override
    public String getPattern() {
        return "层-序号";
    }
}
