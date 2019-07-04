package com.ns.arr;

public class MoveAllZeroAtTheEndOfArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 0, 1, 2, 0, 0, 8, 9, 7 };
		shiftZero(arr);
		MergeSort.printArray(arr);
	}

	public static void shiftZero(int arr[]) {
		int count = 0, n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0)
				arr[count++] = arr[i];
		}
		while (count < n)
			arr[count++] = 0;
	}
}
