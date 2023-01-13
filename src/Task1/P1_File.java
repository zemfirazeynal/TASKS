package Task1;

import java.io.*;
import java.util.Scanner;

public class P1_File {
    static String mainPath = "src/Task1/";


    public static void creatNewFile() {

        try {
            File file = new File(mainPath + "myFile.txt");
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void outputStream() throws IOException {

        Scanner sc = new Scanner(System.in);
        String data1 ="\n";
        String data2 = sc.nextLine();
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(P1_File.mainPath+"myFile.txt",true);

            byte[] bytes1 = data1.getBytes();
            byte[] bytes2 = data2.getBytes();

            fileOutputStream.write(bytes1);
            fileOutputStream.write(bytes2);
            fileOutputStream.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }

        FileInputStream inputStream = new FileInputStream(P1_File.mainPath+"myFile.txt");

        int i = inputStream.read();
        while (i!=-1){
            System.out.print((char)i);
            i = inputStream.read();
        }
    }
}
