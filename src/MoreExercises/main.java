package MoreExercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {

	// Common interview questions.
	
	public static String arrayToString(Integer[] arr) {
		String s = "[";
		
		for(int i=0; i<arr.length; i++) {
			s += " " + arr[i];
		};
		
		s += " ]";
		
		return s;
	};
	
	public static String mostCommonElementInArray(Integer[] arr) {
		String s = "";
		int maxElement = -1;
		int maxOccurrences = -1;
		Map<Integer, Integer> counters = new HashMap<Integer, Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(counters.containsKey(arr[i])) {
				int currentValue = counters.get(arr[i]);
				
				counters.put(arr[i], currentValue+1);
			}
			else {
				counters.put(arr[i], 1);
			};
			if(counters.get(arr[i])>maxOccurrences) {
				maxElement = arr[i];
				maxOccurrences = counters.get(arr[i]);
			};
		};
		
		s += "Most common element: " + maxElement + "\nOccurrences: " + maxOccurrences;
		
		return s;
	};
	
	public static Integer[] getCommonElements(Integer[] a, Integer[] b) {
		List<Integer> arrLC = new ArrayList<Integer>();
		int p1 = 0;
		int p2 = 0;
		
		while(p1<a.length&&p2<b.length) {
			if(a[p1]==b[p2]) {
				arrLC.add(a[p1]);
				p1++;
				p2++;
			}
			else if(a[p1]<b[p2]){
				p1++;
			}
			else {
				p2++;
			};
		};
		
		Integer[] c = arrLC.toArray(new Integer[0]);
		
		return c;
	};
	
	public static boolean isRotated(Integer[] a1, Integer[] a2) {
		boolean result = false;
		
		if(a1.length==a2.length) {
			int p1 = 0;
			int p2 = 0;
			
			while(p1<a1.length) {
				if(p2==a2.length) {
					if(p1>0) {
						p2 = 0;
					}
					else {
						return false;
					};
				}
				if(a1[p1]==a2[p2]) {
					p1++;
					p2++;
					result = true;
				}
				else if(p1>0) {
					return false;
				}
				else {
					p2++;
				};
			};
		}
		
		return result;
	};
	
	public static void main(String[] args) {
	    System.out.println("******************************");
	    Integer[] intArr = { 1, 3, 1, 3, 2, 1};
	    System.out.println("1.- Find most common element in array: ");
	    System.out.println(arrayToString(intArr));
	    String result1 = mostCommonElementInArray(intArr);
	    System.out.println(result1);
	    System.out.println("2.- Find common elements in two sorted arrays: ");
	    Integer[] arrA = {1, 3, 4, 6, 7, 9};
	    Integer[] arrB = {1, 2, 4, 5, 9, 10};
	    System.out.println(arrayToString(arrA));
	    System.out.println(arrayToString(arrB));
	    Integer[] result2 = getCommonElements(arrA, arrB);
	    System.out.println("Result: ");
	    System.out.println(arrayToString(result2));
	    System.out.println("3.- Find out if an array of unique elements is a rotation of another: ");
	    Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7};
	    Integer[] arr2 = {4, 5, 6, 7, 1, 2 ,3};
	    System.out.println(arrayToString(arr1));
	    System.out.println(arrayToString(arr2));
	    boolean result3 = isRotated(arr1, arr2);
	    System.out.println("Result: ");
	    System.out.println(result3);
	    System.out.println("******************************");

	}

}
