package basic.com.vc;

import java.util.Arrays;

public class SeparateZerosFromNonZeros {
    public static void main(String[] args) {
        moveZerosToFront(new int[] {12, 0, 7, 0, 8, 0, 3});
    }
    public static void moveZerosToFront(int[] intArray){
        int counter = intArray.length-1;
        for(int i=0;i<intArray.length-1;i++){
            if(intArray[i] != 0){
                intArray[counter] = intArray[i];
                counter--;
            }
        }
        while (counter >= 0){
            intArray[counter] = 0;
            counter--;
        }
        System.out.println(Arrays.toString(intArray));
    }
}
