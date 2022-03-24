package RecursionAndStructuresRefresh;

// This class includes the methods for several recursion exercises.
public class RecursiveExercises {
	
	public RecursiveExercises() {};
	
	public int sum(int n) {
		if(n>0) {
			return n + sum(n-1);
		};
		
		return 0;
	};
	
	public int sumBetween(int start, int end) {
		if(start<=end) {
			return start + sumBetween(start+1, end);
		};
		
		return 0;
	};
	
	public int factorial(int n) {
		if(n>0) {
			return n * factorial(n-1);
		};
		
		return 1;
	};
	
	public int bunnyEars(int n) {
		if(n>0) {
			if(n%2==0) {
				return 3 + bunnyEars(n-1);
			}
			else {
				return 2 + bunnyEars(n-1);
			}
		};
		
		return 0;
	};
	
	public int count7(int n) {
		if(n>0) {
			if(n%10==7) {
				return 1 + count7((int)Math.floor(n/10));
			}
			else {
				return count7((int)Math.floor(n/10));
			}
		};
		
		return 0;
	};
	
	public int countX(String str) {
		if(str.length()>0) {
			if(str.charAt(0)=='x') {
				return 1 + countX(str.substring(1));
			}
			else {
				return countX(str.substring(1));
			}
		};
		
		return 0;
	};
	
};
