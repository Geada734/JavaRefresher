package RecursionAndStructuresRefresh;


public class SinglyCircularList<T>{
	class Node<T>{
		T data;
		Node next;
		
		Node(T data){
			this.data = data;
			this.next = null;
		}
	};
	
	private Node<T> head;
	private int length = 0;
	
	SinglyCircularList() {
		this.head = null;
		this.length = 0;
	};
	
	SinglyCircularList(T[] arr){
		if(arr.length > 0) {
			this.head = new Node(arr[0]);
			this.length = arr.length;
			Node current = this.head;
			
			for(int i=1; i<arr.length; i++) {
				Node temp = new Node(arr[i]);
				current.next = temp;
				current = current.next;
			};
			
			current.next = this.head;
		}
		
		else {
			this.head = null;
			this.length = 0;
		};
		
	};
	
	public int getLength() {
		return this.length;
	};
	
	@Override
	public String toString() {
		String s = "";
		Node current = this.head;
		
		if(current!=null) {
			s += current.data + "->";
			current = current.next;
		};
		
		while(current!=this.head) {
			s += current.data + "->";
			current = current.next;
		};
		
		if(current!=null) {
			s += current.data;
		};
		
		s += "\nLength: " + this.length;
		
		return s;
	};
	
};
