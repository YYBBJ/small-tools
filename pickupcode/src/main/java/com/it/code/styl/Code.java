package com.it.code.styl;

public abstract class Code {
    private String pickupCode;
    private String pattern;
    public Code(){

    }

    public String getPickupCode() {
        return pickupCode;
    }

    public void setPickupCode(String pickupCode) {
        this.pickupCode = pickupCode;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return "Code{" +
                "pickupCode='" + pickupCode + '\'' +
                ", pattern='" + pattern + '\'' +
                '}';
    }
}
