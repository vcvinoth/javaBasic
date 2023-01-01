package vc;

import java.util.Arrays;

public class FindMaxAndMinArr {

    public static void main(String[] args) {
        int[] intArr = {2, 4, 7, 3, 5, 9};
        // find min & max without using collection utility methods
        System.out.println(" Min & Max without using Util methods :");
        findMaxAndMin(intArr);
        // using java 8 stream
        System.out.println(" Min & Max without using Java 8 :");
        System.out.println(" Max Element in Array is :" +Arrays.stream(intArr).max().getAsInt());
        System.out.println(" Min Element in Array is :" +Arrays.stream(intArr).min().getAsInt());
    }

    public static void findMaxAndMin(int[] arr) {
        int minimum = arr[0];
        int maximum = arr[0];
        for (int num : arr) {
            minimum = (minimum < num) ? minimum : num;
            maximum = (maximum > num) ? maximum : num;
        }
        System.out.println(" Max Element in Array is :" + maximum);
        System.out.println(" Min Element in Array is :" + minimum);
    }
}
