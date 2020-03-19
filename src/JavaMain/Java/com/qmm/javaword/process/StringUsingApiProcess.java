package com.qmm.javaword.process;

public class StringUsingApiProcess {
    public static void main(String[] args){
        stringLengthProcess();
        stringSubStringProcess();
        stringSplitJointProcess();
        stringFormatProcess();
        stringApiProcess();
    }
    /*
    字符串操作
    1.长度
       ※　int length()返回采用UTF-16编码表示的给定字符串所需要的代码单元数量.
       也即是String类内部char数组的长度.
       (char数据类型是一个采用UTF-16编码表示Unicode代码点的代码单元)
       ※　int codePointCount(int beginIndex,intendIndex)表示字符串的实际长度,及代码点数.
     */
    public static void stringLengthProcess(){
        String str = "hello,\uD835\uDD5D\uD835\uDD60\uD835\uDD5C";
        System.out.println(str); //hello,𝕝𝕠𝕜
        System.out.println("length is: " + str.length()); //length is: 12
        System.out.println("code point is:"+ str.codePointCount(0,str.length())); // code point is:9
    }
    /*
    2.子串
       ※　String substring(int beginIndex)
           String substring(int beginIndex, int endIndex)
     */
    public static void stringSubStringProcess(){
        String str = "hello, world";
        System.out.println(str.substring(1)); // ello, world
        System.out.println(str.substring(0,1)); // h
        System.out.println(str.substring(1,3)); //el
        System.out.println(str.substring(0,str.length()-1)); // hello, worl
        // System.out.println(str.substring(0,str.length()+1));  // StringIndexOutOfBoundsException
    }
    /*
    3.拼接
    可以直接使用+和+=运算符来进行字符串的拼接
     */
    public static void stringSplitJointProcess(){

        String str1 = "1hello" + ", world";

        String str2 = "2hello, ";
        str2 += "world!";

        String str3 = "3hello, ";
        str3 = str3 + "world!";

        System.out.println("\r\n"+ str1 + "\r\n" + str2 + "\r\n" + str3);
    }
     /*
    4.格式化
    为了让字符串拼接更简洁直观,使用字符串格式化方法String.format
    --> %s 字符串
    --> %c 字符类型
    --> %b 布尔类型
    --> %d 整数类型(十进制数)
    --> %x 整数类型(十六进制数)
    --> %o 整数类型(八进制数)
    --> %f 浮点类型
    --> %a 浮点类型(十六进制数)
    --> %% 百分比类型
    --> %n 换行
     */
     public static void stringFormatProcess(){
         System.out.printf("hello,%s %n","world");
         System.out.printf("大写a: %c %n",'A'); //注意是单引号的字符
         System.out.printf("100>50: %b %n",100>50);
         System.out.printf("100除以2: %d %n",100/2);
         System.out.printf("100的16进制数是: %x %n",100);
         System.out.printf("100的8进制数是: %o %n",100);
         System.out.printf("100元打8.5折扣是: %f 元%n",50*0.85);
         System.out.printf("上述价格的16进制数是: %a %n", 50*0.85);
         System.out.printf("上面的折扣是%d%% %n",85);
        //        hello,world
        //         大写a: A
        //         100>50: true
        //         100除以2: 50
        //         100的16进制数是: 64
        //         100的8进制数是: 144
        //         100元打8.5折扣是: 42.500000 元
        //         上述价格的16进制数是: 0x1.54p5
        //         上面的折扣是85%
     }
     public static void stringApiProcess(){
       //  4.equals判断是否相等
       //  equalsIgnoreCase 不区分大小写判断是否相等
         System.out.println("123".equals("1234"));
         System.out.println("1asD".equalsIgnoreCase("1asd"));
       //  5.前缀判断
         System.out.println("hello".startsWith("h"));
       //  6.后缀判断
         System.out.println("hello".endsWith("o"));
       //  7.包含判断
         System.out.println("hello".contains("ll"));
       //  8.查找
       //  indexOf 从前边查找
       //  lastIndexOf 从后边开始找
         String str = "hello, world!";
         System.out.println(str.indexOf("e"));
         System.out.println(str.indexOf('e'));
         System.out.println(str.indexOf(101));
         System.out.println(str.indexOf("e", 2));
         System.out.println(str.indexOf("l"));
         System.out.println(str.lastIndexOf("l"));
         System.out.println(str.lastIndexOf("l", 9));
       //  8.查找替换
       //  replace
       //  replaceALL
         System.out.println("hello, world!".replace('o', 'A'));
         System.out.println("hello, world!".replace("o", "OOO"));
         System.out.println("hello, world!".replaceAll("o", "OOO"));
       // 9.去空格
         System.out.println("Hello, world!".trim());
       // 10.大小写转换
         System.out.println("Hello,world!".toUpperCase());
         System.out.println("Hello,world!".toLowerCase());
       // 11.空串和Null串
       // 空串是一个长度为0且内容为空的String对象
       // String存放null,表示没有任何对象与该变量关联
     }
}
