package com.ns.str;

public class SubSequence {

	public static void main(String[] args) {
		System.out.println(isSubSequenceUsingRecursion("navinshah", "shah", "navinshah".length(), "shah".length()));
	}

	public static boolean isSubsequenceUsingIteration(String str1, String str2) {
		int m = str1.length();
		int n = str2.length();
		int i, j;
		for (i = 0, j = 0; i < m && j < n; i++) {
			if (str1.charAt(i) == str2.charAt(j))
				j++;

		}
		return j == n;
	}

	public static boolean isSubSequenceUsingRecursion(String str1, String str2, int m, int n) {
		if (m == 0)
			return false;
		if (n == 0)
			return true;
		if (str1.charAt(m - 1) == str2.charAt(n - 1))
			return isSubSequenceUsingRecursion(str1, str2, m - 1, n - 1);
		return isSubSequenceUsingRecursion(str1, str2, m - 1, n);
	}
}
