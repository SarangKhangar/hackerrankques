package com.qs.hackerrankqs;

public class ConcatePlusSort {

	public static void combineAntSort(int[] a, int[] b) {
		int n = a.length + b.length;
		int[] ar = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			ar[i] = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			ar[j + b.length] = b[j];
		}
		for (int j = 0; j < ar.length; j++) {
			if (j == ar.length - 1) {
				break;
			} else if (ar[j] > ar[j + 1]) {
				int temp = ar[j];
				ar[j] = ar[j + 1];
				ar[j + 1] = temp;
			}
		}
		for (int x : ar) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {

		int[] ar1 = { 4, 5, 3 };
		int[] ar2 = { 7, 8, 6 };

		combineAntSort(ar1, ar2);

	}

}
