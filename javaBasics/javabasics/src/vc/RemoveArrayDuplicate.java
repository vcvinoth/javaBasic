package vc;

import java.util.Arrays;

public class RemoveArrayDuplicate {
    public static void main(String[] args) {
        int[] intArray = {1, 3, 3, 4, 2, 5, 5};
        int[] arrWithoutDuplicate = new int[5];
        // sort array in asc order
        sortArrayAsc(intArray);
        System.out.println("After Sorting Array: ");
        printArray(intArray);
        // remove duplicates
        removeDuplicateWithoutCollectionMethods(intArray, arrWithoutDuplicate);
        System.out.println("Removing duplicates without Util methods: ");
        printArray(arrWithoutDuplicate);
        // Using java 8
        System.out.println("Removing duplicates using JAVA 8: ");
        Arrays.stream(intArray).distinct().forEach(System.out::println);
    }

    private static void printArray(int[] intArray) {
        for (int num : intArray) {
            System.out.println(num);
        }
    }

    private static void removeDuplicateWithoutCollectionMethods(int[] intArray, int[] arrWithoutDuplicate) {
        int j = 0;
        for (int i = 0; i < intArray.length - 1; i++) {
            if (intArray[i] != intArray[i + 1]) {
                arrWithoutDuplicate[j++] = intArray[i];
            }
        }
        arrWithoutDuplicate[j++] = intArray[intArray.length - 1];
    }

    private static void sortArrayAsc(int[] intArray) {
        int temp;
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = i + 1; j < intArray.length - 1; j++) {
                if (intArray[i] > intArray[j]) {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }
}
