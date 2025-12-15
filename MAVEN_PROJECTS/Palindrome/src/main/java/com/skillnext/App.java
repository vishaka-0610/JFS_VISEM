package com.skillnext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
         int num = 121;   // <<< Built-in input. Change this value.
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        if (original == reverse)
            System.out.println(original + " is a Palindrome");
        else
            System.out.println(original + " is NOT a Palindrome");
    }
}
