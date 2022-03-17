/*
 * 
 * @author Geada734
 * Project Euler problems and some algorithms.
 * I also practice a little dyinamic programming here.
 * 
 */

import java.util.ArrayList;
import java.util.Map;  

public class main {
	// Thousand-digit number for problem 8
	private static String thousandDigitNumber = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
	// 20x20 grid for problem 11
	private static int[][] grid = {
		{ 8, 2,22,97,38,15, 0,40, 0,75, 4, 5, 7,78,52,12,50,77,91, 8},
		{49,49,99,40,17,81,18,57,60,87,17,40,98,43,69,48, 4,56,62, 0},
		{81,49,31,73,55,79,14,29,93,71,40,67,53,88,30, 3,49,13,36,65},
		{52,70,95,23, 4,60,11,42,69,24,68,56, 1,32,56,71,37, 2,36,91},
		{22,31,16,71,51,67,63,89,41,92,36,54,22,40,40,28,66,33,13,80},
		{24,47,32,60,99, 3,45, 2,44,75,33,53,78,36,84,20,35,17,12,50},
		{32,98,81,28,64,23,67,10,26,38,40,67,59,54,70,66,18,38,64,70},
		{67,26,20,68, 2,62,12,20,95,63,94,39,63, 8,40,91,66,49,94,21},
		{24,55,58, 5,66,73,99,26,97,17,78,78,96,83,14,88,34,89,63,72},
		{21,36,23, 9,75, 0,76,44,20,45,35,14, 0,61,33,97,34,31,33,95},
		{78,17,53,28,22,75,31,67,15,94, 3,80, 4,62,16,14, 9,53,56,92},
		{16,39, 5,42,96,35,31,47,55,58,88,24, 0,17,54,24,36,29,85,57},
		{86,56, 0,48,35,71,89, 7, 5,44,44,37,44,60,21,58,51,54,17,58},
		{19,80,81,68, 5,94,47,69,28,73,92,13,86,52,17,77, 4,89,55,40},
		{ 4,52, 8,83,97,35,99,16, 7,97,57,32,16,26,26,79,33,27,98,66},
		{88,36,68,87,57,62,20,72, 3,46,33,67,46,55,12,32,63,93,53,69},
		{ 4,42,16,73,38,25,39,11,24,94,72,18, 8,46,29,32,40,62,76,36},
		{20,69,36,41,72,30,23,88,34,62,99,69,82,67,59,85,74, 4,36,16},
		{20,73,35,29,78,31,90, 1,74,31,49,71,48,86,81,16,23,57, 5,54},
		{ 1,70,54,71,83,51,54,69,16,92,33,48,61,43,52, 1,89,19,67,48},
	};
	
	// Variables used for the dynamic fibonacci problem.
	private static int n = 5;
	private static int[] memo = new int[n + 1];
	
	// Variables used for the flood fill algorithm problem.
	private static int[][] screen = {{1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 0, 0},
            {1, 0, 0, 1, 1, 0, 1, 1},
            {1, 2, 2, 2, 2, 0, 1, 0},
            {1, 1, 1, 2, 2, 0, 1, 0},
            {1, 1, 1, 2, 2, 2, 2, 0},
            {1, 1, 1, 1, 1, 2, 1, 1},
            {1, 1, 1, 1, 1, 2, 2, 1},
            };
	
	
	public static int problem1(int max){
		/*
		 * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
		 * we get 3, 5, 6 and 9. 
		 * The sum of these multiples is 23.
		 * Find the sum of all the multiples of 3 or 5 below 1000.
		 */
		
		int i = 1;
		int sum = 0;
		
		while(i<max) {
			if(i%3==0 || i%5==0) {
				sum += i;
			};
			
			i++;
		};
		
		return sum;
	};
	
	public static int problem2(int max) {
		/*
		 * By considering the terms in the Fibonacci sequence whose 
		 * values do not exceed four million, find the sum of the even-valued 
		 * terms.
		 */
		int fib1 = 1;
		int fib2 = 2;
		int sum = 0;
		
		while(fib1<=max) {
			if(fib1%2==0) {
				sum += fib1;
			};
			
			int fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
		};
		
		return sum;
	};
	
	public static long problem3(long num) {
		/*
		 * What is the largest prime factor of the number 600851475143 ?
		 */
		long factor = 0;
		for(long i=1L; i<=num; i++) {
			if(num%i==0) {
				if(isPrime(i)) {
					num=num/i;
					factor = i;
				};
			};
		};
		
		return factor;
	};
	
	public static boolean isPrime(long num) {
		// Utility function to determine whether a long integer
		// is a prime number or not;
		long factor = 0;
		
		for(long i=1; i<=Math.floor(num/2); i++) {
			if(num%i==0) {
				factor = i;
			};
		};
		
		if(factor==1) {
			return true;
		};
		
		return false;
	};
	
