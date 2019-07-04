package com.ns.str;

public class FindKthCharOfDecrayptedString {
	public static void main(String[] args) {
		System.out.println(findKthChar("a2bc5abcd", 7));
		//System.out.println(findKthChar("abcd", 4));
	}

	public static char findKthChar(String str, int k) {
		int freq = 0;
		int i = 0, j;
		int n = str.length();
		// To store length of substring
		int len;

		// To store length of substring when
		// it is repeated
		int num;
		int charIndex = k;
		
		while (i < n) {
			charIndex = i;
			j = i;
			len = 0;
			freq = 0;
			while (j < n && str.charAt(j) >= 'a' && str.charAt(j) <= 'z') {
				j++;
				len++;
			}
			while (j < n && str.charAt(j) >= '1' && str.charAt(j) <= '9') {

				freq = freq * 10 + (str.charAt(j) - 48);
				j++;
			}
			// Find length of substring when
			// it is repeated.
			num = freq * len;

			// If length of repeated substring is less than
			// k then required character is present in next
			// substring. Subtract length of repeated
			// substring from k to keep account of number of
			// characters required to be visited.
			if (k > num) {
				k -= num;
				i = j;
			}
			// If length of repeated substring is
			// more or equal to k then required
			// character lies in current substring.
			else {
				k--;
				k %= len;
				return str.charAt(i + k);
			}
		}
		// This is for the case when there
		// are no repetition in string.
		// e.g. str="abced".
		return str.charAt(charIndex + k - 1);
	}
}
