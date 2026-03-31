
import java.util.Scanner;

public class BinaryConvertor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int rem;
        String binary = "";

        while (num > 0) {
            rem = num % 2;
            num = num / 2;
            binary = rem + binary;
        }
        System.out.println(binary);
    }
}
