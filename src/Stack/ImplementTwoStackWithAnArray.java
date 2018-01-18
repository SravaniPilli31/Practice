package Stack;

public class ImplementTwoStackWithAnArray {
	int size;
	int[] a;
	int top1,top2;
	int pointer1, pointer2;
	ImplementTwoStackWithAnArray(int n) {
		a = new int[n];
		top1 = 0;
		top2 = n/2;
		pointer1 =0;
		pointer2 = n/2;
	}

	public void push1(int data) {
		if(pointer1< a.length/2){
			a[pointer1] = data;
			pointer1++;
		}
		else System.out.println("Stack 1 is full"+ data);
	}
	public void push2(int data) {
		if(pointer2<a.length){
			a[pointer2] = data;
			pointer2++;
		}
		else System.out.println("Stack 2 is full"+ data);
	}
	
	public int pop1(){
		int temp = a[top1];
		top1++;
		return temp;
	}
	
	public int pop2(){
		int temp = a[top2];
		top2++;
		return temp;
	}
	public static void main(String[] args) {
		ImplementTwoStackWithAnArray sa = new ImplementTwoStackWithAnArray(7);
		sa.push1(12);
		sa.push2(15);
		sa.push2(16);
		sa.push1(13);
		sa.push1(14);
		sa.push1(20);
		sa.push2(17);
		sa.push2(18);
		sa.push2(21);
		System.out.println("pop1 "+sa.pop1());
		System.out.println("pop2 "+sa.pop2());
		System.out.println("pop1 "+sa.pop1());
		System.out.println("pop2 "+sa.pop2());
	}

}
