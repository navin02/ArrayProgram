package com.ns.arr;

public class FindTwoRepeatingInGivenArray {
	public static void main(String[] args) {
		FindTwoRepeatingInGivenArray repeat = new FindTwoRepeatingInGivenArray();
		int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
		int arr_size = arr.length;
		repeat.printUsingCountArray(arr, arr_size);
	}

	public void prinRepeating(int arr[], int size) {
		// s is for sum of element in arr[]
		int s = 0;
		// p is for product of element in arr[]
		int p = 1;
		// x and y are two repeating element
		int x, y;
		// D is the difference of x-y
		int d;

		int n = size - 2, i;

		// calculate sum and product of all elements in array

		for (i = 0; i < size; i++) {
			s += arr[i];
			p *= arr[i];
		}

		// S is x+y now

		s = s - n * (n + 1) / 2;

		p = p / fact(n);

		d = (int) Math.sqrt(s * s - 4 * p);

		x = (d + s) / 2;

		y = (s - d) / 2;

		System.out.println("two repeating element are " + x + "  " + y);
	}

	private int fact(int n) {
		return (n == 0) ? 1 : n * fact(n - 1);
	}

	public void printUsingCountArray(int arr[], int size) {
		int[] count = new int[size];

		for (int i = 0; i < size; i++) {
			if (count[arr[i]] == 1)
				System.out.print(arr[i] + " ");
			else
				count[arr[i]]++;

		}
	}
}
