package Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Methods {
    public static void menu() {
        System.out.println("Press 1 to write text to file");
        System.out.println("Press 2 to empty inside file");
        System.out.println("Press 3 to delete the file");
        System.out.println("Press 4 to exit");
    }

    public static void empty() throws FileNotFoundException {
        FileOutputStream outputStream = new FileOutputStream(P1_File.mainPath + "myFile.txt");
    }

    public static void deleteFile() {

        File file = new File(P1_File.mainPath + "myFile.txt");
        if (!file.exists())
            throw new IllegalArgumentException("File not found!  "
                    + file.getAbsolutePath());

        else if(file.delete()) {
            System.out.println("File Deleted Successfully");
        }
    }
}