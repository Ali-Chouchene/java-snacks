package org.lessons.java;

import java.util.Arrays;

public class snack13 {

	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		int arr1L = arr1.length;
		int arr2L = arr2.length;
		
		int[] arr1C = new int[arr1L];
		int[] arr2C = new int[arr2L];
		
for (int i = 1; i < arr1L; i++) {
			arr1C[i] =  arr1[i];
		}
for (int i = 1; i < arr2L; i++) {
			arr2C[i] =  arr2[i];	
		}
arr1C[0] =  arr2[0];
arr2C[0] =  arr1[0];
System.out.println(Arrays.toString(arr1C));
System.out.println(Arrays.toString(arr2C));
	}

}
