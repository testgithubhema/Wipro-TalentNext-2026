package java_fundamentals.arrays;

public class Q_9 {

	public static void main(String[] args) {
		int[] arr = {1,99,10};
        int[] result = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 10) {
                result[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

	}

}
