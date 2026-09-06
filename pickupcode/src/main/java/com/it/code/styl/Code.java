package com.it.code.styl;

public abstract class Code {
    private String pickupCode;
    public Code(){

    }

    public String getPickupCode() {
        return pickupCode;
    }

    protected void setPickupCode(String pickupCode) {
        this.pickupCode = pickupCode;
    }

    public abstract String getPattern() ;



}
