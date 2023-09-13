package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		
		double pricePerKm = 0.21;
		
		Scanner sc = new Scanner(System.in);
		
		//set user price
		System.out.println("Quanti kilometri devi percorrere?");
		
		int userKm = sc.nextInt();
		double userPrice = userKm * pricePerKm; 
		
		//set discount 
		
		System.out.println("Quanti anni hai?");
		int userAge = sc.nextInt(); 
		
		if( userAge < 18 ) {
			userPrice = userPrice - ((userPrice / 100) * 20); 
		} else if (userAge > 65) {
			userPrice = userPrice - ((userPrice / 100) * 40);
		}		
		
		System.out.println("Il prezzo del biglietto è: €" + String.format("%.02f", userPrice));
	}
}
