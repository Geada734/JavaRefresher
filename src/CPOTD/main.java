package CPOTD;

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
			intSet.add(k-arr[i]);
			
			if(intSet.contains(arr[i])) {
				return true;
			};
		};
		
		return false;
	};
	
	public static void main(String[] args) {
	    System.out.println("******************************");
	    System.out.println("1.-Given a list of numbers and a number k,\n"
	    		+ "return whether any two numbers from the list add \n"
	    		+ "up to k.");
	    int k = 17;
	    int[] arr = {10, 3, 15, 7};
	    System.out.println(arrayToString(arr));
	    System.out.println("k="+k);
	    System.out.println("Result:");
	    System.out.println(addsUp(k, arr));
	    System.out.println("******************************");
	}

}
