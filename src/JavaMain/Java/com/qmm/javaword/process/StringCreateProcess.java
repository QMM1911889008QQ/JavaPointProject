package com.qmm.javaword.process;

public class StringCreateProcess {
/*
--------字符串-------
1.字符串的定义,创建
2.字符串常用操作:长度,子串,拼接
3.String/StringBuffer/StringBuilder
4.JVM对字符串的优化
5.应用:使用TDD编写
6.常见问题
 */
//字符串就是Unicode字符序列.
//java没有内置的字符类型,而是在标准Java类库中提供了一个预定义类String.
//每个用双括号括起来的字符串都是String类的一个实例.
//可以通过直接赋值或者new操作符来创建字符串.

  public static void main(String[] args){
      String str1 = "";
      String str2 = "hello,this is a string.";
      String str3 = new String("create string with new");
      System.out.println(str1);
      System.out.println(str2);
      System.out.println(str3);
    }
}
