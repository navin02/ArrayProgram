package com.ns.str;

public class FibonasiSeries {

	public static void main(String[] args) {
		System.out.println(fib(10));
	}

	static int fib(int n) {

		int count = 2;
		int a = 0, b = 1, c;
		if (n == 0)
			return a;

		for (int i = 2; i <= n; i++) {
			c = a + b;
			if (count == n)
				return c;
			a = b;
			b = c;
			count++;
		}
		return b;
	}
}
