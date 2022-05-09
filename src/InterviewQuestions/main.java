package InterviewQuestions;

import java.util.Queue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class main {
	// Contains problems I've been asked in interviews.
	
	public static void inputCommands(List input, String[][] commands) {
		for(int i=0; i<commands.length; i++) {
			ArrayList<String> command = new ArrayList<String>(Arrays.asList(commands[i]));
			
			input.add(command);
		};
	};
	
	public static String listToString(List list) {
		if(list==null) {
			return "NA";
		};
		
		String s = "[";
		
		Iterator iter = list.iterator();
		
		while(iter.hasNext()) {
			s += iter.next() + " ";
		};
		
		return s;
	};
	
	public static String listOfListsToString(List list) {
		if(list == null) {
			return "NA";
		};
		
		String s = "";
		
		Iterator iter = list.iterator();
		
		while(iter.hasNext()) {
			String[] arr = ((List<String>) iter.next()).toArray(new String[0]);
			
			s += "[" + arr[0] + " " + arr[1] + "]\n";
		};
		
		return s;
	};
	
	public static ArrayList ship(List input) {
		if(input == null||input.size()==0) {
			return null;
		};
		
		Queue<String> shippingQueue = new PriorityQueue<String>();
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		String[] narr = {"na"};
		ArrayList<String> na = new ArrayList<String>(Arrays.asList(narr));
		ArrayList<String> shipped = new ArrayList<String>();
		Iterator iter = input.iterator();
		
		result.add(na);
		
		while(iter.hasNext()) {
			ArrayList<String> command = (ArrayList<String>)iter.next();
			
			if(command.get(0).equals("INSERT")) {
				shippingQueue.add(command.get(1));
			}
			else if(command.get(0).equals("SHIP")) {
				String[] toShip = new String[3];
				
				for(int i=0; i<3; i++) {
					toShip[i] = shippingQueue.poll();
				};
				
				if(toShip[2]!=null) {
					for(int j=0; j<3; j++) {
						shipped.add(toShip[j]);
					};
				};
			}
			else {
				return null;
			};
		};
		
		result.add(shipped);
		
		return result;
	};
	
	public static int diferencesCount(int[] arr, int k) {
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(Math.abs(arr[i]-arr[j])<k) {
					count ++;
				};
			};
		};
		
		return count;
	};
	
	public static String intArrayToString(int[] arr) {
		String s = "[ ";
		
		for(int i=0; i<arr.length; i++) {
			s += arr[i] + " ";
		};
		
		s += "]";
		
		return s;
	};
	
	public static void main(String[] args) {
	    System.out.println("******************************");
	    System.out.println("Asked by Amazon:");
	    System.out.println("1.- A pair of Strings are given via a\n"
	    		+ "a list of lists of Strings, the first element in each\n"
	    		+ "row is a command which could be 'INSERT' or 'SHIP'.\n"
	    		+ "If the command is INSERT, the second string is inserted\n"
	    		+ "into a Queue of strings, if it's SHIP, the first three\n"
	    		+ "strings in the queue are popped and inserted into a List\n"
	    		+ "which is going to be returned as the result of the function.\n"
	    		+ "If there are fewer than 3 elements in the queue, nothing gets\n"
	    		+ "popped out.\n");
	    ArrayList<ArrayList<String>> input = new ArrayList<ArrayList<String>>();
	    String[][] commandsArr = {{"INSERT", "12345"}, {"INSERT", "678"}, {"INSERT", "91011"}, 
	    		{"SHIP", "-"}, {"INSERT", "121314"}};
	    inputCommands(input, commandsArr);
	    System.out.println(listOfListsToString(input));
	    System.out.println(listToString(ship(input)));
	    System.out.println("2.- An array of integers is given along\n"
	    					+ "an integer k, return how many pairs of\n"
	    					+ "numbers are there in the array where the\n"
	    					+ "diference between them is less than k.");
	    int[] intArr = {1, 8, 7};
	    int k = 7;
	    System.out.println("k: " + k);
	    System.out.println("Int array:");
	    System.out.println(intArrayToString(intArr));
	    System.out.println(diferencesCount(intArr, k));
	    System.out.println("******************************");
	}

}
