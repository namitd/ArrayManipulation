package com.example;

import java.util.Arrays;

public class arrayManipulate {

	public static int[] rotateArray(int[] arr) {
		int start = 0;
		int end = 8;
		int temp = 0;
		if (end == start)
			return null;

		while (end != start) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// Scanner sc = new Scanner(System.in);
		// int i = sc.nextInt();

		// arrayManipulate am = new arrayManipulate();

		System.out.println(Arrays.toString(rotateArray(arr)));

	}

}
