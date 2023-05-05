package org.lessons.java;

import java.util.Arrays;

public class snack8 {

	public static void main(String[] args) {
		int pari[] = new int[10];
		int dispari[] = new int[10];
		int numbers[] = new int[10];
		int countPari = 0;
		int countDispari = 0;
		for (int i = 0; i < 10; i++) {
			double doubleRandomNumber1 = Math.random() * 100;
			 int ranNum = (int)doubleRandomNumber1;
			 System.out.println(ranNum);
			 numbers[i] = ranNum; 
			 
		}
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]% 2 == 0) {
				pari[countPari] = numbers[i];
				countPari++;
			}else {
				dispari[countDispari] = numbers[i];
				countDispari++;
			}
		}
		System.out.println(Arrays.toString(pari)); 
		System.out.println(Arrays.toString(dispari)); 
	}

}
