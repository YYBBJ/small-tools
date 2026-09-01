package com.it.code.client;
import com.it.code.service.PickupCodeGenerator;
import com.it.code.factory.PickupCodeFactory;
import com.it.code.styl.Code;

import java.util.*;

public class Client {


    public static void main(String[] args) {
        List<PickupCodeFactory>list=new ArrayList<>();
        for(PickupCodeFactory factory:ServiceLoader.load(PickupCodeFactory.class)){
            list.add(factory);
        }

        System.out.println("=====欢迎使用取货码生成工具======");
        System.out.println("请选择取货码的格式");
        for(int i=0;i<list.size();i++){
            System.out.println("选项"+(i+1)+" "+list.get(i).getName());
        }


        Scanner scanner = new Scanner(System.in);
        int stylChoice=scanner.nextInt();
        PickupCodeFactory factory = list.get(stylChoice-1);

        System.out.println("请选择生成取货码的方式");
        System.out.println("选项1 单步获取");
        System.out.println("选项2 一次性获取");
        int wayChoice=scanner.nextInt();
        PickupCodeGenerator codeGenerator = new PickupCodeGenerator(factory);
        if(wayChoice==1){
            while (!scanner.nextLine().equals("q")){
                System.out.println(codeGenerator.getCodeStepByStep().getPickupCode());
            }
        }else if(wayChoice==2){
            System.out.println("输入生成取货码的数量");
            List<Code> codeAtOnce = codeGenerator.getCodeAtOnce(scanner.nextInt());
            for(Code code:codeAtOnce){
                System.out.println(code.getPickupCode());
            }
        }




    }
}
