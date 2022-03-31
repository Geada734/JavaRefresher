package RecursionAndStructuresRefresh;

//My implementation of a simple binary tree.
public class SimpleBinaryTree<T> {
	public class Node<T>{
		public T data;
		public Node left;
		public Node right;
		
		Node(T data){
			this.data = data;
			this.left = null;
			this.right = null;
		};
	};
	
	public Node root;
	
	public SimpleBinaryTree(){
		this.root = null;
	};
	
	public SimpleBinaryTree(T data){
		this.root = new Node(data);
	};
	
	public Node createNode(T data) {
		return new Node(data);
	};
	
	public String inOrderTraversal(Node current, String s){
		if(current != null) {
			s = inOrderTraversal(current.left, s);
			s += current.data + " ";
			s = inOrderTraversal(current.right, s);
		};
		
		return s;
	};
	
	public String inOrder(Node current) {
		String s = "";
		
		s = inOrderTraversal(current, s);
		
		return s;
	};
	
	public String preOrderTraversal(Node current, String s) {
		if(current!=null) {
			s += current.data + " ";
			s = preOrderTraversal(current.left, s);
			s = preOrderTraversal(current.right, s);
		};
		
		return s;
	};
	
	public String preOrder(Node current) {
		String s = "";
		
		s = preOrderTraversal(current, s);
		
		return s;
	};
	
	public String postOrderTraversal(Node current, String s) {
		if(current!=null) {
			s = postOrderTraversal(current.left, s);
			s = postOrderTraversal(current.right, s);
			s += current.data + " ";
		};
		
		return s;
	};
	
	public String postOrder(Node current) {
		String s = "";
	
		s = postOrderTraversal(current, s);
		
		return s;
	};
	
	public int getHeight(Node current) {
		if(current==null) {
			return 0;
		};
		
		int heightLeft = getHeight(current.left);
		int heightRight = getHeight(current.right);
		
		return Math.max(heightLeft,heightRight) + 1;
	};
	
	public String levelOrderTraversal(Node root) {
		String s = "";
		int height = this.getHeight(root);
		if(height>0) {
			for(int i=1; i<=height; i++) {
				s += getCurrentLevel(i, root);
			};
		};
		
		return s;
	};
	
	public String getCurrentLevel(int i, Node current) {
		String s = "";
		if(current==null) {
			return "";
		};
		if(i==1) {
			return current.data + " ";
		};
		
		if(i>1) {
			s += getCurrentLevel(i-1, current.left);
			s += getCurrentLevel(i-1, current.right);
		};
		
		return s;
	};
	
	public void clear() {
		this.root = null;
	};
	
	@Override
	public String toString() {
		String s =  "Inorder: ";
		s += this.inOrder(this.root);
		s +=  "\nPreorder: ";
		s += this.preOrder(this.root);
		s +=  "\nPostorder: ";
		s += this.postOrder(this.root);
		s += "\nLevel Order: ";
		s += this.levelOrderTraversal(this.root);
		return s;
	};
}
