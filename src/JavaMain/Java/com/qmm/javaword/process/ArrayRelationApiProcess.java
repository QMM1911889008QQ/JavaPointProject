package com.qmm.javaword.process;

import java.util.Arrays;
import java.util.Random;

public class ArrayRelationApiProcess {
    /*
    数组是一种数据结构,用来存放同一类型的值的集合.通过整数下边来访问数组中的值,
    数组下标从0开始;当下标越界,不再范围之内时,程序会报错.
    java.lang.ArrayIndexOutOfBoundsException.

    数组是一种引用类型,只能用来存储固定大小的同类型数据.在java中很多集合的内部都
    是使用数组来实现的,例ArrayList和HashMap等.
    数组的常用排序算法:冒泡算法,选择排序.
     */
    public static void main(String[] args){
            arrayInitMethod();
            arrayForEachMethod();
            arrayCopyMethod();
            arraysFillMethod();
            arraysSortMethod();
            arraysMultiAndIrregular();
     }
    /*
    一数组初始化
     */
    public static void arrayInitMethod(){

//        声明数组变量时,必须指明数组类型,类型后边紧跟括号或者将括号放在数组变量之后,
//        数组类型可以是基本数据类型或者引用类型.
//
//    例: int[] arr1;
//        int arr2[];
//        String[] arr3;
//        String arr4[];

        //1*使用new操作符创建的数组时,基本数据类型每个值会初始化为二进制的0,
        //而引用类型会初始化为null.
        int[] arr1 = new int[3];
        String[] arrS1 = new String[3];

        //2*使用new操作符创建数组时,直接使用大括号方法赋值,数组的长度为大括号内元素的
        //个数,不能同时在[]内指定长度,否则编译器会报错.
        int[] arr2 = new int[]{1,2,3};
        String[] arrS2 = new String[]{"1","2","3"};

        //3*使用第2种方法创建数组时,可以省略前边的new操作符而直接使用大括号.
        int[] arr3 = {1,2,3};
        String[] arrS3 = {"1","2","3"};
    }

    /*
    二数组遍历
     */
    public static void arrayForEachMethod(){
        /*
        有三种方式
        1.for循环使用数组下标
        2.for each循环
        3.Java8中新增的Lambda表达式
         */
        int[] arr = {1,2,3,4,5};
        Integer[] array1 = {1,2,3,4,5};
        System.out.println("1.for循环使用数组下标");
        for(int index = 0;index < arr.length; index++){
            System.out.println(arr[index]);
        }
        System.out.println("2.for each循环使用数组下标");
        for (int num : array1) {
            System.out.println(num);
        }
        System.out.println("3.Java8中新增的Lambda表达式");
        //Arrays.asList(arr).forEach(numb -> System.out.println(numb));
    }
    /*
    三数组拷贝
     */
    public static void arrayCopyMethod(){
        /*
        数组拷贝有两种方式
        1.使用工具类Arrays.copyOf或者Arrays.copyOfRange
        2.使用底层方法System.arraycopy
         */
       Integer[] arrI1 = {1,2,3,4,5};
       Integer[] arrI2 = {6,7,8,9,10};
       // 拷贝数组arrI1的前3个元素
       Integer[] arrI3 = Arrays.copyOf(arrI1,3);
       System.out.println(Arrays.toString(arrI3)); //[1, 2, 3]

       //拷贝数组arrI1的第1位到第3位的元素(不包括第3位)
       Integer[] arrI4 = Arrays.copyOfRange(arrI1,1,3);
       System.out.println(Arrays.toString(arrI4)); //[2, 3]

       //拷贝数组arrI2的后3位到arrI1到后3位
       System.arraycopy(arrI2, 2,arrI1,2,3);
       System.out.println(Arrays.toString(arrI1)); //[1, 2, 8, 9, 10]
    }

    /*
    四数组填充
    使用工具类提供的方法Arrays.fill 可以对数组全部或指定范围内的元素
    赋值为指定的值
     */
    public static void arraysFillMethod(){
        //定义一个大小为10的int数组,并将数组全部初始化为指定的值5,打印数组;
        //然后将数组后3位赋值为3,再次打印数组
        int[] arrT = new int[10];
        Arrays.fill(arrT,5);
        System.out.println(Arrays.toString(arrT));

        Arrays.fill(arrT,arrT.length-3,arrT.length,3);
        System.out.println(Arrays.toString(arrT));
    }
    /*
    五数组排序
    可以使用Arrays.sort方法对数组进行排序
     */
    public static void arraysSortMethod(){
        //定义一个大小为100的int数组,随机给每一位赋值一个1-100之间的数值
        //然后对该数组进行排序并打印排序结果
        int[] arrR = new int[100];
        for(int index = 0;index < arrR.length;index++){
            arrR[index] = new Random().nextInt(100);
        }
        System.out.println("排序前: " + Arrays.toString(arrR));
        Arrays.sort(arrR);
        System.out.println("排序后: " + Arrays.toString(arrR));
    }
    /*
    六多维数组和不规则数组
     */
    public static void arraysMultiAndIrregular(){
    //多维数组可以被理解为数组的数组.
    //多维数组的同一个维可以有不同的长度,因此也可以称为不规则数组.
    //声明时使用多个中括号[]标识来声明.

        /*
        定义一个二维数组,第一维表示用户,第二维表示用户的具体信息
        (1.编码,2.姓名,3.性别,4.年龄)定义赋值并打印
         */
        String[][] users = new String[3][];
        users[0] = new String[4];
        users[0][0] = "001";
        users[0][1] = "ZS";
        users[0][2] = "女";
        users[0][3] = "25";
        users[1] = new String[4];
        users[1][0] = "002";
        users[1][1] = "LS";
        users[1][2] = "男";
        users[1][3] = "27";
        System.out.println(Arrays.toString(users));
        for(String[] user : users){
            System.out.println(Arrays.toString(user));
        }
    }
}