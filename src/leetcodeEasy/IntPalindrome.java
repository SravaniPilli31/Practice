package leetcodeEasy;

public class IntPalindrome {
	public static boolean isPalindrome(int n){
		int new_n = n;
		if(n<0){
			n = n*-1;
		}
		int x = new_n;
		int y=0;
		while(x!=0){
			y = y*10 + x%10;
			x = (x-x%10)/10;
		}
		if(n==y) return true;
		else return false;
	}
	public static void main(String[] args){
		System.out.println(IntPalindrome.isPalindrome(-212));
	}
}
