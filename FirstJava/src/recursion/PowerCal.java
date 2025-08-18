package recursion;

public class PowerCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
       System.out.println(calcPower(n));
	}

	private static int calcPower(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return 1;
		}
		return 2*calcPower(n-1);
	}

}
