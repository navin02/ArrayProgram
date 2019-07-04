package com.ns.arr;

public class RearrangeArrSuchThatArriBecomesArrj {
	public static void main(String[] args) {
		rearrangeArray(new int[] { 1, 4, 0, 3, 2 });
	}

	public static void rearrangeArray(int arr[]) {
		int[] temp = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			temp[arr[i]] = i;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = temp[i];
		}

		for (int a : arr) {
			System.out.println(a);
		}
	}
}
