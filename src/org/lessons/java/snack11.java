package org.lessons.java;

import java.util.Scanner;

public class snack11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digita un numero");
		String numberS = input.nextLine();
		input.close();
		int number = Integer.parseInt(numberS);

		for (int i = 1; i < number; i++) {
			if((number % i)== 0) {
				System.out.println(i);
			}
		}


	}

}
