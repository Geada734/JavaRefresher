package RecursionAndStructuresRefresh;

// My implementation of a linked list.
public class SinglyLinkedList<T>{
	class Node<T>{
		T data;
		Node next;
		
		Node(T data){
			this.data = data;
			this.next = null;
		};
	};
	
	public Node head;
	private int length;
	
	SinglyLinkedList(){
		this.head = null;
		this.length = 0;
	};
	
	SinglyLinkedList(T[] arr){
		this.head = new Node(arr[0]);
		this.length = arr.length;
		Node current = this.head;
		
		for(int i=0; i<arr.length; i++) {
			current.next = new Node(arr[i]);
			current = current.next;
		};
		
	};
	
	@Override
	public String toString() {
		Node current = this.head;
		String s = "";
		
		while(current!=null) {
			s += current.data + "->";
			current = current.next;
		};
		
		s += "\nLength: " + this.length;
		
		return s;
	};

}
