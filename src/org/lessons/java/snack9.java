package org.lessons.java;

import java.util.Scanner;

public class snack9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("base");
		String baseS = input.nextLine();
		System.out.println("altezza");
		String altezzaS = input.nextLine();
		input.close();
		
		int base = Integer.parseInt(baseS);
		int altezza = Integer.parseInt(altezzaS);
		int perimetro = (2 * base) + (2 * altezza);
		System.out.println("area: " + (base * altezza));
		System.out.println("perimetro: " + perimetro);
	}

}
