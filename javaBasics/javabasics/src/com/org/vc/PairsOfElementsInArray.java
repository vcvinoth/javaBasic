package com.org.vc;

public class PairsOfElementsInArray {
    public static void main(String[] args) {
        findPair(new int[]{4, 6, 5, -10, 8, 5, 20}, 10);
    }

    public static void findPair(int[] intArray, int givenNum) {
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = i + 1; j < intArray.length - 1; j++) {
                if (intArray[i] + intArray[j] == givenNum) {
                    System.out.println(intArray[i] + "," + intArray[j]);
                }
            }
        }
    }
}
