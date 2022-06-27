package odev;

import java.util.Scanner;

public class AsalSayi {
	public static int isPrime(int num, int i) {
		
		if (i == 1)
			return 1;
		else if (num % i == 0)
			return 0;
		else
			return isPrime(num, i - 1);
	}
	
	public static void print() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Asal sayı kontrolü: ");
		
		int num = scanner.nextInt();
		
		if (isPrime(5, 4 / 2) == 1) {
			System.out.println(num + " -> asal");
		} else {
			System.out.println(num + " -> asal degil");
		}
	}
	
}
