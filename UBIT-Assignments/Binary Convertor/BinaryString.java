
import java.util.Scanner;

public class BinaryString {

    public static String BinaryStringConvertor(int num) {
        int rem;
        String str = "";

        while (num > 0) {
            rem = num % 2;
            num = num / 2;
            str = rem + str;
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number that you want to convert: ");
        int num = sc.nextInt();
        String res = BinaryStringConvertor(num);
        System.out.println("The Binary Conversion of Number " + num + " is " + res);
    }
}
