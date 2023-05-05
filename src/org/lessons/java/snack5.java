package org.lessons.java;

import java.util.Scanner;

public class snack5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quanti numeri vuoi estrarre?");
		String numberS = input.nextLine();
		input.close();
		
		int number = Integer.parseInt(numberS);
		int tot = 0;
		int totP =0;
		int totD = 0;
		int minN = 100;
		int maxN = 0;
		for (int i = 0; i < number; i++) {
			 double doubleRandomNumber1 = Math.random() * 100;
			 int ranNum = (int)doubleRandomNumber1;
			 tot += ranNum;
			 if(ranNum % 2 == 0) {  
				 totP += ranNum;
				 }else {
					 totD += ranNum;
			 }if(ranNum < minN) {
				 minN = ranNum;
			 }if(ranNum > maxN) {
				 maxN = ranNum;
			 }
			 
			 
		}
System.out.println("somma numeri random " + tot);
System.out.println("somma numeri random pari " + totP);
System.out.println("media somma numeri " + (tot / number));
System.out.println("media somma numeri dispari " + (totD / number));
System.out.println("numero piu basso " + minN);
System.out.println("numero piu alto " + maxN);
	}

}
