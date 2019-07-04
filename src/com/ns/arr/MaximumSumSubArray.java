package com.ns.arr;

public class MaximumSumSubArray {
	public static void main(String[] args) {
		maximumSumSubArrKadanesAlgo(new int[] { -2, -3, 4, -1, -2, 1, 5, -3 });
	}

	public static void maximumSumSubArrKadanesAlgo(int arr[]) {
		int max_sum_far = arr[0];
		int max_ending_here = 0;
		int start = 0, end = 0, s = 0;

		for (int i = 0; i < arr.length; i++) {
			max_ending_here = max_ending_here + arr[i];
			if (max_ending_here > max_sum_far) {
				max_sum_far = max_ending_here;
				start = s;
				end = i;
			}
			if (max_ending_here < 0) {
				max_ending_here = 0;
				s = i + 1;
			}
		}
		System.out.println("starting and ending index of max sum subarr= " + start + " " + end);
	}
}
