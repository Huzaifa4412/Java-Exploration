package Arrays;

public class SearchingArray {
    public static void main(String[] args) {
        // Array: [10,20,30,40,50]
        // Find: 30
        // int[] arr = { 10, 20, 30, 40, 50 };
        // int find = 30;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == find) {
        // System.err.println("Element found at index: " + i);
        // break;
        // } else {
        // System.err.println("Element not found");
        // }
        // }

        // // ! Count Occurrence of a Number
        // int[] arr = { 10, 20, 20, 50, 20, 30, 10, 20 };
        // int find = 20;
        // int count = 0;
        // for (int val : arr) {
        // if (val == find)
        // count++;

        // }
        // if (count > 0) {
        // System.err.println("The Occurrence of " + find + " Is " + count);
        // }

        int[] arr = { 10, 20, 20, 50, 20, 30, 10, 20 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.err.println("Find " + j);
                }
            }
        }

    }
}
