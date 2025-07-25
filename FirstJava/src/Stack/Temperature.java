package stack;

import java.util.Arrays;
import java.util.Stack;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {73,74,75,71,69,72,76,73};
       int []res=new int[arr.length];
      int[] result= Temperature.temperatures(arr,res);
      System.out.println(Arrays.toString(result));
	}

	private static int[] temperatures(int[] arr, int[] res) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<Integer>();
		int k=0;
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty()&& arr[i]>arr[st.peek()]) {
				int pop=st.pop();
				
				int day=i-pop;
				 System.out.println(i-pop);
				res[pop]=day;
				
			}
			st.push(i);
		}
		return res;
	}

}
