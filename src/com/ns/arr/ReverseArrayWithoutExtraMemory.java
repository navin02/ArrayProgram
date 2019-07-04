package com.ns.arr;

public class ReverseArrayWithoutExtraMemory {
	public static void main(String[] args) {
		int[] a = reverseArrayInRange(new int[] { 1, 2, 3, 4, 5 },3,5);
		for (int aValue : a) {
			System.out.println(aValue);
		}
	}

	public static int[] reverseArray(int[] a) {
		if (null == a || a.length == 1) {
			return a;
		}
		int length = a.length;
		int beginIndex = 0;
		int endIndex = length - 1;
		int temp = 0;
		while (beginIndex < endIndex) {
			temp = a[beginIndex];
			a[beginIndex++] = a[endIndex];
			a[endIndex--] = temp;
		}
		return a;
	}
	
	public static int[] reverseArrayInRange(int[] a,int start,int end) {
		if (null == a || a.length == 1) {
			return a;
		}
		
		int beginIndex = start;
		int endIndex =end-1;
		int temp = 0;
		while (beginIndex < endIndex) {
			temp = a[beginIndex];
			a[beginIndex++] = a[endIndex];
			a[endIndex--] = temp;
		}
		return a;
	}
}
