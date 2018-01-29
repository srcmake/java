public class ArrayUtility
	{
	public static <T> void PrintArray(T[] array)
		{
		for(T element: array)
			{
			System.out.print(element + " ");
			}
		System.out.println();
		}
	}
