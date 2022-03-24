package RecursionAndStructuresRefresh;

// Exercises on recursion, data structures, and algorithms.
public class main {

	public static void main(String[] args) {
		// Exercises on recursion.
		RecursiveExercises recursionDriver = new RecursiveExercises();
	    System.out.println("******************************1");
	    int sum = recursionDriver.sum(3);
	    System.out.println("Sum: ");
	    System.out.println(sum);
	    System.out.println("******************************2");
	    int sumBetween = recursionDriver.sumBetween(5, 10);
	    System.out.println("Sum Between: ");
	    System.out.println(sumBetween);
	    System.out.println("******************************3");
	    int factorial = recursionDriver.factorial(5);
	    System.out.println("Factorial: ");
	    System.out.println(factorial);
	    System.out.println("******************************4");
	    int bunnyEars = recursionDriver.bunnyEars(10);
	    System.out.println("Bunny Ears: ");
	    System.out.println(bunnyEars);
	    System.out.println("******************************5");
	    int count7 = recursionDriver.count7(7717673);
	    System.out.println("Count 7: ");
	    System.out.println(count7);
	    System.out.println("******************************6");
	    int countX = recursionDriver.countX("XXioxiuoixuo");
	    System.out.println("Count X: ");
	    System.out.println(countX);
	    System.out.println("******************************7");
	    String changePi = recursionDriver.changePi("XXiopiuopixuo");
	    System.out.println("Change Pi: ");
	    System.out.println(changePi);
	    System.out.println("******************************8");
	    int[] nums = {1, 11, 3, 11, 11};
	    int array11 = recursionDriver.array11(nums, 0);
	    System.out.println("Array 11: ");
	    System.out.println(array11);
	    System.out.println("******************************9");
	    String pairStar = recursionDriver.pairStar("abbabbbaaaaabbbbcdf");
	    System.out.println("Pair Star: ");
	    System.out.println(pairStar);
	    System.out.println("******************************10");
	    int countAbc = recursionDriver.countAbc("abbabbbaaaaabbbbcdfabaabc");
	    System.out.println("Count ABC: ");
	    System.out.println(countAbc);
	    System.out.println("******************************11");
	    int countHi = recursionDriver.countHi("xhihihix");
	    System.out.println("Count Hi: ");
	    System.out.println(countHi);
	    System.out.println("******************************12");
	    int strCount = recursionDriver.strCount("xhihihix", "xhi");
	    System.out.println("Str Count: ");
	    System.out.println(strCount);
	    System.out.println("******************************13");
	    int count8 = recursionDriver.count8(88881888);
	    System.out.println("Count 8: ");
	    System.out.println(count8);
	    System.out.println("******************************14");
	    String noX = recursionDriver.noX("axxbxx");
	    System.out.println("No X: ");
	    System.out.println(noX);
	    System.out.println("******************************15");
	    int[] nums220 = {1, 2, 3, 4, 5, 50, 6};
	    boolean array220 = recursionDriver.array220(nums220, 0);
	    System.out.println("Array 220: ");
	    System.out.println(array220);
	    System.out.println("******************************");
	};

};
