package com.training.algorithm;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       System.out.println("请输入一个整数");
        Scanner scanner = new Scanner(System.in);
        int  oneValue = scanner.nextInt();
        System.out.println("请再输入一个整数");
        int twoValue = scanner.nextInt();




      /* int oneValue = (int) (Math.random() *100);
       int twoValue = (int) (Math.random() *100);*/
       System.out.println(""+oneValue);
       System.out.println(""+twoValue);
        int result =  oneValue+twoValue;
        System.out.println("相加结果是 ："+result);

        String[] wujiaoxing={"     *","    * *","* *    * *"," *      *","   *    *"," * * * *","*        *"};
        for(int i=0;i<wujiaoxing.length;i++){
            System.out.println(wujiaoxing[i]);
        }

    }
}
