package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
	static List<List<Integer>> lss;
	
	public static List<List<Integer>>permutations(int[] ch){
		lss=new ArrayList<List<Integer>>();
		helper(ch,new ArrayList<>());
		return lss;
	}

		
	
	private static void helper(int[] ch, ArrayList used) {
		if(ch.length==used.size()) {
			lss.add(new ArrayList<Integer>(used));
		}
		// TODO Auto-generated method stub
		for(int i=0;i<ch.length;i++) {
			if(!used.contains(ch[i])) {
				used.add(ch[i]);
				helper(ch,used);
				used.removeLast();
			}
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n= {1,2,3};
		System.out.println(permutations(n));
      
	}

}
