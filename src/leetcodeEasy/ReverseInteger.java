package leetcodeEasy;

public class ReverseInteger {
	public static void revInt(int n){
		int x = n;
		int y=0;
		while(x!=0){
			y = y*10 + x%10;
			x = (x-x%10)/10;
		}
		System.out.println(y);
	}
	public static void main(String[] args){
		ReverseInteger.revInt(252);
	}
}
