package recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

static List<List<Integer>> lss=new ArrayList<>();;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int [] n= {1,2,3};
          calculatepermutation(n,new ArrayList<>());
          for(List i:lss) {
        	System.out.println(i);  
          }
	}

	private static void calculatepermutation(int[] n1,ArrayList ls) {
		// TODO Auto-generated method stub
		
		if(n1.length==ls.size()) {
		lss.add(new ArrayList<Integer>(ls));
			//lss.add(ls);
			
		}
		for(int i=0;i<n1.length;i++) {
			if(!ls.contains(n1[i])) {
		      ls.add(n1[i]);
		     
			calculatepermutation(n1,ls);
			ls.removeLast();
			
			
			}
			
			
		}
	}

}
