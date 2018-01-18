package CountBitsInNumber;

public class CountBits {
//	public static int counting(int n) {
//		int count = 0;
//		while (n > 0) {
//			if ((n & 1) == 1) {
//				count++;
//				n = n >> 1;
//			}
//		}
//		return count;
//	}

	public static void main(String[] args) {
		//System.out.println(CountBits.counting(15));
//		System.out.println(CountBits.countTillNumber(15));
//		System.out.println(CountBits.counts(15));
		System.out.println(CountBits.countTillNumber1(5));
	}

	public static int countTillNumber(int n) {
		int count = 0;
		while (n > 0) {
			if (n % 2 == 1) {
				count++;
				n = n / 2;
			}
		}
		return count;
	}
	public static int counts(int n){
		int count=0;
		while(n>0){
			count++;
			n=n&n-1;
		}
		return count;

	}
	public static int countTillNumber1(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			while(n>0){
				count++;
				n = n&n-1;
			}
		}
		return count;
	}
}
