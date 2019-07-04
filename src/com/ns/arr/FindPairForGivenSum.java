package com.ns.arr;

import java.util.HashSet;

public class FindPairForGivenSum {
	public static void main(String[] args) {
		int[] arr = new int[] { 5, 8, 3, 4, 2, 6, 10, 7, 1, 9 };
		MergeSort.sort(arr, 0, arr.length - 1);
		findPairsWithGivenSum(arr, 15);
		//printpairs(arr,15);
	}

	public static void findPairsWithGivenSum(int[] arr, int sum) {
		int l = 0, r = arr.length - 1;
		while (l < r) {
			if (arr[l] + arr[r] > sum)
				r--;
			else if (arr[l] + arr[r] < sum)
				l++;
			else {
				System.out.println("Sum with given pair is  " + arr[l] + " " + arr[r]);
				l++;
				r--;
			}
		}
	}
	
	
	static void printpairs(int arr[],int sum) 
    {        
        HashSet<Integer> s = new HashSet<Integer>(); 
        for (int i=0; i<arr.length; ++i) 
        { 
            int temp = sum-arr[i]; 
  
            // checking for condition 
            if (temp>=0 && s.contains(temp)) 
            { 
                System.out.println("Pair with given sum " + 
                                    sum + " is (" + arr[i] + 
                                    ", "+temp+")"); 
            } 
            s.add(arr[i]); 
        } 
    } 
}
