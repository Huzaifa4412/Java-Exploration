
import java.io.File;

public class CreateFile {

    public static void main(String[] args) {
        File file = new File("data.txt");
        File file2 = new File("output.txt");
        try {

            // file.createNewFile(); // To create File
            if (file.createNewFile()) {
                System.out.println("New File Created");

            } else {
                System.out.println("File Already Exists");
            }

            //? Info
            System.out.print("File Name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Is File Exits: " + file.exists());
            System.out.println("File Characters: " + file.length());
            System.out.println(file.compareTo(file2));

        } catch (Exception ec) {
            System.out.println(ec.getMessage());
        }
    }
}
