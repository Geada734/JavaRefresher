package CPOTD;

import java.util.ArrayList;
import java.util.Iterator;

// My implementation of a stack using an arrayList.
public class MyStack {
	ArrayList<Integer> coreList;
	int size;
	
	public MyStack() {
		this.coreList = new ArrayList<Integer>();
	};
	
	public void push(Integer x) {
		this.coreList.add(0, x);
	};
	
	public Integer pop() {
		if(this.coreList.size()<1) {
			return null;
		};
		
		return this.coreList.remove(0);
	};
	
	public Integer max() {
		Integer max = null;
		Iterator<Integer> iter = this.coreList.iterator();
		
		while(iter.hasNext()) {
			if(max==null) {
				max = iter.next();
			} else{
				Integer current = iter.next();
				
				if(current>max) {
					max = current;
				};
			}
		};
		
		return max;
	};
	
	@Override
	public String toString() {
		String s = "[ ";
		Iterator<Integer> iter = this.coreList.iterator();
		
		while(iter.hasNext()) {
			s += iter.next() + " ";
		};
		
		s += "]";
	
		return s;
	};
}
