package logicbuilding.lc2;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int binary=1011;
		int decimal=0;
		int place=1;
		while(binary>0) {
			int digit=binary%10;
			decimal=decimal+(digit*place);
			place=place*2;
			binary=binary/10;
			
		}
		System.out.println("Decimal="+decimal);

	}

}
