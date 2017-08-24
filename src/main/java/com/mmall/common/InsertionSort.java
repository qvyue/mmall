package com.mmall.common;

import java.util.Arrays;

public class InsertionSort {
    private static void insertionSort(int[] a){
        int j;
        for (int p=1;p<a.length;p++){
            int tmp=a[p];
            for (j=p;j>0&&tmp<a[j-1];j--){
                a[j]=a[j-1];
            }
            a[j]=tmp;
        }
    }
    public static void main(String[] args) {
        int[] a={34,8,64,51,32,21};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
