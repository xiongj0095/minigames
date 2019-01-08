

public class DynamicArray<T>
{

	//Initialize Array
	private static final int DEFAULT_CAPACTIY = 0;

	//Fields
	private transient Object myArray[];
	
	//Size of the array
	private int size;
	
	//Capacity of the array
	private int capacity;
	
	//Default Constructor
	public DynamicArray()
	{
		
		this.myArray = new Object[DEFAULT_CAPACTIY];
				
	}

	//Grow method - increase capacity of array 
	private void growArray()
	{
		//make another array to temporary hold values and increase capacity
		Object copyArray[] = new Object[capacity+1];
		
		 //if size and capacity of myArray is the same, increase capacity
		if(size == capacity)
		{
			//copy elements of myArray to copyArray
			for(int i = 0; i < this.myArray.length; i++)
			{
				copyArray[i]  = this.myArray[i];
			}
			
			//Re-assign back to myArray from copyArray 
			this.myArray = copyArray;
			
			//increase capacity
			this.capacity = this.capacity + 1;
			
			//set copyArray back to null
			copyArray = null;
		}
	}
	
	//Add method - add an element to the next free index
	public void add(Object value)
	{
		 //if size and capacity of myArray is the same, increase capacity
		if(size == capacity)
		{
			//grow array capacity
			this.growArray();
		}
		
		//add element to the next free myArray index
		this.myArray[this.size] = value;
		
		//add size
		this.size = this.size + 1;
	}
	
	//Remove method - remove an element from an index
	public void remove(int index)
	{
		//remove element
		for(int i = index; i < this.myArray.length-1; i++)
		{
			//elements copies to left 
			this.myArray[i] = this.myArray[i+1];

		}
		
		//last element of size set to null
		this.myArray[this.size-1] = null;
		
		//subtract size
		this.size = this.size - 1;		
	}
	
	//Print array
	public void printArray()
	{
		for(int i = 0; i < this.myArray.length; i++)
		{
			System.out.println(this.myArray[i]);
		}
	}
	
	//Size method - amount of elements in the index of the array
	public int size()
	{
		return this.size;
	}

	//check if size of myArray is empty
	public boolean isEmpty()
	{
		if(this.size == 0)
		{
			return true;
		}
		else
		{
			return false;		
		}
	}
	
	//Linear search
	public Object linearSearch(Object value)
	{
		Object o = new Object();
		
		for(int i = 0; i < this.myArray.length; i++)
		{
			if(this.myArray[i] == value)
			{
				o = value;
			}
		}
		return o;
	}

	public Object getValue(int i) {
		return this.myArray[i];
	}
	
/*	//Binary search
	public Object binarySearch(Object value)
	{
		Object o = new Object();

		for(int i = this.size/2; i != (int) this.myArray[i]; i = i / 2  )
		{
			if(i >   )
		}
	}
*/	
}