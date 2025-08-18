package recursion;

public class PowerTwoRec {
	public static boolean checkPower=false;
	public static boolean powerTwoCalc(int n) {
	
	if(n==1) {
		return true;
	}
	if(n==0||n%2!=0) {
		return false;
	}
	return powerTwoCalc(n/2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println( powerTwoCalc(4));
     
	}

}
