package com.qmm.javaword.process;

public class ArraySelectSort {
    /*
    选择排序
    是一种简单直接的排序算法.
    对于给定的一组记录,经过第一轮比较后得到最小的记录,然后将该记录与第一个记录的
    位置进行交换;接着对不包括第一一个记录以外的其他记录进行第二轮比较,得到最小的记录
    并于第二个记录进行位置交换,重复该过程,知道进行比较的记录只有一个时为止.
    例:数组[38,65,97,76,13,27,49]选择排序的步骤如下:
    第一趟排序后:13 [38,65,97,76,27,49]
    第二趟排序后:13 27 [38,65,97,76,49]
    第三趟排序后:13 27 38 [65,97,76,49]
    第四趟排序后:13 27 38 49 [65,97,76]
    第五趟排序后:13 27 38 49 65 [97,76]
    第六趟排序后:13 27 38 49 65 76 [97]
    最后排序结果:13 27 38 49 65 76 97
     */
    public static void main(String[] args){
        int a[] ={38,65,97,76,13,27,49};
        selectSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
    public static void selectSort(int[] a){
        int i;
        int j;
        int temp = 0;
        int f = 0;
       // int n = a.length;
        for(i = 0; i<a.length; i++){
            temp = a[i];
            f = i;
            for(j=i+1;j<a.length;j++){
                if(a[j] < temp){
                    temp = a[j];
                    f = j;
                }
            }
            if(f !=i){
                a[f] = a[i];
                a[i] = temp;
            }
        }
    }
}
