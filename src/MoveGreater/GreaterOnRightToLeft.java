package MoveGreater;

public class GreaterOnRightToLeft {
	public static int[] replaceWithGreaterOnLeft(int[] a){
		int size = a.length;
		int max = a[size-1];
		a[size-1] = -1;
		for(int i=size-2;i>=0;i--){
			int temp = a[i];
			a[i] = max;
			System.out.println(temp);
			max = Math.max(temp, max);
		}
		return a;
	}
	public static void main(String[] args) {
		int[] a = {16, 17, 4, 3, 5, 2};
		GreaterOnRightToLeft.replaceWithGreaterOnLeft(a);
		
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

}
