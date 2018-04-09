package leetcodeEasy;

import java.util.Stack;

public class ValidParanthesis {
	static Stack<Character> s = new Stack<Character>();
	public static boolean validParan(String para){
		for(int i=0;i<para.length();i++){
            switch(para.charAt(i)){
                case '(':
                	s.push('(');
                	break;
                case '{':
                	s.push('{');
                	break;
                case '[':
                	s.push('[');
                	break;
                case ')':
                	if(s.isEmpty() || s.pop()!='(') return false;
                	break;
                case '}':
                	if(s.isEmpty() || s.pop()!='{') return false;
                	break;
                case ']':
                	if(s.isEmpty() || s.pop()!='[') return false;
                	break;
            }
            }
		return s.isEmpty();
	}
	public static void main(String[] args){
		System.out.println(ValidParanthesis.validParan(")()[]{}"));
	}
}
