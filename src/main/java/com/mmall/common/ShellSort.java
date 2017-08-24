package com.mmall.common;

import java.util.Arrays;

public class ShellSort {
    private static void shellsort2(int a[], int n) {
        int j, gap;
        for (gap = n / 2; gap > 0; gap /= 2)
            for (j = gap; j < n; j++)//从数组第gap个元素开始
                //每个元素与自己组内的数据进行直接插入排序
                if (a[j] < a[j - gap])
                {
                    int temp = a[j];
                    int k = j - gap;
                    while (k >= 0 && a[k] > temp)
                    {
                        a[k + gap] = a[k];
                        k -= gap;
                    }
                    a[k + gap] = temp;
                }
    }
    private static void shellsort3(int a[], int n)
    {
        int i, j, gap;

        for (gap = n / 2; gap > 0; gap /= 2)
            for (i = gap; i < n; i++)
                for (j = i - gap; j >=0 && a[j] > a[j + gap]; j -= gap){
                    int tmp=a[j];
                    a[j]=a[j + gap];
                    a[j+gap]=tmp;
                }

    }

    public static void main(String[] args) {
        int[] a = {34, 8, 64, 51, 32, 21, 72, 6, 57, 88};
        shellsort3(a, a.length);
        System.out.println(Arrays.toString(a));
    }

}
