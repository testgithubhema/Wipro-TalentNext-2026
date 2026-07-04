package java_fundamentals.flowcontrolstatements;

public class Q_13 {

	public static void main(String[] args) {
		   for(int n=10;n<=99;n++) {
	            int count=0;
	            for(int i=1;i<=n;i++) {
	                if(n%i==0)
	                    count++;
	            }
	            if(count==2)
	                System.out.println(n);
	        }
	}

}
