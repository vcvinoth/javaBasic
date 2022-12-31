package basic.com.vc;

public class FindMissingNumInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        findMissingNum(arr, 7);
    }

    public static void findMissingNum(int[] arr, int length) {
        int actualSum = 0;
        for (int n : arr) {
            actualSum = actualSum + n;
        }
        int expectedSum = (length * (length + 1)) / 2;
        System.out.println("Missed number : " + (expectedSum - actualSum));
    }
}
