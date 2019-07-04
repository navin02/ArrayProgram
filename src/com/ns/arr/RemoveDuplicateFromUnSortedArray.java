package com.ns.arr;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromUnSortedArray {
	public static void main(String[] args) {
		Set<Integer> valueSet = new HashSet<Integer>();
		valueSet.add(1);
		valueSet.add(1);
		int[] arr = new int[] { 2, 3, 2, 10, 5, 3, 9, 2, 3, 11 };
		// replaceDuplicateElementWithReplaceVAl(arr, 1);
		repalceDuplicateWithMaxVal(arr);
		for (int a : arr) {
			System.out.println(a);
		}
	}

	public static void replaceDuplicateElementWithReplaceVAl(int arr[], int replaceVal) {
		List<Integer> valueList = new LinkedList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (!valueList.contains(arr[i])) {
				valueList.add(arr[i]);
			} else {
				arr[i] = replaceVal;
			}
		}

	}

	public static void repalceDuplicateWithMaxVal(int[] arr) {
		int maxVal = findMaxElement(arr);
		replaceDuplicateElementWithReplaceVAl(arr, maxVal + 1);
	}

	public static int findMaxElement(int arr[]) {
		int maxVal = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxVal)
				maxVal = arr[i];
		}
		return maxVal;
	}
}
