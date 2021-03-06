package RecursionAndStructuresRefresh;
import RecursionAndStructuresRefresh.SimpleBinaryTree.Node;

// Exercises on recursion, data structures, and algorithms.
public class main {

	public static void main(String[] args) {
		// Exercises on recursion.
		/*
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
	    System.out.println("******************************16");
	    String endX = recursionDriver.endX("AxBxCx");
	    System.out.println("End X: ");
	    System.out.println(endX);
	    System.out.println("******************************17");
	    int count11 = recursionDriver.count11("Ax11B111xCx11");
	    System.out.println("Count 11: ");
	    System.out.println(count11);
	    System.out.println("******************************18");
	    String parenBit = recursionDriver.parenBit("Ax11(B111)xCx11");
	    System.out.println("Paren Bit: ");
	    System.out.println(parenBit);
	    System.out.println("******************************19");
	    int fibonacci = recursionDriver.fibonacci(24);
	    System.out.println("Fibonacci: ");
	    System.out.println(fibonacci);
	    System.out.println("******************************20");
	    int[] memo = new int[25];
	    memo[0] = 1;
	    memo[1] = 1;
	    int[] buMemo = new int[25];
	    int dynamicFibonacci = recursionDriver.dynamicFibonacci(24, memo);
	    int bottomUpFibonacci = recursionDriver.bottomUpFibonacci(24, buMemo);
	    System.out.println("Bottom Up Fibonacci: ");
	    System.out.println(bottomUpFibonacci);
	    System.out.println("******************************");
	    */
		
		// Exercises on data structures
		// Singly linked list
	    /* System.out.println("******************************");
	    Integer[] arr2List = {1, 2, 3, 4, 5, 6, 7};
	    SinglyLinkedList<Integer> slList = new SinglyLinkedList(arr2List);
	    System.out.println(slList);
	    System.out.println("-Adding nodes");
	    slList.add(0, 9);
	    System.out.println(slList);
	    slList.add(1, 10);
	    System.out.println(slList);
	    slList.add(-1, 11);
	    System.out.println(slList);
	    slList.add(10, 12);
	    System.out.println(slList);
	    slList.add(12, 13);
	    System.out.println(slList);
	    slList.add(7, 14);
	    System.out.println(slList);
	    SinglyLinkedList<Integer> slListEmpty = new SinglyLinkedList();
	    slListEmpty.add(33, 111);
	    System.out.println(slListEmpty);
	    slListEmpty.add(222);
	    System.out.println(slListEmpty);
	    // Testing delete function.
	    System.out.println("-Deleting nodes");
	    slList.delete(34);
	    System.out.println(slList);
	    slList.delete(12);
	    System.out.println(slList);
	    slList.delete(-1);
	    System.out.println(slList);
	    slList.delete(0);
	    System.out.println(slList);
	    slList.delete(1);
	    System.out.println(slList);
	    slList.delete(7);
	    System.out.println(slList);
	    slListEmpty.delete(2);
	    System.out.println(slListEmpty);
	    slListEmpty.delete(0);
	    System.out.println(slListEmpty);
	    // Testing clear function
	    System.out.println("-Clearing the list");
	    slListEmpty.add(111);
	    slListEmpty.add(222);
	    slListEmpty.add(333);
	    System.out.println(slListEmpty);
	    slListEmpty.clear();
	    System.out.println(slListEmpty);
	    // Testing update function.
	    System.out.println("-Updating nodes");
	    slList.updateNode(-1, 15);
	    System.out.println(slList);
	    slList.updateNode(0, 16);
	    System.out.println(slList);
	    slList.updateNode(1, 17);
	    System.out.println(slList);
	    slList.updateNode(8, 18);
	    System.out.println(slList);
	    slList.updateNode(7, 19);
	    System.out.println(slList);
	    slList.updateNode(2, 20);
	    System.out.println(slList);
	    slList.updateNode(6, 21);
	    System.out.println(slList);
	    System.out.println("******************************");
	    */
		// Singly Linked Circular List
		/*
	    System.out.println("******************************");
	    Integer[] arr2CList = {1, 2, 3, 4, 5, 6, 7};
		SinglyCircularList<Integer> scList = new SinglyCircularList(arr2CList);
		System.out.println(scList);
	    System.out.println("-Adding nodes");
	    scList.add(1, 8);
		System.out.println(scList);
	    scList.add(0, 9);
		System.out.println(scList);
	    scList.add(-1, 10);
		System.out.println(scList);
	    scList.add(1, 11);
		System.out.println(scList);
	    scList.add(12, 12);
		System.out.println(scList);
	    scList.add(1800, 13);
		System.out.println(scList);
	    scList.add(13, 14);
		System.out.println(scList);
	    scList.add(2, 15);
		System.out.println(scList);
	    scList.add(16);
		System.out.println(scList);
		SinglyCircularList scListEmpty = new SinglyCircularList();
		System.out.println(scListEmpty);
		scListEmpty.add(1111);
		System.out.println(scListEmpty);
	    System.out.println("-Deleting nodes");
	    scList.delete(16);
		System.out.println(scList);
	    scList.delete(316);
		System.out.println(scList);
	    scList.delete(0);
		System.out.println(scList);
	    scList.delete(1);
		System.out.println(scList);
	    scList.delete(11);
		System.out.println(scList);
		scListEmpty.delete(0);
		System.out.println(scListEmpty);
		scListEmpty.delete(0);
		scListEmpty.add(1111);
		scListEmpty.add(2222);
		scListEmpty.add(3333);
		System.out.println(scListEmpty);
	    System.out.println("-Clearing the list");
		scListEmpty.clear();
		System.out.println(scListEmpty);
		System.out.println("-Updating nodes");
	    scList.updateNode(1, 17);
		System.out.println(scList);
	    scList.updateNode(0, 18);
		System.out.println(scList);
	    scList.updateNode(-1, 19);
		System.out.println(scList);
	    scList.updateNode(11, 20);
		System.out.println(scList);
	    scList.updateNode(12, 21);
		System.out.println(scList);
	    scList.updateNode(2, 22);
		System.out.println(scList);
	    scList.updateNode(10, 23);
		System.out.println(scList);
	    System.out.println("******************************");
		// Simple Binary Trees
	    System.out.println("******************************");
	    System.out.println("-Building a binary tree manually");
	    SimpleBinaryTree<String> binTree = new SimpleBinaryTree(1);
	    binTree.root.left = binTree.createNode("2");
	    binTree.root.right = binTree.createNode("3");
	    binTree.root.left.left = binTree.createNode("4");
	    binTree.root.left.right = binTree.createNode("5");
	    System.out.println(binTree);
	    System.out.println("******************************");
	    */
	};

};
