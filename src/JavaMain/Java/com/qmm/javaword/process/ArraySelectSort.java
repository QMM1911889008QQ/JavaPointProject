package com.qmm.javaword.process;

public class ArraySelectSort {
    public static void main(String[] args){
        int i ;
        int a[] ={38,65,97,76,13,27,49};
        selectSort(a);
        for(i=0;i<a.length;i++){
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
