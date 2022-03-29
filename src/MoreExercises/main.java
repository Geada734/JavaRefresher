package MoreExercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import RecursionAndStructuresRefresh.SimpleBinaryTree;

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
	
	public static Character getUniqueChar(String s) {	
		Map<Character, Integer> counters = new HashMap<Character, Integer>();
		
		for(int i=0; i<s.length(); i++) {
			char key = s.charAt(i);
			
			if(counters.containsKey(key)) {
				int currentValue = counters.get(key);
				
				counters.put(key, currentValue+1);
			}
			else {
				counters.put(key, 1);
			};
			
		};
		
		for(int j=0; j<s.length(); j++) {
			char current = s.charAt(j);
			
			if(counters.get(current)==1) {
				return current;
			};
			
		};
		
		return null;
	};
	
	public static boolean isOneAway(String a, String b) {
		if(Math.abs(a.length()-b.length())<=1) {
			int numberOfChanges = 0;
			int pA = 0;
			int pB = 0;
			
			// Check for char update
			if(a.length()==b.length()) {
				while(pA<a.length()&&pB<b.length()) {
					if(a.charAt(pA) != b.charAt(pB)) {
						numberOfChanges++;
						
						if(numberOfChanges>1) {
							return false;
						};
					}
					pA++;
					pB++;
				};
			}
			// Check for addition
			else if(a.length()<b.length()) {
				while(pA<a.length()&&pB<a.length()) {
					if(a.charAt(pA)==b.charAt(pB)) {
						pA++;
						pB++;
					}
					else {
						if(a.charAt(pA)==b.charAt(pB+1)) {
							numberOfChanges++;
							pA++;
							pB++;
							pB++;
						}
						else {
							return false;
						};
					};
				};
			}
			// Check for deletions
			else {
				while(pA<a.length()&&pB<b.length()) {
					if(a.charAt(pA)==b.charAt(pB)) {
						pA++;
						pB++;
					}
					else {
						if(a.charAt(pA+1)==b.charAt(pB)) {
							numberOfChanges++;
							pA++;
							pA++;
							pB++;
						}
						else {
							return false;
						};
					};
				};
			};
			
			if(numberOfChanges<=1) {
				return true;
			};
		};
		
		return false;
	};
	
	public static String array2DToString(int[][] matrix) {
		String s = "";
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				s += matrix[i][j] + " ";
			};
			s += "\n";
		};
		
		return s;
	};
	
	public static int[][] plantMines(int[][] mines, int w, int h) {
		int[][] field = new int[w][h];
		
		for(int i=0; i<mines.length; i++) {
			int x = mines[i][0];
			int y = mines[i][1];
			
			field[x][y] = -1;
			
			for(int j=x-1; j<x+2; j++){
				for(int k=y-1; k<y+2; k++) {
					if((k>=0 && k<h) && (j>=0 && j<w) && field[j][k]!=-1) {
						field[j][k] += 1;
					};
				};
			};
		};
		
		return field;
	};
	
	public static void clickOnField(int[][] field, int x, int y) {
		if(field[x][y] != 0) {
			return;
		};
		
		field[x][y] = -2;
		
		if(x>0) {
			clickOnField(field, x-1, y);
		};
		
		if(x<field.length-1) {
			clickOnField(field, x+1, y);
		};
		
		if(y>0) {
			clickOnField(field, x, y-1);
		};
		
		if(y<field[x].length-1) {
			clickOnField(field, x, y+1);
		};
	};
	
	public static int[][] rotate90Degrees(int[][] matrix) {
		int[][] newMatrix = new int[matrix.length][matrix.length];
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix.length; j++) {
				newMatrix[j][matrix.length-1-i] = matrix[i][j];
			};
		};
		
		return newMatrix;
	};
	
	
	public static int getNumberOfWays(int n) {
		int[] record = new int[n+1];
		
		if(n>1) {
			record[0] = 0;
			record[1] = 1;
		};
		
		return getNumberOfWaysSub(n, record);
	};
	
	public static int getNumberOfWaysSub(int n, int[] record) {
		if(n<=1){
			return 1;
		}
		else if(record[n]!=0) {
			return record[n];
		}
		else {
			record[n] = getNumberOfWaysSub(n-1, record) + getNumberOfWaysSub(n-2, record);
		};
		
		return record[n];
	};

	public static int getHeight(int height, SimpleBinaryTree.Node node) {
		if(node==null) {
			return 0;
		};
		
		int heightL = getHeight(height, node.left);
		int heightR = getHeight(height, node.right);
		
		height = Math.max(heightR, heightL);
		
		return height+1;
	};
	
	public static void main(String[] args) {
	    /* System.out.println("******************************");
	    System.out.println("--Array Exercises--");
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
	    System.out.println("--String Exercises--");
	    System.out.println("1.- Find first unique character in a string: ");
	    String test1 = "aabcb";
	    String test2 = "xxyz";
	    String test3 = "aabb";
	    System.out.println(test1);
	    Character sResult1 = getUniqueChar(test1);
	    System.out.println(sResult1);
	    System.out.println(test2);
	    Character sResult2 = getUniqueChar(test2);
	    System.out.println(sResult2);
	    System.out.println(test3);
	    Character sResult3 = getUniqueChar(test3);
	    System.out.println(sResult3);
	    System.out.println("2.- Find out if two strings are one edit away from each other");
	    String testA1 = "abcde";
	    String testA2 = "abfde";
	    System.out.println(testA1);
	    System.out.println(testA2);
	    boolean result1 = isOneAway(testA1, testA2);
	    System.out.println(result1);
	    System.out.println("\n");
	    String testA3 = "xyz";
	    String testA4 = "xyaz";
	    System.out.println(testA3);
	    System.out.println(testA4);
	    boolean result2 = isOneAway(testA3, testA4);
	    System.out.println(result2);
	    System.out.println("\n");
	    String testA5 = "abcde";
	    String testA6 = "abde";
	    System.out.println(testA5);
	    System.out.println(testA6);
	    boolean result3 = isOneAway(testA5, testA6);
	    System.out.println(result3);
	    System.out.println("******************************");
	    System.out.println("******************************");
	    System.out.println("--2D Array Exercises--");
	    System.out.println("1.- Assign bombs and numbers to a mindweeper field");
	    int[][] mines = {{ 2, 2}};
	    System.out.println(array2DToString(mines));
	    int[][] field = plantMines(mines, 3, 5);
	    System.out.println(array2DToString(field));
	    System.out.println("2.- Expand mine field on clicking on a 0");
	    clickOnField(field, 1, 4);
	    System.out.println(array2DToString(field));
	    System.out.println("3.- Rotate a 2D array by 90 degrees");
	    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	    System.out.println(array2DToString(matrix));
	    System.out.println(array2DToString(rotate90Degrees(matrix)));
	    System.out.println("******************************");	
	    */
	    System.out.println("******************************");	
	    System.out.println("--Miscellaneous Exercises--");  
	    System.out.println("M.- Find how many ways to go up a staircase with n steps.");
	    System.out.println("For a staircase with 16 steps: ");
	    System.out.println(getNumberOfWays(16));
	    System.out.println("M.- The height of a binary tree");
	    SimpleBinaryTree<Integer> bTreeH = new SimpleBinaryTree(3);
	    bTreeH.root.left = bTreeH.createNode(2);
	    bTreeH.root.left.left = bTreeH.createNode(1);
	    bTreeH.root.right = bTreeH.createNode(6);
	    bTreeH.root.right.left = bTreeH.createNode(4);
	    bTreeH.root.right.right = bTreeH.createNode(5);
	    bTreeH.root.right.right.right = bTreeH.createNode(7);
	    System.out.println(bTreeH);
	    System.out.println("Height: ");
	    System.out.println(getHeight(0, bTreeH.root));
	    System.out.println("******************************");	

	}

}
