package com.it.code.factory;

import com.it.code.parameter.ParamSpec;
import com.it.code.styl.Code;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface  PickupCodeFactory {
    Code getCode(int num);
    String getName();
    List<ParamSpec> getParamSpecs();
    void setParamSpecs(Map<String, Object>params);
}
