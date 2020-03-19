package com.qmm.javaword.process;

public class StringRelationProcess {
    /*
    1.==对于基本类型来说是值比较;而对于引用类型比较的是引用,即是否是指向同一个
    对象的引用.
    2.equals默认是引用比较,而Integer,String等包装类都重写了equals方法,改为了
    值比较.所以对象都可以看作是继承自Object.如果自定义类为复写equals,调用对象的
    实例的equals方法默认是引用比较.
     */
    public boolean equals(Object obj){
        return (this == obj);
    }
//    Integer类的equals方法
//    public boolean equals(Object obj){
//        if(obj instanceof Integer){
//            return value == ((Integer)obj).intValue();
//        }
//        return false;
//    }
    public static void main(String[] args){
        String s1 = "hello" + ", world!";
        String s2 = "hello";
        s2 += ", world!";
        String s3 = "hello, world!";
        String s4 = s2.intern();
        System.out.println(s1 == s2);//        false
        System.out.println(s1 == s3);//        true
        System.out.println(s1 == s4);//        true
        System.out.println(s2 == s3);//        false
        System.out.println(s2 == s4);//        false
        /*
        1.String / StringBuffer / StringBuilder 的区别
        String 为不可变字符串；
        StringBuffer 和 StringBuilder 为字符串可变对象。
        String 的 substring 等修改操作每次都会产⽣⼀个新的 String 对象；
        字符串拼接性能 String 低于StringBuffer，⽽ StringBuffer 低于 StringBuilder。
        StringBuffer 是线程安全的，⽽StringBuilder 线程不安全的。
        ⼆者都是继承⾃ AbstractStringBuilder ，
        它们的唯⼀区别是 StringBuffer 的所有⽅法都使⽤了 synchronized 修饰符来保证线程安全。

        2.String 对象的 intern 的作⽤
         String 对象的 intern ⽅法⽤于字符串的显示排重。
         调⽤此⽅法时，JVM 去字符串常量池查找池中是否已经存在该字符串，如果已存在则直接返回它的引⽤；
         如果不存在则在池中先创建然后返回其引⽤。

        3.String 不可变性的优点
        字符串不可变，因此可以通过字符串常量池来实现共享对象，从⽽节省空间，提⾼性能。
        多线程安全，因为字符串不可变，所以当字符串被多个线程共享时不会存在线程安全问题。
        适合做缓存的 Key，因为字符串不可变，因此它的哈希值也就不变；
        创建时它的哈希值就被缓存了，不需要重新计算，速度更快。

        4.String 是否可以被继承
        String 不能被继承。
        因为 String 被声明为 final，所以不能被继承。
        八种包装类型都不会被继承
         */
    }
}
