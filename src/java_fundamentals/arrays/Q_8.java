package java_fundamentals.arrays;

public class Q_8 {

	public static void main(String[] args) {
		 int l[] = {1,6,4,7,9}; 
	        int a = 6; 
	        int b = 7;
			int sum = 0;
			boolean add = true;
			
			for (int i=0; i<l.length; i++) {
				if (l[i] != a && add == true)
					sum = sum + l[i];	
				else if (l[i] == a)
					if(i<l.length-1)
						add = false;
					else
						sum=sum+l[i];
				else if (l[i] == b)
					add = true;
			}
			System.out.println(sum);

	}

}
