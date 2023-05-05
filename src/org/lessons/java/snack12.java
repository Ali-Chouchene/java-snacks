package org.lessons.java;

import java.util.Arrays;

public class snack12 {

	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		int tot = arr1.length + arr2.length;
		int[] sumA = new int[tot];
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < arr1.length; i++) {
			++count1;
			sumA[i] =  arr1[i];
		}
		for (int i = count1; i < tot; i++) {
			
			sumA[i] =  arr2[count2];
			count2++;
		}
System.out.println(Arrays.toString(sumA));
	}

}
