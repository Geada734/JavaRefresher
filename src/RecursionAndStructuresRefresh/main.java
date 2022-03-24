package RecursionAndStructuresRefresh;

// Exercises on recursion, data structures, and algorithms.
public class main {

	public static void main(String[] args) {
		// Exercises on recursion.
		RecursiveExercises recursionDriver = new RecursiveExercises();
	    System.out.println("******************************");
	    int sum = recursionDriver.sum(3);
	    System.out.println("Sum: ");
	    System.out.println(sum);
	    System.out.println("******************************");
	    int sumBetween = recursionDriver.sumBetween(5, 10);
	    System.out.println("Sum Between: ");
	    System.out.println(sumBetween);
	    System.out.println("******************************");
	    int factorial = recursionDriver.factorial(5);
	    System.out.println("Factorial: ");
	    System.out.println(factorial);
	    System.out.println("******************************");
	    int bunnyEars = recursionDriver.bunnyEars(10);
	    System.out.println("Bunny Ears: ");
	    System.out.println(bunnyEars);
	    System.out.println("******************************");
	    int count7 = recursionDriver.count7(7717673);
	    System.out.println("Count 7: ");
	    System.out.println(count7);
	    System.out.println("******************************");
	    int countX = recursionDriver.countX("XXioxiuoixuo");
	    System.out.println("Count X: ");
	    System.out.println(countX);
	    System.out.println("******************************");
	};

};
