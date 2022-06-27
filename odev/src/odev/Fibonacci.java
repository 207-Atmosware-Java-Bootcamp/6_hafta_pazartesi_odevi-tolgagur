
package odev;
import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {

    public static void print() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir fibonacci sayısı giriniz : ");
        fibonacci(scanner.nextInt());
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