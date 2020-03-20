package com.qmm.javaword.process;

import java.util.Arrays;

public class ArrayBubbleSort {
    /*
    冒泡排序就是整个过程就像气泡一样往上升,单向冒泡排序(假设由小到大排序):
    对于给定的记录大于后面的记录时,交换位置,进行一轮比较和换位后,n个记录中的
    最大记录将位于第n位;然后对前(n-1)个记录进行第二轮比较;重复该过程直到进行比较的记录
    只剩下一个为止.
    例:数组[36,25,48,12,25,65,43,57]冒泡排序的步骤如下:
    第一趟排序后:[25,36,12,25,48,43,57,65]
    第二趟排序后:[25,12,25,36,43,48],57,65
    第三趟排序后:[12,25,25,36,43],48,57,65
    第四趟排序后:[12,25,25,36],43,48,57,65
    第五趟排序后:[12,25,25],36,43,48,57,65
    第六趟排序后:[12,25],25,36,43,48,57,65
    第七趟排序后:[12],25,25,36,43,48,57,65
     */
    public static void bubbleSort(int [] array){
        int i,j,tmp;
        int len = array.length;
        for(i=0; i <len - 1;++i){
            for(j = len-1; j > i; --j){
                if(array[j] < array[j-1]){
                    tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }
        }
    }
    public static void main(String[] args){
        int a[] ={5,4,9,8,7,6,0,1,3,2};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}