package com.qmm.javaword.process;

import java.util.Arrays;

public class ArrayInsertSort {
    /*
    对于给定的一组记录,初始时假设第一个记录自成一个有序序列,其余记录为无序序列,其余记录为
    无序序列.接着从第二个记录开始,按照记录的大小依次将当前处理的记录插入到其之前的有序序列
    中,直至最后一个记录插入到有序序列中为止.
    例:数组[38,65,97,76,13,27,49]插入排序的步骤如下:
    第一趟插入38后:[38] 65,97,76,13,27,49
    第二趟插入65后:[38,65],97,76,13,27,49
    第三趟插入97后:[38,65,97],76,13,27,49
    第四趟插入76后:[38,65,76,97],13,27,49
    第五趟插入13后:[13,38,65,76,97],27,49
    第六趟插入27后:[13,27,38,65,76,97],49
    第七趟插入49后:[13,27,38,49,65,76,97]
    最后排序结果:[13,27,38,49,65,76,97]
     */
    public static void main(String[] args){
        int a[] ={38,65,97,76,13,27,49};
        insertSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void insertSort(int[] a){
        if(a != null){
            for(int i = 1;i<a.length;i++){
                int temp = a[i],j=i;
                if(a[j-1] > temp){
                    while(j >= 1 && a[j-1] > temp){
                        a[j] = a[j-1];
                        j--;
                        a[j] = temp;
                    }
                }
            }
        }
    }
}
