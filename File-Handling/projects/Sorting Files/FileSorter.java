package projects;

import java.io.File;
import java.util.Arrays;

public class FileSorter {

    public static void main(String[] args) {
        File dir = new File("projects");
        File[] files = dir.listFiles();
        File latest = files[files.length - 1];
        System.out.println("Latest: " + latest);

        Arrays.sort(files);
        for (File f : files) {
            System.out.println(f.getName());
        }
    }
}
