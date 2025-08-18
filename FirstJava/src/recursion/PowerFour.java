package recursion;

public class PowerFour {
	public static boolean isPowerFour(int n) {
		if(n==1) {
			return true;
		}
		if(n==0||n%4!=0) {
			return false;
		}
		return isPowerFour(n/4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isPowerFour(4));
	}

}
