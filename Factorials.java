import java.util.Scanner;

class Factorials {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double a = inp.nextDouble(); // 5
        System.out.print("Enter the power: ");
        int b = inp.nextInt(); // 3
        double r = a;
        while (b > 1) {
            r = r * a;
            b--;
        }
        System.out.println("Result: " + r);
    }
}