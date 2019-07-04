package com.ns.arr;

public class FindNumberOccurOddTime {
	public static void main(String[] args) {
		System.out.println(findOddNumber(new int[] { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 }));
	}

	public static int findOddNumber(int arr[]) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result ^= arr[i];
		}
		return result;
	}
}
