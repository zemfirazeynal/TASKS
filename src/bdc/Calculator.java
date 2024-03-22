package bdc;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator started..");
        int choice;
        int operation;
        int usingCount=0;

        do {
            if(usingCount==0) {
                System.out.println("1.Start"+"\n"
                        +"0.Exit");
            }else{
                System.out.println("1.Continue"+"\n"
                        +"0.Exit");
            }
            choice = sc.nextInt();
            if(choice == 1 ){
                System.out.println("Enter the operation"+ "\n"
                        +"Operations include:"+"\n"
                    + "1.+"  +"\n"
                    + "2.-" +"\n"
                    + "3.*" +"\n"
                    + "4./" );

                operation = sc.nextInt();
                System.out.println("Enter the numbers..");

                System.out.println("Enter the first number:");
                double a = sc.nextDouble();

                System.out.println("Enter the second number:");
                double b = sc.nextDouble();

                calculate(operation, a, b);
            }
            usingCount++;
        } while (choice != 0);
    }


    public static void calculate(int operation, double a, double b) {

        switch (operation) {
            case 1:
                System.out.println(sum((int) a,b));
                break;
            case 2:
                System.out.println(subtract(a,b));
                break;
            case 3:
                System.out.println(multiply(a, b));
                break;
            case 4:
                System.out.println(divide(a, b));
                break;
            case 0:
                System.out.println("Proses dayandi");
                break;
            default:
                System.out.println("The operation was not entered correctly!");
        }

    }

    public static double sum(double a, double b) {
        return a+b;
    }

    public static double subtract(double a, double b) {
        return a-b;
    }
    public static double multiply(double a, double b) { return a * b;
    }
    public static double divide(double a, double b) {
        if(b==0){
            return Double.NaN;
        }else {
            return a/b;
        }
    }
}
