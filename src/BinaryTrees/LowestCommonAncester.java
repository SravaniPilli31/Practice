package BinaryTrees;
class Node{
	int data;
	Node left, right;
	Node(int value){
		data = value;
		left = null;
		right = null;
	}
}
public class LowestCommonAncester {
	public int CommonAnces(int i, int j, Node root){
		if(i>root.data && j<root.data || i<root.data && j>root.data){
			return root.data;
		}
		if(i<root.data && j<root.data){
			return CommonAnces(i, j, root.left);
		}
		if(i>root.data && j>root.data){
			return CommonAnces(i, j, root.right);
		}
		else return -1;
	}
}
