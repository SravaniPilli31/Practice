package BinaryTrees;

public class BinaryTreeImplementation {
	static Node root;

	public static void addBinary(Node node, int i) {
		Node a = new Node(i);
		if(node == null){
			root = a;
		}
		else{
			if(i< node.data){
				if(node.left!= null)
					addBinary(node.left,i);
				else node.left = a;
			}
			if(i> node.data){
				
				if(node.right != null)
					addBinary(node.right,i);
				else node.right = a;
			}
		}

		int max1 = 0, max2, max3;
		Node temp1 = null;
		Node temp2 = null;
		while (node.right != null) {
			node = node.right;
		}
		if (node.right == null) {
			temp1 = node;
			max1 = temp1.data;
		}
		temp2 = temp1.left;
		max2 = temp1.left.data;
		if (temp2.right == null) {
			max3 = temp2.left.data;
		} else
			max3 = temp2.right.data;
		System.out.println(max1+max2+max3);

	}

	public static int addMax3(Node nde) {
		int max1 = 0, max2, max3;
		Node temp1 = null;
		Node temp2 = null;
		while (nde.right != null) {
			nde = nde.right;
		}
		if (nde.right == null) {
			temp1 = nde;
			max1 = temp1.data;
		}
		temp2 = temp1.left;
		max2 = temp1.left.data;
		if (temp2.right == null) {
			max3 = temp2.left.data;
		} else
			max3 = temp2.right.data;
		return max1+max2+max3;
	}

	public static void main(String[] args) {
		int[] a = { 19, 17, 25, 14, 18, 23, 26, 30 };
		Node nde = null;
		for (int i : a) {
			BinaryTreeImplementation.addBinary(nde, i);
		}
		//System.out.println(addMax3(nde));
	}

}
