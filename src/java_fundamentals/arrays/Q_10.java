package java_fundamentals.arrays;

public class Q_10 {

	public static void main(String[] args) {
		int[] arr= {3,3,2};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]%2!=0 && arr[j]%2==0) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
