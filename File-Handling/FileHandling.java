import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("output.txt");

        while (true) {
            String input = sc.nextLine();

            if (input.equals("")) {
                break;
            }

            fw.write(input + "\n");
        }

        fw.close();
        sc.close();
    }
}