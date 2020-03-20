package com.qmm.javaword.process;

import java.util.Random;

public class While_Do_ForProcess {
    public static void main(String[] args){
        /*
        随机生成一个0-1000范围的整数,如果不能被30整出,则打印出数字,如果能被30
        整出则推出循环.
         */
        //while实现
        System.out.println("while实现");
        boolean flag1 = true;
        while(flag1){
            int r = new Random().nextInt(1000);
            if(r%30 == 0){
                System.out.println("随机数" + r +"能被30整除,不再执行循环");
                flag1 = false;
            }else{
                System.out.println("随机数" + r);
            }
        }
        //----------------------------------------
        System.out.println("DoWhile实现");
        //DoWhile实现
        boolean flag2 = true;
        do{
            int r = new Random().nextInt(1000);
            if(r%30 == 0){
                System.out.println("随机数" + r +"能被30整除,不再执行循环");
                flag1 = false;
            }else{
                System.out.println("随机数" + r);
            }
        }while(flag2);
        //----------------------------------------
        System.out.println("For实现");
        //For实现
        //打印100个0-100范围内的单数并计算范围内单数的总个数。
        int total = 0;
        for(int i = 0; i<10; i++){
            int r = new Random().nextInt(100);
            if(r % 2 != 0){
                System.out.println("单数的总个数是: " + r);
                total++;
            }
        }
    }
}
