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
	
	public String changePi(String str) {
		if(str.length()>1) {
			if(str.charAt(0) == 'p' && str.charAt(1) == 'i') {
				return "3.14" + changePi(str.substring(2));
			}
			else {
				return str.charAt(0) + changePi(str.substring(1));
			}
		};
		
		return str;
	};
	
	public int array11(int[] nums, int index) {
		if(index<nums.length) {
			if(nums[index]==11) {
				return 1 + array11(nums, index+1);
			}
			else {
				return array11(nums, index+1);
			}
		};
		
		return 0;
	};
	
	public String pairStar(String str) {
		if(str.length()>1) {
			if(str.charAt(0)==str.charAt(1)) {
				return str.charAt(0) + "*" + pairStar(str.substring(1));
			}
			else {
				return str.charAt(0) + pairStar(str.substring(1));
			}
		};
		
		return str;
	};
	
	public int countAbc(String str) {
		if(str.length()>2) {
			if(str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba")) {
				return 1 + countAbc(str.substring(1));
			}
			else {
				return countAbc(str.substring(1));
			}
		};
		
		return 0;
	};
	
};
