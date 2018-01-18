package CountSubstring;

public class CountSubstringInBinary {
	public static void findCount(String str){
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == '1'){
				for(int j=i+1;j<str.length();j++){
					if(str.charAt(j) == '1'){
						count++;
						
					}
				}
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args){
		CountSubstringInBinary.findCount("1111");
	}
}
