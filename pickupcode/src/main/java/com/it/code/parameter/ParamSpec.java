package com.it.code.parameter;

public class ParamSpec {
    private String name; //参数名称
    private String desc; //参数说明

    public ParamSpec(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
