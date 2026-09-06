package com.it.code.factory;

import com.it.code.enums.ParamType;
import com.it.code.parameter.ParamSpec;
import com.it.code.styl.Code;
import com.it.code.styl.DateCode;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class DateCodeFactory implements PickupCodeFactory{
    private int dateParam=LocalDate.now().getDayOfMonth(); //日
    @Override
    public Code getCode(int num) {
        String pickupCode=dateParam+"-"+num;
        DateCode dateCode = new DateCode(pickupCode);
        return dateCode;
    }

    @Override
    public String getName() {
        return "日-序号";
    }

    @Override
    public List<ParamSpec> getParamSpecs() {
        return List.of(new ParamSpec("dateParam","日", ParamType.INT));
    }

    @Override
    public void setParamSpecs(Map<String, Object> params) {
        if(params.containsKey("dateParam")) this.dateParam=(Integer) params.get("dateParam");
    }
}
