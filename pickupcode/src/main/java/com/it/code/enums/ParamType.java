package com.it.code.enums;

public enum ParamType {
    INT("整数"){
        @Override
        public Object parse(String input) {
            return Integer.parseInt(input);
        }
    },
    STRING("字符串"){
        @Override
        public Object parse(String input) {
            return input;
        }
    },
    BOOLEAN("布尔"){
        @Override
        public Object parse(String input) {
            return Boolean.parseBoolean(input);
        }
    };
    private final String label;
    ParamType(String label){
        this.label=label;
    }
    public String getLabel(){
        return label;
    }
    public abstract Object parse(String input);
}
