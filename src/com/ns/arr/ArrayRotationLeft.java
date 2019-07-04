package com.ns.arr;

public class ArrayRotationLeft {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7};
		arr = rotateArray(arr, 2);
		for (int aVal : arr) {
			System.out.println(aVal);
		}

	}

	public static int[] rotateArray(int arr[], int rotateBy) {
		

		arr = ReverseArrayWithoutExtraMemory.reverseArrayInRange(arr, 0, rotateBy);
		arr = ReverseArrayWithoutExtraMemory.reverseArrayInRange(arr, rotateBy, arr.length);

		return ReverseArrayWithoutExtraMemory.reverseArray(arr);
	}
}
