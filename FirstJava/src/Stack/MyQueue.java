package stack;

import java.util.Stack;

public class MyQueue {
	Stack<Integer> input;
	Stack<Integer> output;

	public MyQueue() {
		input = new Stack<>();
		output = new Stack<>();
	}

	public void push(int x) {
		input.push(x);
	}

	public int peek() {
		if (output.isEmpty()) {
			while (!input.isEmpty()) {
				int pop = input.pop();
				output.push(pop);
			}
		}
		return output.peek();
	}

	public int pop() {
		if (output.isEmpty()) {
			while (!input.isEmpty()) {
				int pop = input.pop();
				output.push(pop);
			}
		}
		int top = output.peek();
		output.pop();
		return top;
	}

	public boolean empty() {
		return (output.isEmpty() && input.isEmpty());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyQueue myQueue=new MyQueue();
        myQueue.push(0);
        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.peek());
	}

}
