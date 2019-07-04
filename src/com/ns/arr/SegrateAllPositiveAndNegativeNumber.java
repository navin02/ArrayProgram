package com.ns.arr;

public class SegrateAllPositiveAndNegativeNumber {
	public static void main(String[] args) {
		int arr[] = new int[] { -1, 3, 8, -4, 5, -6, 7, -20, 30, 40 };
		segratePosAndNeg(arr);
		for (int a : arr) {
			System.out.println(a);
		}
	}

	public static void segratePosAndNeg(int arr[]) {
		int i = 0;
		int j = arr.length - 1;

		while (true) {
			while (arr[i] < 0 && i < j)
				i++;
			while (arr[j] > 0 && i < j)
				j--;
			if (i < j) {
				swap(arr, i, j);
				i++;
				j--;
			} else
				break;

		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
