package Task1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class P1_Task {
    public static void main(String[] args) throws IOException {
       //1_File.creatNewFile();

        Scanner scn = new Scanner(System.in);

        int a;

        do {
            Methods.menu();

            a = scn.nextInt();
            switch (a){
                case 1:

                    P1_File.outputStream();
                    System.out.println(" ");
                    break;

                case 2:
                    Methods.empty();
                    System.out.println("Text deleted");
                    System.out.println(" ");
                    break;
                case 3:
                    Methods.deleteFile();
                    System.out.println(" ");
                case 4:
                    System.exit(a);
                    break;
                default:
                    System.out.println("Invalid number");
                    System.out.println("Try again");
            }
        } while (a!=4);
    }
}
