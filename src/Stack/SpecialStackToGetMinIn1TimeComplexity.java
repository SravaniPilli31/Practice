package Stack;

import java.util.Stack;

public class SpecialStackToGetMinIn1TimeComplexity {
	Stack<Integer> s = new Stack<Integer>();
	int min = Integer.MAX_VALUE;
	public void push(int data){
		min = Math.min(min, data);
		s.push(data);
	}
	public int pop(){
		return s.pop();
	}
	public int getMin(){
		return min;
	}
	public boolean isEmpty(){
		if(s.empty()) return true;
		else return false;
	}
	public boolean isFull(){
		if(s.capacity()==0) return true;
		else return false;
	}
	public static void main(String[] args){
		SpecialStackToGetMinIn1TimeComplexity ss = new SpecialStackToGetMinIn1TimeComplexity();
		ss.push(18);
		ss.push(4);
		ss.push(99);
		System.out.println(ss.getMin()+"min");
		ss.push(1);
		System.out.println(ss.getMin()+"min");
		System.out.println(ss.isEmpty()+"is empty");
		System.out.println(ss.isFull()+"is full");
		ss.push(11);
		System.out.println(ss.isFull()+"is full");
		System.out.println(ss.isEmpty()+"is empty");
	}
}
