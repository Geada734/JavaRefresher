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
	
	private Node head;
	private int length;
	
	SinglyLinkedList(){
		this.head = null;
		this.length = 0;
	};
	
	SinglyLinkedList(T[] arr){
		this.head = new Node(arr[0]);
		this.length = arr.length;
		Node current = this.head;
		
		for(int i=1; i<arr.length; i++) {
			current.next = new Node(arr[i]);
			current = current.next;
		};
		
	};
	
	public void add(int position, T data) {
		Node current = this.head;
		Node newNode = new Node(data);
		int counter = 1;
		
		// Passing the length or more will add nodes at the end of the list.
		if(position>=this.length) {
			while(current!=null) {
				if(current.next==null) {
					current.next = newNode;
					current = current.next.next;
				}
				else {
					current = current.next;
				}
			};
			this.length += 1;
		}
		
		// Passing 0 or less will add nodes at the beginning of the list.
		else if(position<=1) {
			newNode.next = this.head;
			this.head = newNode;
			this.length += 1;
		}
		// Having a specific position will add the node at the specified position
		else {
			while(counter<position-1) {
				current = current.next;
				counter += 1;
			};
			
			Node temp = current.next;
			current.next = newNode;
			newNode.next = temp;
			this.length += 1;
			
		};
	};
	
	public int getLength() {
		return this.length;
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
