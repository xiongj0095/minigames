import java.util.LinkedList;

public class Main {

	public static void main(String args[ ])
	{
		CodeProblems cp = new CodeProblems();

		//TEST CASE FOR isPrime(number)
//		int number = 101;
//		for(int i = 1; i < number; i++)
//		{
//			System.out.println(i + " is a prime: " + cp.isPrime(i));
//		}
		
		//TEST CASE FOR swapNum(num1,num2)
		int num1 = 1;
		int num2 = 2;
	//	cp.swapNum(num1, num2);
		
	//	swapNumRecursily(num1, num2);
	
	
		
		
//		System.out.println("num1=" + swapNumRecursily(num1, num2) + " num2=" + num2 );
		
		//TEST CASE FOR factorialRecursively(number)
//		int number = 5;
//		System.out.println("factorial of " + number + " is: " + cp.factorialRecursively(number) );


		//LinkedList Test
		cp.head = new CodeProblems.Node(1);
		CodeProblems.Node second = new CodeProblems.Node(9);
		CodeProblems.Node third = new CodeProblems.Node(3);
		
		cp.head.next = second;
		second.next = third;
		
		cp.push(4);
		cp.push(1);
		cp.push(0);
		cp.push(5);
		cp.push(8);
		cp.push(2);
		cp.push(2);
		cp.deleteKey(3);
		cp.deleteNode(3);
		cp.append(7);
		
		//print LinkedList
		cp.printLinkedList();
		cp.printMiddleNode();
	}
	
	private static int temp = 0;
	public static int swapNumRecursily(int num1, int num2)
	{
		if(num1 == num2)
		{
			num2 = num1;
		}
	
		
		return 1;
	}	



	
}
