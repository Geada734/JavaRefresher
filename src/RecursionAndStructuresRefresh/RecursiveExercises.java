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
	
};
