package com.qmm.javaword.process;

public class StringSaveProcess {
/*
1.String类没有提供用于修改字符串的方法,所以称String类对象为不可变字符串
2.字符串被声明为final class,所有的属性也被定义为final的.
3.可以修改字符串变量,让它指向另外一个字符串.
4.为了提高内存利用率,JVM有一个字符串常量池,每次使用双引号定义一个字符串,JVM
  会先到该常量池中来检测是否已经存在,存在则直接用该对象的引用,否则在常量池
  中创建一个新的字符串并返回该值的引用.
5.使用new创建字符串时,或者使用+和+=方式进行拼接且拼接内容中包含变量,JVM每次会直接
  在堆中创建该字符串并且返回其引用,从java6开始,String类提供了intern()方法,
  调用该方法时,JVM去字符串常量池中检测是否已存在该字符串
  如果已经存在则直接返回引用,如果不存在则在常量池中新添加并返回其引用
6.Java6中,字符串常量池存在PermGen里,也就是("永久代"),而这个空间是有限的,基本不会被FullGC
  之外的垃圾收集机制扫描.如果使用不当,经常会发生OOM("宕机").在后续版本中,将字符串常量池放在了
  堆中,而且默认缓存大小也在不断扩大.在Java8中永久带PermGen也被元数据区MetaSpace替代.
 */
public static void main(String[] args){
    String str1 = "hello";
    String str2 = "hello";
    String str3 = "hello"+"world";
    String str4 = str2 + "world";
    String str5 = new String("hello");
    String str6 = new String("hello");
    String str7 = str6.intern();
    String str8 = new String("hello").intern();

    System.out.println("str1 = str2," + (str1 == str2));
    System.out.println("str3 = str4," + (str3 == str4));
    System.out.println("str1 = str5," + (str1 == str5));
    System.out.println("str5 = str6," + (str5 == str6));
    System.out.println("str1 = str7," + (str1 == str7));
    System.out.println("str1 = str8," + (str1 == str8));

    String str9 = "hello";
    str9 += "world";
    System.out.println("str3 = str9," + (str3 == str9));
    }
}
