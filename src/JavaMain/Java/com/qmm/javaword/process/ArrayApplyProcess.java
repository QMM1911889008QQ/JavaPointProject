package com.qmm.javaword.process;

import java.util.Arrays;

public class ArrayApplyProcess {
    public static void main(String[] args){
        /*
        数组声明时未进⾏赋值时，对于基本数据类型，将每⼀个元素赋值为⼆进制0；
        ⽽对于 引⽤类型，则将每⼀个元素赋值为 null。
         */
        int[] i = new int[3];
        String[] s = new String[3];
        Integer[] g = new Integer[3];
        Boolean[] b = new Boolean[3];
        Double[] d = new Double[3];
        System.out.println(i[1]);//0
        System.out.println(g[1]);//null
        System.out.println(s[1]);//null
        System.out.println(b[1]);//null
        System.out.println(d[1]);//null

        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums,9)));

        int[] n = {1,2,3,4,5,6,7,8,9,10};
        plus1ForEventIndex(n);
        System.out.println(Arrays.toString(n)); //执⾏结果：[1, 3, 3, 5, 5, 7, 7, 9, 9, 11]
    }

    /*
    给定一个整数数组nums和一个目标值target,在该数组中找出和为目标值的那
    两个整数,并返回他们的数组下标.
    可以假设每种输入只会对应一个答案,但是,不能重复利用这个数组中同样的元素
     给定nums = [2,7,11,15],target = 9
     因为 nums[0] + nums[1] = 2+7 =9
     所以返回[0,1]
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int start = 0; start < nums.length - 1; start++) {
            for (int secondNumStart = start + 1; secondNumStart < nums.length; secondNumStart++) {
                if (nums[start] + nums[secondNumStart] == target) {
                    arr[0] = start;
                    arr[1] = secondNumStart;
                    return arr;
                    //return new int[]{start, secondNumStart};
                }
            }
        }
        return arr;
        //return null;
    }

    /*
    Java方法参数是值传递,方法得到的是参数的拷贝,所以方法内代码不会改变
    所传参数的值,但对于引用类型,虽然不能改变引用类型的引用,却可以修改
    引用类型指向的对象的值.
     */
    private static void plus1ForEventIndex(int[] arr){
        for(int index = 0;index < arr.length;index++){
            if((index + 1)%2 == 0){
                arr[index] = arr[index] + 1;
            }
        }
    }
}

