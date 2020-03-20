package com.qmm.javaword.process;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;
import java.util.Scanner;

public class Switch_Return_Break_ContinueProcess {
    public static void main(String[] args){
    /*
    switch (integral-selector) {
     case integral-value1: statement; break;
     case integral-value2: statement; break;
     case integral-value3: statement; break;
     ......
     default: statement;
    }

    Integral-selector （整数选择因⼦）是⼀个能产⽣整数值的表达式。
    当产⽣的结果，和 case 后的值相等 时，执⾏ case 后边的语句，
    直到 break 结束。

    从 Java 5 开始，switch 可以使⽤枚举（Enum）
    从 Java 7 开始，switch 可以使⽤字符串（String）
     */
    int num = 5;
    switch(num){
        case 1:
            System.out.println("扫地");
            break;
        case 2:
            System.out.println("开灯");
            break;
        case 3:
            System.out.println("关灯");
            break;
        case 4:
            System.out.println("播放音乐");
            break;
        default:
            System.out.println("不能识别的指令");

    }
    /*
    当⼀个循环执⾏中，如果想要退出循环或者不再执⾏后边的语句直接进⾏下⼀次循环。
    要⽤到中断 流程控制语句，包括： return 、 break 、 continue 。
    return 中断当前循环并直接返回
    break 跳出循环,继续执行该循环体后边的语句
    continue 不再执行本次循环后边还未执行的语句,跳转循环开始的地方进行下一次循环的执行.
     */
        while (true) {
            int r = new Random().nextInt(1000);
            if (r % 30 == 0) {
                System.out.println("随机数：" + r + "能被30整除，不在执⾏循环");
                break;
            } else {
                System.out.println("随机数：" + r);
            }
        }
       //-----------------------------------
        System.out.println(getMaxNumRem7(3,25));
        /*
        找出0-100范围内能被7整除的数,并计算他们累计相加的结果.
         */
        int total = 0;
        for(int i = 0; i < 100 ;i++){
            if(i % 7 != 0){
                continue;
            }
            total += i;//total= total+i;
        }
        System.out.println("0-100范围内能被7整除的数累计相加结果: " + total);
    }
    /*
    int getMaxNumRem7(int n1, int n2)
    找出0-n2范围内除以n1余7的最大的书,找到则返回该数,如果找不到则返回-1.
     */
    public static int getMaxNumRem7(int n1, int n2){
        for(int n = n2; n >= 0; n--){
            if(n % n1 == 7){
                return n;
            }
        }
        return -1;
    }
}
