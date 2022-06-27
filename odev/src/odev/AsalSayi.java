package odev;

import java.util.Scanner;

public class AsalSayi {
	public static int isPrimeRe(int num, int i) {
		
		if (i == 1)
			return 1;
		else if (num % i == 0)
			return 0;
		else
			return isPrime(num, i - 1);
	}
	public static String isPrimse(int num) {

		for (int j = 2; j < num/2; j++) {
			if (num%2==0)
				return "asal degil";
		}
		return "asal";
	}
	
	public static void print() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Asal sayı kontrolü: ");
		
		int num = scanner.nextInt();
		
		if (isPrimeRe(num, num / 2) == 1) {
			System.out.println(num + " -> asal");
		} else {
			System.out.println(num + " -> asal degil");
		}

		System.out.print("Asal sayı kontrolü : ");
		System.out.println("---");
		System.out.println(isPrimse(scanner.nextInt()));
	}
	
}
