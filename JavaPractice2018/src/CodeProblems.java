
public class CodeProblems {

	private int number = 10;
	private int temp;
	
	public CodeProblems()
	{
		isPrime(number);
	//	swapNum(num1, num2);
	}
	
	//to check if a number is prime
	public boolean isPrime(int number)
	{
		boolean primeNumber = false;
		int countDivisibility = 0; 
		
		//2 is a prime number 
		if(number == 1 || number == 2)
		{
			return primeNumber = true;
		}
		
		for(int i=1; i< number; i++)
		{
			//return false if number is even
			if(number % 2 == 0 )
			{
				primeNumber = false;
				break;
			}
			
			if(number % i == 0)
			{
				countDivisibility++;
			
			}

			if(countDivisibility >= 2)
			{
				primeNumber = false;
				break;
			}
			else {
				primeNumber = true;		//there is only one divisibility other than one
			}
			
		}
		
		return primeNumber;
	}

	//swap two numbers
	public void swapNum(int num1, int num2)
	{
		int temp;

		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1=" + num1 + " num2=" + num2 );

	}
	
	public void swapNumRecursily(int num1, int num2)
	{
		

	}	
	
	public int factorialRecursively(int number)
	{
		int result;
		
		if(number == 1)
		{
			return 1;
		}
		result = factorialRecursively(number-1) * number;
		
		return result;
	}

	//LinkedList Data Structure
	Node head;
	
	public static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	//add element/node to the front of LinkedList
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		
		new_node.next = head;
		
		head = new_node;
	}
	
	public void append(int new_data)
	{
		Node new_node = new Node(new_data);
		
		if(head == null)
		{
			head = new Node(new_data);
			return;
		}
		
		new_node.next = null;
		
		Node last = head;
		while(last.next != null)
		{
			last = last.next;
		}
		last.next = new_node;

		return;
	}
	//print LinkedList
	public void printLinkedList()
	{
		Node n = head;
		while(n != null)
		{
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	//print middle element/node of a linkedList
	public void printMiddleNode()
	{
		//count the nodes of the list
		Node n = head;
		int count = 0;
		int middleNodeCount = 0;
		
		while(n != null)
		{
			count++;
			
			n = n.next;
		}
		
		System.out.println("Count " + count );
		
		//get the middle Count
		middleNodeCount = count/2;
//		System.out.println("Middle Count " + middleNodeCount );

		//get the middle Node
		Node m = head;
		int count2 = 0;
		
		//Traverse list again to find middleNode
		while(m != null)
		{
			if(count2 == middleNodeCount)
			{
				//print out the middle Node
				System.out.print("Middle Node " + m.data );
				return;
			}
			count2++;
			
			m = m.next;
		}

	}

	//delete node given key in linkedList
	public void deleteKey(int key)
	{
		Node temp = head;
		Node prev = null;
		
		if(temp != null && temp.data == key)
		{
			head = temp.next;
			return;
		}
		
		while(temp != null && temp.data != key)
		{
			prev = temp;
			temp = temp.next;
		}
		
		if(temp == null)
		{
			System.out.print(key + " key is not in given linked list");
			return;
		}
		
		prev.next = temp.next;
		
	}

	//delete node given position in linkedList
	public void deleteNode(int position)
	{
		Node prev = null;
		Node temp = head;
		int countNodes = 0;
		int count = 0;
		
		Node nodeCounter = head;
		
		//count nodes
		while(nodeCounter != null)
		{
			countNodes++;
			nodeCounter = nodeCounter.next;
		}
		
		if(head == null)
		{
			return;
		}
		
		if(position == 0)
		{
			head = temp.next;
			return;
		}
		
		//Check if position is not in list
		if(position > countNodes)
		{
			System.out.println("LinkedList does not have position " + position);
			return;
		}
				
		//Traverse through list
		while(temp != null && count < position)
		{
			prev = temp;
			temp = temp.next;
			count++;
		}
		
		if(temp == null)
		{
			return;
		}
		prev.next = temp.next;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
