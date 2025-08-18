package recursion;

import java.util.ArrayList;
import java.util.List;

public class PracticeRecursion {
	static List<List<Integer>> lss;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {1,2,3};
       calculatePermutations(arr);
       for(List a:lss) {
    	   System.out.println(a);
       }
	}

	private static List<List<Integer>> calculatePermutations(int[] arr) {
		// TODO Auto-generated method stub
		lss=new ArrayList();
		helper(arr,new ArrayList());
		return lss;
		
	}

	private static void helper(int[] arr, ArrayList arrayList) {
		if(arr.length==arrayList.size()) {
			lss.add(new ArrayList<Integer>(arrayList));
		}
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			if(!arrayList.contains(arr[i])) {
			arrayList.add(arr[i]);
			helper(arr, arrayList);
			arrayList.removeLast();
			}
		}
	}

}
