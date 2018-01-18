package Stack;

import java.util.Stack;

public class QueueWithStack {
	static Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();

	public void enqueue(Stack<Integer> s, int data) {
		s.push(data);
	}

	public int dequeue() {
		if (s1.isEmpty()) {
			return -1;
		}
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		int temp = s2.pop();
		while (!s2.isEmpty()) {
			enqueue(s1, s2.pop());
		}
		return temp;
	}

	public static void main(String[] args) {
		QueueWithStack qs = new QueueWithStack();
		System.out.println(qs.dequeue());
		 qs.enqueue(s1, 12);
		 qs.enqueue(s1, 15);
		 qs.enqueue(s1, 13);
		 qs.enqueue(s1, 14);
		System.out.println(qs.dequeue());
		System.out.println(qs.dequeue());
	}
}
