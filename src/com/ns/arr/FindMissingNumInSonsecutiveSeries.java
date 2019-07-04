package com.ns.arr;

public class FindMissingNumInSonsecutiveSeries {
	public static void main(String[] args) {
		// System.out.println(findMissingNumberUsingDivideAndConqure(new int[] { 1, 2,
		// 3, 4, 5, 6, 8, 9 }, 8));
		int ar[] = { 1, 2, 3, 4, 5, 6, 8 ,9};
		int size = ar.length;
		System.out.println("Missing number: " + findMissingNumberUsingDivideAndConqure(ar, size));
	}

	public static int findMissingNumberUsingFormula(int arr[], int n) {
		int sum = n * (n + 1) / 2;
		int sumOfArr = 0;
		for (int i = 0; i < arr.length; i++) {
			sumOfArr += arr[i];
		}
		return sum - sumOfArr;
	}

	public static int findMissingNumberUsingBitWiseOperation(int arr[], int n) {
		int sumOfNNum = 1;
		int sumOfArrElement = 0;
		for (int i = 0; i < arr.length; i++) {
			sumOfArrElement ^= arr[i];
		}

		for (int i = 2; i <= n; i++) {
			sumOfNNum ^= i;
		}
		return sumOfArrElement ^ sumOfNNum;
	}

	public static int findMissingNumberUsingDivideAndConqure(int ar[], int size) {
		// int a = 0;
		// int b = n - 1;
		// int mid = 0;
		//
		// while ((b - a) > 1) {
		// mid = (a + b) / 2;
		// if ((arr[a] - a) != (arr[mid] - mid)) {
		// b = mid;
		// } else if ((arr[b] - b) != (arr[mid] - mid)) {
		// a = mid;
		// }
		// }
		// return arr[mid] + 1;

		int a = 0, b = size - 1;
		int mid = 0;
		while ((b - a) > 1) {
			mid = (a + b) / 2;
			if ((ar[a] - a) != (ar[mid] - mid))
				b = mid;
			else if ((ar[b] - b) != (ar[mid] - mid))
				a = mid;
		}
		return (ar[mid] + 1);
	}

}
