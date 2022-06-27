package odev;

import java.util.Scanner;

// Mükemmel Sayı = Kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit
// olan sayıdır.
public class MukemmelSayi {
	public static void print() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Mükemmel sayı kontrolü: ");
		
		mukemmelSayi(scanner.nextInt());
	}
	
	public static void mukemmelSayi(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		if (num == sum) {
			System.out.println(num + " Mükemmel sayidir.");
		} else {
			System.out.println(num + " Mükemmel sayi değil.");
		}
	}
	
}
