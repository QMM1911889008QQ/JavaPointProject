package com.qmm.javaword.process;

import com.sun.servicetag.SystemEnvironment;

public class StringBufferAndStringBuilder {
    /*
    1.String在拼接过程中或操作不当时,可能会产生大量的中间对象.而StringBuffer就是为了
    解决这个问题而提供的一个类.
    2.StringBuffer是线程安全的.
    StringBuffer 和 StringBuilder 都继承自AbstractStringBuilder类,而StringBuffer类的
    所有方法都使用关键字synchronized来保证线程安全.底层都是通过可修改的char数组(Java9以
    后改为byte)来实现修改.一般都是基于java8
    3.StringBuffer,StringBuilder在创建时,如果未指定容量,默认容量为16.如果容量可预估,则
    最好在创建时指定合适的大小,这样可以避免多次扩容.
    4.扩容会产生多重开销:抛弃原有的数组,创建新的数组,进行arrayCopy.
    5.StringBuffer,StringBuilder的常用方法:
        append 在字符串结尾追加
        length  返回当前长度
        setLength  设置字符串长度
    */
    public static void main(String[] args){
    String str1 = "hello" + "world" + "!";
    System.out.println(str1);

    StringBuffer strB1 = new StringBuffer();
    strB1.append("hello");
    strB1.append(" world");
    strB1.append("!");
    System.out.println(strB1.toString());

    StringBuilder strB2 = new StringBuilder();
    strB2.append("hello");
    strB2.append(" world");
    strB2.append("!");
    System.out.println(strB2.toString());

    System.out.println("strB2 length is " + strB2.length());

    strB2.setLength(strB2.length() - 1);
    System.out.println(strB2.toString());
    strB2.setLength(strB2.length() + 10);
    System.out.println(strB2.toString());

    }
//    public static void main(){
//        aa: for(int a=0;a < 8; a++){
//            bb: for(int b=0;b < 7; b++){
//                cc: for(int c=0;c < 6; c++){
//                    break bb;
//                }
//                break bb;
//            }
//            break aa;
//        }
//    }
}
