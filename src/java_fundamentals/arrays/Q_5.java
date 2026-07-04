package java_fundamentals.arrays;

import java.util.Arrays;

public class Q_5 {

	public static void main(String[] args) {
		int[] arr= {2,18,14,24,56,97,32,6};
		Arrays.sort(arr);
		System.out.println("Largest 2 numbers: "+arr[arr.length-1]+", "+arr[arr.length-2]);
		System.out.println("Smallest 2 numbers: "+arr[0]+", "+arr[1]);

	}

}
