
import java.util.Scanner;

public class BinaryReturn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number that you want to convert: ");
        int num = sc.nextInt();
        int count = 0;
        int temp = 0;
        temp = num;

        while (temp > 0) {
            temp = temp / 2;
            count++;
        }
        int[] binary = new int[count];

        int[] result = BinaryConvertor(num, binary, count);

        for (int val : result) {
            System.out.println(val);
        }

    }

    public static int[] BinaryConvertor(int num, int[] binary, int count) {
        int rem;
        int index = count - 1;

        while (num > 0) {
            rem = num % 2;
            num /= 2;
            binary[index] = rem;
            index--;
        }

        return binary;

    }
}
