package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		
		double pricePerKm = 0.21;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanti kilometri devi percorrere?");
		
		int userKm = sc.nextInt();
		
		double userPrice = userKm * pricePerKm; 
		System.out.println(userPrice);
		
		
		
	}
}
