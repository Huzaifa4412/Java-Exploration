import java.util.Scanner;

public class InoutOutput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = sc.next();

        System.out.print("Enter your Age: ");
        Byte age = sc.nextByte();

        System.out.print("Enter your Salary: ");
        float salary = sc.nextFloat();

        System.out.print("Enter your Grade: ");
        char grade = sc.next().charAt(0);

        System.out.println("Output\n");
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(grade);

    }
}
