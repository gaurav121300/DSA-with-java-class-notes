import java.util.*;

public class ArrayDay3 {

    // 🔹 1. Maximum element
    public static void maxElement() {
        int[] arr = {10, 20, 90, 50};

        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Max = " + max);
    }

    // 🔹 2. Minimum element
    public static void minElement() {
        int[] arr = {5, 4, 11, 8, 60, 10};

        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Min = " + min);
    }

    // 🔹 3. Reverse Print (no change in array)
    public static void reversePrint() {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Reverse Print:");
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 🔹 4. Reverse Array (two pointer)
    public static void reverseArray() {
        int[] arr = {1, 2, 3, 4, 5};

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reversed Array:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 🔹 5. Reverse part of array (index l to r)
    public static void reversePart() {
        int[] arr = {10,20,30,40,50,60,70};

        int left = 2;
        int right = 5;

        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Partial Reverse:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 🔹 6. Running Sum
    public static void runningSum() {
        int[] nums = {1,2,3,4};

        for(int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        System.out.println("Running Sum:");
        for(int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 🔹 7. Reverse String
    public static void reverseString() {
        char[] s = {'h','e','l','l','o'};

        int left = 0;
        int right = s.length - 1;

        while(left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reversed String:");
        for(char c : s) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    // 🔹 8. Count numbers with even digits
    public static void evenDigitCount() {
        int[] nums = {12, 345, 2, 6, 7896};
        int count = 0;

        for(int num : nums) {
            int digits = 0;
            int n = num;

            while(n > 0) {
                digits++;
                n = n / 10;
            }

            if(digits % 2 == 0) {
                count++;
            }
        }

        System.out.println("Even digit numbers: " + count);
    }

    // 🔹 MAIN
    public static void main(String[] args) {

        maxElement();
        minElement();
        reversePrint();
        reverseArray();
        reversePart();
        runningSum();
        reverseString();
        evenDigitCount();
    }
}
