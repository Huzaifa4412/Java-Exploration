import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader(
                    "D:\\code play ground\\Java Playground\\Java-Exploration\\File-Handling\\ReadFileSales.txt");

            Scanner sc = new Scanner(fr);
            String line;

            while (sc.hasNextLine()) {
                line = sc.nextLine();
                System.out.println(line);
            }

            sc.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}