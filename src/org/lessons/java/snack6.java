package org.lessons.java;

import java.util.Scanner;

public class snack6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire limite numerico");
		String numberS = input.nextLine();
		input.close();
		
		int number = Integer.parseInt(numberS);
		int tot = 0;
		
		do {
			 double doubleRandomNumber1 = Math.random() * 100;
			 int ranNum = (int)doubleRandomNumber1;
			 System.out.println(ranNum);
			 tot += ranNum;
		}while(tot <= number);
		System.out.println("la somma dei numeri estratti: " + tot);
	}

}
