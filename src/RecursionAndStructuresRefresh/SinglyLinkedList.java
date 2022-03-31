package RecursionAndStructuresRefresh;

// My implementation of a linked list.
public class SinglyLinkedList<T>{
	public static class Node<T>{
		public T data;
		public Node next;
		
		public Node(T data){
			this.data = data;
			this.next = null;
		};
	};
	
	public Node head;
	public int length;
	
	public SinglyLinkedList(){
		this.head = null;
		this.length = 0;
	};
	
	public SinglyLinkedList(T[] arr){
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
		
		if(current!=null) {	
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
		}
		else {
			this.head = newNode;
			this.length = 1;
		};
	};
	
	public void add(T data) {
		this.add(this.length, data);
	};
	
	public void delete(int position) {
		Node current = this.head;
		int counter = 1;
		
		if(current!=null) {
			if(this.length==1) {
				this.head = null;
				this.length = 0;
			}
			else if(position<=1) {
				this.head = current.next;
				this.length -= 1;
			}
			else if(position>=this.length) {
				while(current.next.next!=null) {
					current = current.next;
				};
				
				current.next = null;
				this.length -= 1;
			}
			else {
				while(counter<position-1) {
					counter += 1;
					current =  current.next;
				};
				
				current.next = current.next.next;
				this.length -= 1;
			}
		};
	};
	
	public void updateNode(int position, T data) {
		Node current = this.head;
		int counter = 1;
		
		if(current != null) {
			if(position<=1) {
				current.data = data;
			}
			else if(position>=this.length){
				while(current.next != null) {
					current = current.next;
				};
				
				current.data = data;
			}
			else {
				while(counter<position) {
					current = current.next;
					counter += 1;
				};
				
				current.data = data;
			};
		};
	};
	
	public void clear() {
		this.head = null;
		this.length = 0;
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
