package odev;

import java.util.Scanner;

public class Palindrom {
	
	public static void isPoligrom(String str) {
		StringBuilder strP = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			strP.append(str.charAt(i));
			
		}
		System.out.println(str.equals(strP.toString()) ? "poligrom" : "poligrom degil");
	}
	
	public static void print() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Palindrom kelime kontrolü: ");
		
		isPoligrom(scanner.nextLine());
	}
	
}
