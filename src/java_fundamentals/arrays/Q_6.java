package java_fundamentals.arrays;

import java.util.Arrays;

public class Q_6 {

	public static void main(String[] args) {
		int[] arr= {90,45,12,65,3,25};
		Arrays.sort(arr);
		System.out.print("Sorted Order:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
