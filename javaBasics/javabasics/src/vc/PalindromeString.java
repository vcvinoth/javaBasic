package vc;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        String reverseStr = "";
        for (int i = 0; i < str.length(); i++) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.equalsIgnoreCase(reverseStr))
            System.out.println("Given String is a Palindrome ");
        else
            System.out.println("Given String is not a Palindrome ");
    }
}
