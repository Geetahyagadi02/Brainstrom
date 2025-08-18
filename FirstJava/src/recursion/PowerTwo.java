package recursion;

public class PowerTwo {
	public static boolean powerTwoCalc(int n) {
		int pow=1;
	      for(int i=0;i<n/2;i++) {
	    	 pow=2*pow;
	    	 if(pow==n) {
	    		return true; 
	    	 }
	      }
	      return false;
	      
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		System.out.println(powerTwoCalc(n));
	
	}

}
