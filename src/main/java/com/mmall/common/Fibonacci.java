package com.mmall.common;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fib(8);
        System.out.println(result);
    }

    private int fib(int index) {
        if (index == 1 || index == 2) {
            return 1;
        } else {
            return fib(index - 1) + fib(index - 2);
        }
    }
}
