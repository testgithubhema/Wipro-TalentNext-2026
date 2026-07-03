package logicbuilding.lc2;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12;
		int binary=0;
		int place=1;
		while(num>0) {
			int rem=num%2;
			binary=binary+(rem*place);
			place=place*10;
			num=num/2;
		}
		System.out.println("Binary="+binary);

	}

}
