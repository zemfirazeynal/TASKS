package self;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;

        for (int i = 1; i <a; i++) {
            for (int j = 1; j<i; j++) {
                if (i%j==0){
                    count++;
                    if (count==2){
                        System.out.print(i+" ");
                    }
                }
            }
        }
    }
}