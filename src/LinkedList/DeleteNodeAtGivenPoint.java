package LinkedList;

class Node
{
	int data ;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
public class DeleteNodeAtGivenPoint {
	
	public static void delete(Node head,int k){
		int count=1;
		Node current = head;
		Node prev = null;
		while(count!=k){
			prev = current;
			current = current.next;
		}
		current = current.next;
		prev.next = current;
	}
	public static void main(String[] args){
		
	}
}
