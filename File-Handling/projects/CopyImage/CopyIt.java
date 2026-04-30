package projects.CopyImage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyIt {

    static void copy_itms(File file, String type) {

        int bufferValue = 0;

        switch (type) {
            case "image":
                bufferValue = 8192;
                break;
            case "video":
                bufferValue = 20000;
                break;
            case "pdf":
                bufferValue = 5000;
                break;
        }

        try (
                FileInputStream fis = new FileInputStream(file);) {

            String fileName = file.getName();
            String ext = "";
            int dotIdx = fileName.lastIndexOf(".");
            System.out.println(dotIdx);
            ext = fileName.substring(dotIdx, fileName.length());

            FileOutputStream fos = new FileOutputStream("output" + ext);

            byte[] buffer = new byte[bufferValue];
            int bytes;

            while ((bytes = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytes);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        try {
            // File file = new File("Untitled design.png"); //? Copy Image
            // copy_itms(file, "image");

            // File file = new File("pdf.pdf"); //? Copy PDF
            // copy_itms(file, "pdf");
            File file = new File("video.mp4"); //? Copy Video
            copy_itms(file, "video");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
