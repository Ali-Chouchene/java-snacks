package org.lessons.java;

import java.util.Scanner;

public class snack1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digita un numero");
		String numberS = input.nextLine();
		input.close();
		int number = Integer.parseInt(numberS);
		if((number % 2) == 0) {
			System.out.println("il numero " +number + " è pari");
		}else {
			System.out.println("il numero pari sucessivo "+ (number + 1 ));
		}
	}

}
