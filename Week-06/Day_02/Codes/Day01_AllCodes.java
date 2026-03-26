import java.util.*;

public class Day01_AllCodes {

    // 🔵 Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 🟢 Selection Sort
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

    // 🟡 Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    // 🔴 Pivot Index (Prefix Sum)
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - nums[i] - leftSum;

            if (leftSum == rightSum)
                return i;

            leftSum += nums[i];
        }

        return -1;
    }

    // 🔵 Helper function to print array
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // 🚀 MAIN FUNCTION (for testing)
    public static void main(String[] args) {

        int[] arr1 = { 5, 3, 1, 4, 2 };

        // Bubble Sort
        int[] b1 = arr1.clone();
        bubbleSort(b1);
        System.out.print("Bubble Sort: ");
        printArray(b1);

        // Selection Sort
        int[] b2 = arr1.clone();
        selectionSort(b2);
        System.out.print("Selection Sort: ");
        printArray(b2);

        // Insertion Sort
        int[] b3 = arr1.clone();
        insertionSort(b3);
        System.out.print("Insertion Sort: ");
        printArray(b3);

        // Pivot Index
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        int pivot = pivotIndex(nums);
        System.out.println("Pivot Index: " + pivot);
    }
}