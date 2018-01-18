package PairHavingMaxProduct;

public class MaxProduct {
	public static void maximumProd(int[] a){
		//int max = Integer.MIN_VALUE;
		int b=0;
		int c=1;
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1; j<a.length;j++){
				if(a[i]*a[j] > a[b]*a[c]){
					b = i;
					c = j;
				}
			}
		}
		System.out.println(a[b]+"*****"+a[c]);
		
	}
	public static void main(String[] args) {
		int[] a = {-1, -3, -4, 2, 0, -5};
		MaxProduct.maximumProd(a);
		
	}
}
