package Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = { 10, 20, 30 };
        for (int val : arr) {
            sum += val;
        }
        System.err.println(sum);
    }
}