	public static int problem4() {
	   /*
		* Find the largest palindrome made from the product of two 3-digit numbers.
		*/
		int num = 1;
		for(int i=100; i<1000; i++) {
			for(int j=100; j<1000; j++) {
				int prod = i*j;
				if(isPalindrome(prod) && prod>num) {
					num = prod;
				};
			};
		};
		
		return num;
	};
	
	public static boolean isPalindrome(int x) {
		// Utility function to determine if a number is
		// a palindrome;
		String numString = "" + x;
		String[] splitString = numString.split("");
		
		for(int i=0, j=splitString.length-1; i<=j; i++, j--) {
			if(!splitString[i].equals(splitString[j])) {
				return false;
			};
		};
		
		return true;
	};
	
	public static int problem5(int n){
		/*
		 * What is the smallest positive number that is evenly divisible 
		 * by all of the numbers from 1 to 20?
		 */	
		int current = n+1;
		
		while(current!=0) {
			if(isEvenlyDivisible(current, n)) {
				return current;
			};
			current++;
		};
		
		return current;
	};
	
	public static boolean isEvenlyDivisible(int current, int n) {
		// Utility function to determine whether a number (current)
		// is evenly divisible by all numbers from 1 to n
		for(int i=1; i<=n; i++) {
			if(current%i!=0) {
				return false;
			};
		};
		
		return true;
	};
	
	public static int problem6(int num) {
		/*
		 * Find the difference between the sum of the squares of the first one hundred 
		 * natural numbers and the square of the sum.
		 */
		int result = 0;
		int sumOfSquares = 0;
		int squaredSum = 0;
		
		for(int i=1; i<=num; i++) {
			sumOfSquares += i*i;
			squaredSum += i;
		};
		
		squaredSum *= squaredSum;
		
		result = squaredSum - sumOfSquares;
		
		return result;
	};
	
	public static int problem7(int num) {
		/*
		 * What is the 10 001st prime number?
		 */
		int pn = 1;
		int count = 1;
		
		for(int i=1; count<num; i++) {
			if(isPrime(i)) {
				pn = i;
				count ++;
			};
		};
		
		return pn;
	};
	
	public static long problem8(String ban, int n) {
		/*
		 * Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
		 */
		long multiple = 1;
		String[] stringBanArr = ban.split("");
		for(int i=0; n<stringBanArr.length; i++, n++) {
			long currentMul = 1;
			for(int j=i; j<n; j++) {
				int num = Integer.parseInt(stringBanArr[j]);
				currentMul *= num;
			};
			if(currentMul>multiple) {
				multiple = currentMul;
			};
		};
		
		
		return multiple;
	};
	
	
	public static int problem9(int n) {
		/*
		 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
		 *	Find the product abc.
		 */
		for(int a=1; a<n; a++) {
			for(int b=a+1; b<n; b++) {
				int c = 1000 - a -b;
				if((c*c)==(a*a)+(b*b)) {
					return a*b*c;
				};
			};
		};
		
		return -1;
	};
	
	public static long problem10(int max){
		/*
		 * Find the sum of all the primes below two million.
		 */
		long sum = 0;
		int[] sieve = sieveOfE(max);
		
		for(int i=0; i<sieve.length; i++) {
			sum += sieve[i];
		};
		
		return sum;
	};
	
	public static int[] sieveOfE(int max) {
		// Utility function to create a sieve of Erathostenes.
		// I'm kind of proud of this one.
		ArrayList<Integer> result = new ArrayList<Integer>();
		boolean[] sieve = new boolean[max+1];
		
		for(int i=0; i<max; i++) {
			sieve[i] = true;
		};
		
		for(int j=2; j<Math.ceil(Math.sqrt(max)); j++) {
			if(isPrime(j)) {
				for(int k=j*j; k<max; k+=j) {
					if(sieve[k]) {
						sieve[k]=false; 
					};
				};
			};
		};
		
		for(int l=1; l<max; l++) {
			if(sieve[l]){
				result.add(l);
			};
		};
		
		int[] resultArr = new int[result.size()];
		
		for(int m=0; m<result.size(); m++) {
			resultArr[m] = result.get(m);
		};
		
		return resultArr;
	};
	
	public static String problem11(int[][] grid, int l) {
		/* What is the greatest product of four adjacent numbers in 
	     *the same direction (up, down, left, right, or diagonally) in the 20×20 grid?
	     */
		
		return "I tried";
	};

	// NOT AN IDEAL SOLUTION
	// Will take too long to run.
	public static int problem12(int counter) {
		/*
		 * What is the value of the first triangle number to have over five hundred divisors?
		 */
		int triangle = 0;
		for(int i=1; i>0; i++) {
			triangle += i;
			if(countDivisors(triangle)==counter) {
				return i;
			};
		};
		
		return -1;
	};
	
