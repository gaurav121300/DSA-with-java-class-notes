public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++) {

            for(int j = 0; j < arr.length - i - 1; j++) {

                if(arr[j] > arr[j + 1]) {

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 1, 4, 2};

        bubbleSort(arr);

        System.out.print("Sorted Array:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
