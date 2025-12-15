package com.skillnext;

/**
 * Hello world!
 *
 */
public class App 
{
 
    public static void main(String[] args) {

        int n = 29;   
        if (n <= 1) {
            System.out.println("Not Prime");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");
    }

}
