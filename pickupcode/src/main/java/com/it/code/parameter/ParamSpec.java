package com.it.code.parameter;

import com.it.code.enums.ParamType;

public class ParamSpec {
    private String name; //参数名称
    private String desc; //参数说明
    private ParamType type;//参数类型

    public ParamSpec(String name, String desc,ParamType type) {
        this.name = name;
        this.desc = desc;
        this.type=type;
    }

    public String getName() {
        return name;

    }

    public String getDesc() {
        return desc;
    }
    public ParamType getType(){
        return type;
    }
}
