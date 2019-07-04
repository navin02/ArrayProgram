package com.ns.arr;

public class MoveAllElementInBinaryTree {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 1, 1, 1, 0, 0 };

		MoveAllElementInBinaryTree.shiftElementInBArray(arr);
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	public static void shiftElementInBArray(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				arr[count++] = 0;
		}
		while (count < arr.length)
			arr[count++] = 1;
	}
}
