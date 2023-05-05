package org.lessons.java;

import java.util.Iterator;

public class snack2 {

	public static void main(String[] args) {
		String[] surnames = {"Lipa", "Hilton", "Agnelli", "Ax", "Totti", "Blasi", "Vio", "Zarei", "Maccherone"};
		String[] names = {"Dua", "Paris", "Manuel", "J", "Francesco", "Ilary", "Bebe", "Pardis", "Martina"};
		String[] list = new String[surnames.length];
		
		
		for (int i = 0; i < 9; i++) {
			double doubleRandomNumber = Math.random() * 9;
			 int ranName = (int)doubleRandomNumber;
			 
			 double doubleRandomNumber1 = Math.random() * 9;
			 int ranSurname = (int)doubleRandomNumber1;
			 
			 list[i] = names[ranName] + " " + surnames[ranSurname];
		}
		for (int i = 0; i <= list.length; i++) {
			System.out.println(list[i]);
		}
	}

}
