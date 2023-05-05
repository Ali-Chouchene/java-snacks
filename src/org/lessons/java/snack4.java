package org.lessons.java;
import java.util.Scanner;
public class snack4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String parola;
	

		System.out.print("Inserire una parola: ");
		parola = input.next();		

		input.close();
		
		if (parola.charAt(0) == parola.charAt(parola.length() - 1))
			System.out.println("La parola è palindroma");
		else
			System.out.println("La parola non è palindroma");
	}
		
		
	}
	
	
	
