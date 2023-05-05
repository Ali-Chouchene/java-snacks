package org.lessons.java;

public class snack7 {
	public static void main(String[] args) {
		int num = 0;
		do {
			 double doubleRandomNumber1 = Math.random() * 100;
			 int ranNum = (int)doubleRandomNumber1;
			 num = ranNum;
			 System.out.println(ranNum);
		}while((num % 15) == 0);
		System.out.println(num);
	}
}
