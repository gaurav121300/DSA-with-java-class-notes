import java.util.*;

public class ArrayBasics {

    // 🔹 1. Taking input in array
    public static void takeInput() {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array is:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 🔹 2. Swap in array
    public static void swapExample() {
        int[] arr = {10, 20, 30, 40};

        int i = 0, j = 3;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        System.out.println("After swapping:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 🔹 3. Linear Search
    public static void linearSearch() {
        int[] arr = {40, 60, 90, 170, 30};
        int key = 50;
        boolean found = false;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                System.out.println("Found at index: " + i);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Not Found");
        }
    }

    // 🔹 4. Sum of array
    public static void sumOfArray() {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }

    // 🔹 5. Maximum element
    public static void maxElement() {
        int[] arr = {20, 50, 10, 80, 100};

        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum = " + max);
    }

    // 🔹 6. Pass by value vs reference
    public static void changeArray(int[] arr) {
        arr[0] = 100;  // changes original array
    }

    public static void changeValue(int x) {
        x = 50; // does NOT change original
    }

    public static void passByDemo() {
        int[] arr = {1, 2, 3};
        changeArray(arr);

        System.out.println("Array after change:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int a = 10;
        changeValue(a);
        System.out.println("Value of a: " + a);
    }

    // 🔹 MAIN METHOD
    public static void main(String[] args) {

        takeInput();
        swapExample();
        linearSearch();
        sumOfArray();
        maxElement();
        passByDemo();
    }
}

