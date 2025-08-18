package recursion;

public class Palindrome {
  public static boolean palindrome(String s) {
	  int l=0;
	  int r=s.length()-1;
	  Boolean palin=false;
	  while(l<r) {
		  if(s.charAt(l)==s.charAt(r)) {
			 
			  l++;
			  r--;
		  }
		  else {
			  break;
		  }
	  }
	  if(l>=r) {
		return true;  
	  }
	return palin;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(palindrome("aabaa"));
	}

}
