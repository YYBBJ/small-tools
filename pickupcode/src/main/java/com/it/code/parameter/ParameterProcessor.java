package com.it.code.parameter;

import com.it.code.factory.PickupCodeFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ParameterProcessor {
    private PickupCodeFactory factory;
    private Scanner sc=new Scanner(System.in);
    public ParameterProcessor(PickupCodeFactory factory){
        this.factory=factory;
        if(isChoiceDefault()){

        }else{
            getInputParam();
        }
    }
    public void getInputParam(){

        Map<String, Object>params=new HashMap<>();
        //获取参数的格式
        List<ParamSpec> paramSpecs = factory.getParamSpecs();
        for(ParamSpec param:paramSpecs){
            String des = param.getDesc();
            System.out.println("请输入"+des+":");
            String input = sc.nextLine();
            Object value = param.getType().parse(input);
            params.put(param.getName(),value);
        }
        factory.setParamSpecs(params);

    }
    public boolean isChoiceDefault(){
        System.out.println("1 使用默认参数");
        System.out.println("2 使用自定义参数");
        int choice = sc.nextInt();
        if(choice==1){
            return true;
        }else{
            return false;
        }
    }




}
