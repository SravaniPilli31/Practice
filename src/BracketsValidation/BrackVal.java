package BracketsValidation;

import java.util.Stack;

public class BrackVal {
	public static boolean validation(String str){
		Stack<Character> s = new Stack<Character>();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='('){
				s.push(str.charAt(i));
			}
			if(str.charAt(i)==')'){
				if(s.isEmpty()){
					return false;
				}
				else s.pop();
			}
		}
		if(s.isEmpty()){
			return true;
		}
		else return false;
	}
	public static void main(String[] args){
		System.out.println(BrackVal.validation(")C)D))"));
	}
}
