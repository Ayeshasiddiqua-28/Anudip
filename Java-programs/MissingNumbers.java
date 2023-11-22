package Javabasics;
import java.util.Arrays;

public class MissingNumbers {

    static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int totalSum = n * (n + 1) / 2;
        int currentSum = 0;

        for (int num : arr) {
            currentSum += num;
        }

        return totalSum - currentSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3,  5, 6, 7, 8, 9};

       // Print the array
        System.out.println("The given array is: " + Arrays.toString(arr));

       // Find the missing number
        int missingNumber = findMissingNumber(arr);

        System.out.println("The missing number is: " + missingNumber);
    }
}

