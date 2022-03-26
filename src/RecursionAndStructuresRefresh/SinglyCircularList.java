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
	
	public void add(T data) {
		this.add(this.length, data);
	};
	
	public void add(int position, T data) {
		Node current = this.head;
		Node newNode = new Node(data);
		int counter = 1;
		
		if(current!=null) {
			if(position<=1) {
				Node oldHead = current;
				this.head = newNode;
				this.head.next = current;
				
				while(current.next != oldHead) {
					current = current.next;
				};
				
				current.next = this.head;
				this.length += 1;
			}
			else if(position>length){
				while(current.next != this.head) {
					current = current.next;
				};
				
				current.next = newNode;
				newNode.next = this.head;
				
				this.length += 1;
			}
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
			this.head = new Node(data);
			this.head.next = this.head;
			this.length += 1;
		};
	};
	
	public void delete(int position) {
		if(head != null) {
			if(this.length!=1) {
				Node current = this.head;
				int counter = 1;
				
				if(position<=1) {
					Node oldHead = this.head;
					this.head = current.next;
					
					while(current.next != oldHead) {
						current = current.next;
					};
					
					current.next = this.head;
					this.length -= 1;
				}
				else if(position>=this.length) {
					while(current.next.next!=this.head){
						current = current.next;
					};
					
					current.next = this.head;
					this.length -= 1;
				}
				else {
					while(counter<position-1) {
						current = current.next;
						counter += 1;
					};
					
					current.next = current.next.next;
					this.length -= 1;
				};
			}
			else {
				this.head = null;
				this.length = 0;
			};
		};
	};
	
	public void clear() {
		this.head = null;
		this.length = 0;
	};
	
	public void updateNode(int position, T data) {
		if(this.head != null) {
			Node current = this.head;
			
			if(position<=1) {
				this.head.data = data;
			}
			else if(position>=this.length) {
				while(current.next!=this.head) {
					current = current.next;
				};
				
				current.data = data;
			}
			else {
				int counter = 1;
				
				while(counter<position) {
					current = current.next;
					counter += 1;
				};
				
				current.data = data;
			};
		}
		else {
			this.add(data);
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
