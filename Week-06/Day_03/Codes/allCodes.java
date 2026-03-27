import java.util.*;

public class allCodes {

    // 🔵 1. Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // 🟢 2. Move Zeroes
    public static void moveZeroes(int[] nums) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }

    // 🟡 3. Sort 0,1,2 (Counting Approach)
    public static void sortColors(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else count2++;
        }

        int index = 0;

        for (int i = 0; i < count0; i++) nums[index++] = 0;
        for (int i = 0; i < count1; i++) nums[index++] = 1;
        for (int i = 0; i < count2; i++) nums[index++] = 2;
    }

    // 🔴 4. Maximum Subarray (Kadane)
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            maxSum = Math.max(maxSum, sum);

            if (sum < 0) sum = 0;
        }

        return maxSum;
    }

    // 🟣 5. Maximum Subarray (Brute Force - for teaching)
    public static int maxSubArrayBrute(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    // 🔵 Helper function
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // 🚀 MAIN METHOD (Testing)
    public static void main(String[] args) {

        // Selection Sort
        int[] arr1 = {5, 3, 1, 4, 2};
        selectionSort(arr1);
        System.out.print("Selection Sort: ");
        printArray(arr1);

        // Move Zeroes
        int[] arr2 = {0, 1, 0, 3, 12};
        moveZeroes(arr2);
        System.out.print("Move Zeroes: ");
        printArray(arr2);

        // Sort Colors
        int[] arr3 = {2, 0, 2, 1, 1, 0};
        sortColors(arr3);
        System.out.print("Sort Colors: ");
        printArray(arr3);

        // Maximum Subarray (Kadane)
        int[] arr4 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max Subarray (Kadane): " + maxSubArray(arr4));

        // Maximum Subarray (Brute)
        System.out.println("Max Subarray (Brute): " + maxSubArrayBrute(arr4));
    }
}