package com.it.code.service;

import com.it.code.factory.PickupCodeFactory;
import com.it.code.styl.Code;

import java.util.ArrayList;
import java.util.List;

public class PickupCodeGenerator {
    private PickupCodeFactory factory;
    private int next=0;
    public PickupCodeGenerator(PickupCodeFactory factory){
        this.factory=factory;
    }

    //一次生成一个取货码
   public Code getCodeStepByStep(){
       return factory.getCode(++next);
    }
    //批量生成取货码
    public List<Code> getCodeAtOnce(int count){
        List<Code>codes=new ArrayList<>(count);
        for(int i=0;i<count;i++){
            Code code = factory.getCode(++next);
            codes.add(code);
        }
        return codes;
    }
}
