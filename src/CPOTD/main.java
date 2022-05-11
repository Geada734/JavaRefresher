package CPOTD;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class main {
	// Coding problem of the day from Daily Coding Problem.
	// Might not do them daily (or at all).
	
	public static String arrayToString(int[] arr) {
		String s = "[";
		
		for(int i=0; i<arr.length; i++) {
			s += " " + arr[i];
		};
		
		s += " ]";
		
		return s;
	};
	
	public static boolean addsUp(int k, int[] arr) {
		Set<Integer> intSet = new HashSet<Integer>();
		
		for(int i=0; i<arr.length; i++) {		
			if(intSet.contains(arr[i])) {
				return true;
			};
			
			intSet.add(k-arr[i]);
		};
		
		return false;
	};
	
	public static int[] allProductsExceptMine(int[] arr) {
		int[] results = new int[arr.length];
		int product = 1;
		
		for(int i=0; i<arr.length; i++) {
			product *= arr[i];
		};
		
		for(int j=0; j<arr.length; j++) {
			results[j] = product/arr[j];
		};
		
		return results;
	};
	
	public static void main(String[] args) {
	    System.out.println("******************************");
	    System.out.println("1.-Given a list of numbers and a number k,\n"
	    		+ "return whether any two numbers from the list add \n"
	    		+ "up to k.");
	    int k = 17;
	    int[] arr1 = {10, 3, 15, 7};
	    System.out.println(arrayToString(arr1));
	    System.out.println("k="+k);
	    System.out.println("Result:");
	    System.out.println(addsUp(k, arr1)); 
	    System.out.println("******************************");
	    System.out.println("2.-Given an array of integers, return a \n"
	    		+ "new array such that each element at index i of \n"
	    		+ "the new array is the product of all the numbers \n"
	    		+ "in the original array except the one at i.");
	    int[] arr2 = {1, 2, 3, 4, 5}; 
	    System.out.println(arrayToString(arr2));
	    System.out.println(arrayToString(allProductsExceptMine(arr2))); 
	    System.out.println("******************************");
	    System.out.println("3.-Implement a stack that has the following methods:\n"
	    		+ "push, pop, and max.");
	    MyStack myStack = new MyStack();
	    System.out.println("New Stack: ");
	    System.out.println(myStack);
	    System.out.println("Adding Elements: ");
	    myStack.push(1);
	    myStack.push(2);
	    myStack.push(3);
	    System.out.println(myStack);
	    System.out.println("Checking for max: ");
	    System.out.println(myStack.max());
	    System.out.println("Popping elements: ");
	    myStack.pop();
	    System.out.println(myStack);
	    myStack.pop();
	    System.out.println(myStack);
	    myStack.pop();
	    System.out.println(myStack);
	    System.out.println("******************************");
	}

}
