
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String name = sc.next();

        // System.out.println("Hello, " + name + "! Welcome to Java Programming.");
        // System.out.printf("Hello, %s! Welcome to Java Programming.", name);
        // When Space is there in input use nextLine()
        // String name = sc.nextLine();
        // System.out.printf("Hello, %s! Welcome to Java Programming.%n", name);
        // For integer input
        // System.out.println("Enter you Age:");
        // int age = sc.nextInt();
        // System.out.println("Your age is: " + age);
        // System.out.println("Hello, World! ");
        // int x = 42;
        // System.out.print(x);
        /* Printing Args; 


        Multi-line comment example



        Hello world Java 3 */
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        // System.out.println(args.length);
        // System.out.println(5 * 5);
        // System.out.println("1" + 1);
        // System.out.printf("This is a formatted number: %.2f%n", 5.56789);
        // int x = 10, y = 50, z = 100;
        // System.out.println(x  + y + z);
        // int x, y, z;
        // x = y = z = 50;
        // System.out.println(x + y + z); // 150
        // Format Specifiers
        // System.out.printf("Integer: %d%n", 100);
        // System.out.printf("%10s\n", "Java");
        // Printing Table:
        // System.out.printf("%-10s %-10s %-10s%n", "Name", "Age", "Salary");
        // System.out.printf("%-10s %-10d %-10.2f%n", "Ali", 25, 50000.5);
        // System.out.printf("%-10s %-10d %-10.2f%n", "Sara", 22, 45000.75);
        // System.out.println();
        //Most Common Confusion (⚠ Important)
        // Problem:
        // int age = sc.nextInt();
        // String name = sc.nextLine(); // BUG
        // Why problem hota hai?
        // nextInt() Enter key ka newline (\n) leave kar deta hai, jo nextLine() turant read kar leta hai.
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // buffer clear
        String name = sc.nextLine();

    }
}
