package com.skillnext;

/**
 * Hello world!
 *
 */

public class Fibbonacciseries {
    public static void main(String[] args) {
         int n = 10;   

        long a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }    
    }
}
