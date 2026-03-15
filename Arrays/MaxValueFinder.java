package Arrays;

public class MaxValueFinder {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 80, 40, 80 };
        int max_val = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_val)
                max_val = arr[i];
        }
        System.err.println(max_val);
    }
}
