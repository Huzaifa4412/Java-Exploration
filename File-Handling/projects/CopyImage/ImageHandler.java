package projects.CopyImage;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageHandler {

    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream("input.jpg"); FileOutputStream fos = new FileOutputStream("output.png")) {
            byte[] buffer = new byte[8192];
            int bytes;

            while ((bytes = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytes);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}