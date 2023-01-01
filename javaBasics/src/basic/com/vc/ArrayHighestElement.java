package basic.com.vc;

public class ArrayHighestElement {
    public static void main(String[] args) {
        int[] intArray = {2, 9, 5, 6, 8, 7};
        System.out.println("Second Max  : " + findSecondMax(intArray));
        System.out.println(" Nth Max : " +findNthMax(intArray,4));
    }

    public static int findSecondMax(int[] intArray) {
        int firstMax = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int currentNum : intArray) {
            if (currentNum > firstMax) {
                secMax = firstMax;
                firstMax = currentNum;
            } else if (currentNum > secMax) {
                secMax = currentNum;
            }
        }
        return secMax;
    }

    public static int findNthMax(int[] intArray, int pos) {
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
        return intArray[intArray.length - pos];
    }

}
