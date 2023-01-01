package com.org.vc;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int number = sc.nextInt();
        int origNum = number;
        int reverse = 0;
        while (number > 0) {
            int remainder = number % 10;
            reverse = (reverse * 10) + remainder;
            number = number / 10;
        }
        if (reverse == origNum)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

    }
}