	public static int countDivisors(int num) {
		int divCounter = 0;
		for(int i=1; i<Math.floor(num/2); i++) {
			if(num%i==0) {
				divCounter++;
			};
		};
		System.out.println(num);
		System.out.println(divCounter);
		return divCounter;
	};
	
	// I use dynamic programming on recursion to find the 
	// nth fibonacci number.
	public static int fib(int n, int[] memo) {
		int result = -1;	
		memo[0] = 0;
		
		if(n<=0) {
			return -1;
		};
		
		if(n == 1 || n==2) {
			result = 1;
		}
		else if(memo[n] != 0) {
			result = memo[n];
		}
		else {
			result = fib(n-1, memo) + fib(n-2, memo);
		};
		
		memo[n] = result;
		
		return result;
	};
	
	// This function fins the nth fibonacci number using the bottom up
	// method.
	public static int fibBottomUp(int n) {
		int[] bottomUp = new int[n+1];
		bottomUp[0] = 0;
		bottomUp[1] = 1;
		bottomUp[2] = 1;
		
		for(int i=3; i<=n; i++) {
			bottomUp[i] = bottomUp[i-1] + bottomUp[i-2]; 
		};
		
		return bottomUp[n];
	};
	
	// Flood fill algorithm driver function.
	public static void fill(int[][] screen, int x, int y, int color) {
		int prevColor = screen[x][y];
		if(prevColor == color) return;
		
		fillUtil(screen, x, y, color, prevColor);
		printScreen(screen);
	};
	
	// Flood fill algorithm utility function.
	public static void fillUtil(int[][] screen, int x, int y, int newColor, int prevColor){
		
		if(x<0 || y<0) return;
		if(x >= screen.length) return;
		if(y >= screen[x].length) return;
		
		if(screen[x][y] != prevColor) return;
		
		screen[x][y] = newColor;
		
		fillUtil(screen, x+1, y, newColor, prevColor);
		fillUtil(screen, x-1, y, newColor, prevColor);
		fillUtil(screen, x, y+1, newColor, prevColor);
		fillUtil(screen, x, y-1, newColor, prevColor);
		
	};
	
	// Utility function used to print the screen used in the flood fill algorithm.
	public static void printScreen(int[][] screen){
		for(int i = 0; i<screen.length; i++) {
			String line = "";
			for(int j=0; j<screen[i].length; j++) {
				line += screen[i][j]; 
			};
			System.out.println(line);
		};
	};
	
	public static void main(String[] args) {
		
		/* int solution1 = problem1(1000);
		int solution2 = problem2(4000000);
		long solution3 = problem3(600851475143L);
		int solution4 = problem4();
		int solution5 = problem5(20);
		int solution6 = problem6(100);
		int solution7 = problem7(10001); 
		long solution8 = problem8(thousandDigitNumber, 13); 
		int solution9 = problem9(1000); 
		long solution10 = problem10(2000000); 
		String solution11 = problem11(grid, 20); 
		int solution12 = problem12(5); 
		int dynamicFib = fib(n, memo);
		int bottomUpFib = fibBottomUp(n); */
		
		/*System.out.println("*******************");
		System.out.println("First solution:");
		System.out.println(solution1);
		System.out.println("*******************");
		System.out.println("Second solution:");
		System.out.println(solution2);
		System.out.println("*******************");
		System.out.println("Third solution:");
		System.out.println(solution3);
		System.out.println("*******************");
		System.out.println("Fourth solution:");
		System.out.println(solution4);
		System.out.println("*******************");
		System.out.println("Fifth solution:");
		System.out.println(solution5);
		System.out.println("*******************");
		System.out.println("Sixth solution:");
		System.out.println(solution6);
		System.out.println("*******************");
		System.out.println("Seventh solution:");
		System.out.println(solution7); 
		System.out.println("*******************");
		System.out.println("Eight solution:");
		System.out.println(solution8); 
		System.out.println("*******************");
		System.out.println("Ninth solution:");
		System.out.println(solution9); 
		System.out.println("*******************");
		System.out.println("Tenth solution:");
		System.out.println(solution10);
		System.out.println("*******************"); 
		System.out.println("Eleventh solution:");
		System.out.println(solution11);
		System.out.println("*******************");
		System.out.println("Twelfth solution:");
		System.out.println(solution12); 
		System.out.println("*******************"); 
		System.out.println("Dynamic fibonacci solution:");
		System.out.println(dynamicFib);
		System.out.println("*******************"); 
		System.out.println("Bottom up fibonacci solution:");
		System.out.println(bottomUpFib);
		System.out.println("*******************");
		printScreen(screen);
		System.out.println("Fill algorithm result");
		fill(screen, 4, 4, 3);
		System.out.println("*******************"); */
		
	};

};
