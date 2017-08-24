package com.mmall.common;

public class QuickSort {
    private static void quick_sort(int s[], int l, int r) {
        if (l < r) {
            int i = l, j = r, x = s[l];
            while (i < j) {
                while (i < j && s[j] >= x) {
                    j--;
                }
                if (i < j) {
                    s[i++] = s[j];
                }
                while (i < j && s[i] < x) {
                    i++;
                }
                if (i < j) {
                    s[j--] = s[i];
                }
            }
            s[i] = x;
            quick_sort(s, i + 1, r);
            quick_sort(s, l, i - 1);
        }
    }
    public static void main(String[] args) {
        int[] s = {72, 6, 57, 88, 88, 42, 83, 57, 6, 72};
        quick_sort(s, 0, s.length - 1);
        for (int value : s) {
            System.out.print(value + " ");
        }
    }
}
