package org.lessons.java;

public class snack3 {

	public static void main(String[] args) {
		int[] numbers = {2, 6 , 5, 7, 9, 22, 11};
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if((i % 2)!= 0) {
				sum += numbers[i];
			}
		}
System.out.println(sum);
	}

}
