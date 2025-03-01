package com.Testing;

import java.util.Arrays;

public class SortingArrayPerformance {

	public int[] sortingArray(int[] arr) {
		for (int i = 0; i < 10000000; i++) {
			Arrays.sort(arr);
		}
		return arr;
	}
}
