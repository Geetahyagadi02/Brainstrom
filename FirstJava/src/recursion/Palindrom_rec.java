package recursion;

public class Palindrom_rec {
	public static boolean palindrome(String s,int l,int r) {
		if(l>=r) {
			return true;
		}
		if(s.charAt(l)==s.charAt(r)&&palindrome(s, l+1, r-1)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="aabjaa";
       int l=0;
       int r=s.length()-1;
     System.out.println(palindrome(s, l, r));  
	}

}
