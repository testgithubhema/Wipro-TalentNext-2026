package logicbuilding.lc1;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=8;
		int n2=0;
		int n3=-2;
		int n4=20;
		int n5=-6;
		int positive=0;
		int negative=0;
		if(n1>=0)
			positive++;
		else
			negative++;
		if(n2>=0)
			positive++;
		else
			negative++;
		if(n3>=0)
			positive++;
		else
			negative++;
		if(n4>=0)
			positive++;
		else
			negative++;
		if(n5>=0)
			positive++;
		else
			negative++;
		System.out.println("Non-negative Numbers="+positive);
		System.out.println("Negative Numbers="+negative);

	}

}
