package org.lessons.java;

import java.util.Scanner;

public class snack10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("raggio");
		String raggioS = input.nextLine();
	
		input.close();
		
		int raggio = Integer.parseInt(raggioS);
		
		double area = raggio * raggio * 3.14;
	    double perimetro = 2 * raggio * 3.14;
		
		System.out.println("area: " + String.format("%.2f", area));
		System.out.println("perimetro: " + String.format("%.2f", perimetro));
	}

}
