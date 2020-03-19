package com.qmm.javaword.process;

public class StringInJvmOptimization {

    public static void main(String[] args) {
        //JVM对字符串拼接操作的调优
        //jvmForStringBuilder();
        System.out.println(trimAll("1 2 3"));
        System.out.println(reverse("123"));
    }
    public static void jvmForStringBuilder(){
        //JVM在编译时会对String操作进行一些优化以提高程序的运行效率.
        // 1*
        String str = "hello" + ", " + "world!";
        System.out.println(str);
        // JVM优化后
        str = "hello, world!";
        System.out.println(str);

        // 2*
        String str1 = "hello";
        String str2 = str1 + ", world!";
        System.out.println(str2);
        // JVM优化后
        str1 = "hello";
        StringBuilder str3 = new StringBuilder();
        str3.append(str1);
        str3.append(", world");
        System.out.println(str2.toString());

        // 3*
        long start = System.currentTimeMillis();
        String str4 = "";
        for (int i = 0; i < 50000; i++) {
            str4 += i;
        }
        System.out.println(str4.length());
        System.out.println("耗时: " + (System.currentTimeMillis() - start) + "ms");
        //JVM优化后
        Long start1 = System.currentTimeMillis();
        String str5 = "";
        for (int i = 0; i < 50000; i++) {
            StringBuilder tmp1 = new StringBuilder();
            tmp1.append(str5);
            tmp1.append(i);
            str5 = tmp1.toString();
        }
        System.out.println(str5.length());
        System.out.println("耗时: " + (System.currentTimeMillis() - start1));

        /*for循环经过优化后,虽然节省了空间,但是StringBuilder是在for循环内,每次
        都会创建.性能并不会提升,反而可能会下降.下记将StringBuilder在for循环外进行
        创建性能可以提升好几个数量级.
         */
        Long start2 = System.currentTimeMillis();
        StringBuilder tmp3 = new StringBuilder();
        for (int i = 0; i < 50000; i++) {
            tmp3.append(i);
        }
        System.out.println(tmp3.length());
        System.out.println("耗时: " + (System.currentTimeMillis() - start2) + "ms");
        //分析: 反编译出字节码
        // javap -c 编译生成的class文件路径
    }
    /*
    去掉字符串开头/结尾/中间的空格(不使用trim方法)
     */
    public static String trimAll(String str){
        StringBuilder tmp = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == ' '){
                continue;
            }
            tmp.append(c);
        }
        return tmp.toString();
    }
    /*
    反转字符串,123-->321
     */
    public static String reverse(String str){
        StringBuilder tmp = new StringBuilder();
        char[] chars = str.toCharArray();
        for(int i = chars.length-1; i >= 0; i--){
            char c = chars[i];
            tmp.append(c);
        }
        return tmp.toString();
    }
}
