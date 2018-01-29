class MainStartup
	{     
	
	public static void PrintArraysBad(Integer[] array)
		{
		for(int element : array)
			{
			System.out.print(element + " ");
			}
		System.out.println();
		}
	
    public static void main(String[] args)      
    	{
        System.out.println("Program began.");
		
		// We have a bunch of arrays.
        Integer[] intArray = { 0, 2, 4, 6, 8, 10 };
        Double[] doubleArray = { 1.5, 2.5, 3.5, 4.5, 5.5 };
        Long[] longArray = { 100L, 200L, 300L, 400L, 500L };
        Boolean[] boolArray = { true, true, false, true, false };
        Character[] charArray = { 'a', 'b', 'c', 'd', 'e' };
        String[] stringArray = { "Apple", "Book", "Candy", "srcmake" };
		
		PrintArraysBad(intArray);
		
		ArrayUtility.PrintArray(intArray);
        ArrayUtility.PrintArray(doubleArray);
        ArrayUtility.PrintArray(longArray);
        ArrayUtility.PrintArray(boolArray);
        ArrayUtility.PrintArray(charArray);
        ArrayUtility.PrintArray(stringArray);		
		
		GenericClass<Integer> intT = new GenericClass<Integer>();
		intT.PrintT(5);
		
		GenericClass<String> stringT = new GenericClass<String>();
		stringT.PrintT("srcmake");
		
        System.out.println("Program ended.");
        }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
