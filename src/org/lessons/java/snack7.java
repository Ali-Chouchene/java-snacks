package org.lessons.java;

import java.util.Random;

public class snack7 {
	public static void main(String[] args) {
		Random rand = new Random();
		while(true) {
			int ranNum = rand.nextInt(101);
			System.out.println(ranNum);
			if(ranNum % 15 == 0) {
				return;
			}
			 
		}
		
	}
}
