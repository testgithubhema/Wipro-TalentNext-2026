package java_fundamentals.arrays;

public class Q_2 {

	public static void main(String[] args) {
		int[] arr= {2,7,3,9,12};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		System.out.println("Maximum value of array:"+max);
		System.out.println("Minimum value of array:"+min);
		

	}

}
