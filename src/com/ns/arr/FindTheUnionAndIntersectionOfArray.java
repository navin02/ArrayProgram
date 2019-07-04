package com.ns.arr;

import com.ns.binarysearch.prac.BinarySearchProgram;

public class FindTheUnionAndIntersectionOfArray {
	public static void main(String[] args) {
		int arr1[] = { 1, 5, 10, 20, 40, 80 };
		int arr2[] = { 6, 7, 20, 80, 100 };
		int arr3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };

		printIntersection(arr1, arr2);
	}

	static void printUnion(int arr1[], int arr2[]) {

		int i = 0, j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j])
				System.out.println(arr1[i++]);

			else if (arr1[i] > arr2[j])
				System.out.println(arr2[j++]);

			else {
				System.out.println(arr2[j++]);
				i++;
			}

		}
		while (i < arr1.length)
			System.out.println(arr1[i++]);

		while (j < arr2.length)
			System.out.println(arr2[j++]);
	}

	static void printIntersection(int arr1[], int arr2[]) {
		int i = 0;
		int j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] == arr2[j]) {
				System.out.println(arr1[i]);
				i++;
				j++;
			} else if (arr1[i] < arr2[j])
				i++;
			else
				j++;

		}
	}

	public static void printCommanInThreeSortedArray(int arr1[], int arr2[], int arr3[]) {
		int i = 0, j = 0, k = 0;

		while (i < arr1.length && j < arr2.length && k < arr3.length) {
			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				System.out.println(arr1[i] + " ");
				i++;
				j++;
				k++;

			} else if (arr1[i] < arr2[j])
				i++;
			else if (arr2[j] < arr3[k])
				j++;
			else
				k++;
		}
	}

	public static void printCommanInThreeArrayUsingBST(int arr1[], int arr2[], int arr3[]) {
		int len1 = arr1.length, len2 = arr2.length, len3 = arr3.length;
		boolean isFirst = false, isSecond = false;

		if (len1 < len2 && len1 < len3)
			isFirst = true;
		else if (len2 < len1 && len2 < len3)
			isSecond = true;

		if (isFirst) {
			printCommanElements(arr1, arr2, arr3);
		} else if (isSecond) {
			printCommanElements(arr2, arr1, arr3);
		} else {
			printCommanElements(arr3, arr1, arr3);
		}
	}

	private static void printCommanElements(int[] arr1, int[] arr2, int[] arr3) {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == BinarySearchProgram.findAnElement(arr2, arr1[i])
					&& arr1[i] == BinarySearchProgram.findAnElement(arr3, arr1[i])) {
				System.out.println(arr1[i]);
			}

		}
	}
}
