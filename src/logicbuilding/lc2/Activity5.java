package logicbuilding.lc2;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=25;
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				System.out.println("Smallest exact divisor="+i);
				break;
			}
		}

	}

}
