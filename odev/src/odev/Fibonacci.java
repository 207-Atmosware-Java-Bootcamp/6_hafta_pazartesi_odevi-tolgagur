
package odev;
import java.util.Scanner;

import java.util.Scanner;

public class Fibonacci {


    public static void print() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir fibonacci sayısı giriniz : ");
        fibonacci(scanner.nextInt());
        System.out.println();
        System.out.println("re fibonacci");
        System.out.println(reFibonacci(scanner.nextInt()));
    }

    public static int reFibonacci(int i){
        if (i<=1){

            return i;
        }else{
            return reFibonacci(i-1) + reFibonacci(i-2);
        }

    }

    public static void fibonacci(int number) {
        int i = 1, firstTerm = 0, secondTerm = 1;
        while (i <= number) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            i++;
        }
    }
}