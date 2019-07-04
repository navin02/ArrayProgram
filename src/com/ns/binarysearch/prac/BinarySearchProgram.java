package com.ns.binarysearch.prac;

public class BinarySearchProgram {
	public static void main(String[] args) {
		// System.out.println(findAnElement(new int[] { 1, 5, 8, 10, 15, 20, 25 }, 5));
		// System.out.println(findFirstOccuranceOfElement(new int[] { 1, 2, 4, 5, 5, 5,
		// 6, 7, 8, 10 }, 5));
		// System.out.println(findLastOccuranceOfElement(new int[] { 1, 2, 4, 5, 5, 5,
		// 6, 7, 8, 10 }, 5));
		// System.out.println(findNumberOFOccuranceOfElement(new int[] { 1, 2, 4, 5, 5,
		// 5, 6, 7, 8, 10 }, 10));
		// System.out.println(findNumberOfTimeArryrotated(new int[] { 6, 7, 8, 9, 10, 1,
		// 2, 3, 4, 5 }));
		// System.out.println(findElementInCircularlyRotatedArray(new int[] { 6, 7, 8,
		// 9, 10, 1, 2, 3, 4, 5 }, 11));
		// removeDuplicateData(new int[] { 1, 2, 3, 4, 4, 4, 6 });
		System.out.println(findNumberOfTimeArryrotated(new int[] { 7, 6, 1, 2, 3, 4, 5 }));
	}

	public static int findAnElement(int arr[], int element) {
		int start = 0;
		int end = arr.length - 1;
		int mid;
		while (start <= end) {
			mid = start + ((end - start) / 2);
			if (arr[mid] == element)
				return arr[mid];
			else if (element > arr[mid])
				start = mid + 1;
			else
				end = mid - 1;
		}
		return -1;
	}

	public static int findFirstOccuranceOfElement(int arr[], int element) {
		int start = 0, end = arr.length - 1, mid, result = -1;
		while (start <= end) {
			mid = start + ((end - start) / 2);
			if (element == arr[mid]) {
				result = mid;
				end = mid - 1;
			} else if (element > arr[mid])
				start = mid + 1;
			else
				end = mid - 1;
		}
		return result;
	}

	public static int findLastOccuranceOfElement(int arr[], int element) {
		int start = 0, end = arr.length - 1, mid, result = -1;
		while (start <= end) {
			mid = start + ((end - start) / 2);
			if (element == arr[mid]) {
				result = mid;
				start = mid + 1;
			} else if (element > arr[mid])
				start = mid + 1;
			else
				end = mid - 1;
		}
		return result;
	}

	public static int findNumberOFOccuranceOfElement(int arr[], int element) {
		int first = findFirstOccuranceOfElement(arr, element);
		int last = findLastOccuranceOfElement(arr, element);
		return (last - first) + 1;
	}

	public static int findNumberOfTimeArryrotated(int arr[]) {
		int start = 0, end = arr.length - 1, mid, next, prev, length = arr.length;
		while (start <= end) {
			if (arr[start] <= arr[end])
				return start;
			mid = start + ((end - start) / 2);
			next = (mid + 1) % length;
			prev = (mid + length - 1) % length;
			if (arr[mid] <= arr[next] && arr[mid] <= arr[prev])
				return mid;
			else if (arr[mid] <= arr[end])
				end = mid - 1;
			else if (arr[mid] >= arr[start])
				start = mid + 1;
		}
		return -1;
	}

	public static int findElementInCircularlyRotatedArray(int[] arr, int element) {
		int start = 0, end = arr.length - 1, mid;
		while (start <= end) {
			mid = start + ((end - start) / 2);
			if (arr[mid] == element)
				return mid;
			else if (arr[mid] <= arr[end]) {
				if (element > arr[mid] && element <= arr[end])
					start = mid + 1;
				else
					end = mid - 1;
			} else if (arr[start] <= arr[mid]) {
				if (arr[start] <= element && element < arr[mid])
					end = mid - 1;
				else
					start = mid + 1;
			}
		}
		return -1;
	}

	public static void removeDuplicateData(int[] arr) {
		int j = 0, lenght = arr.length;
		for (int i = 0; i < lenght - 1; i++) {
			if (arr[i] != arr[i + 1])
				arr[j++] = arr[i];
		}
		arr[j] = arr[lenght - 1];
		for (int a : arr) {
			System.out.print(a);
		}
	}
}
