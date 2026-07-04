package java_fundamentals.arrays;

public class Q_12 {

	public static void main(String[] args) {
		int[] x= {1,2,3};
		int[] y= {4,5,6};
		int[] z=new int[2];
		z[0]=x[1];
		z[1]=y[1];
		for(int i=0;i<z.length;i++) {
			System.out.print(z[i]+" ");
		}
		

	}

}
