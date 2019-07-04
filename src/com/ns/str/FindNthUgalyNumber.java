package com.ns.str;

public class FindNthUgalyNumber {

	public static void main(String[] args) {
		System.out.println(getNthUgaly(150));
	}

	/*
	 * This function divides a by greatest divisible power of b
	 */
	static int maxDevide(int a, int b) {
		while (a % b == 0) {
			a = a / b;
		}
		return a;
	}

	/*
	 * Function to check if a number is ugly or not
	 */

	static int checkUgaly(int no) {
		no = maxDevide(no, 2);
		no = maxDevide(no, 3);
		no = maxDevide(no, 5);

		return no == 1 ? 1 : 0;
	}

	static int getNthUgaly(int n) {
		int i = 1;

		// ugly number count
		int count = 1;

		// check for all integers
		// until count becomes n
		while (n > count) {
			i++;
			if (checkUgaly(i) == 1)
				count++;
		}
		return i;
	}

}
