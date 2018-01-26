import java.util.ArrayList;

class MainStartup
        {     
        public static void main(String[] args)      
                {
                System.out.println("Program began.");
  
  				int[] myArray = { 0, 1, 2 };
  				myArray[0] = 5;
  				myArray[0] =  myArray[0] + 5;
  				System.out.println(myArray[0]);
  				
  				ArrayList<Integer> myList = new ArrayList<Integer>();
  				
  				for(int i = 0; i < 10; i++)
  					{
  					myList.add(i);
  					}

				int n = myList.size();
				for(int i = 0; i < n; i++)
					{
					int num = myList.get(i);
					System.out.print(num + " ");
					}
				System.out.println();

  				ArrayList<Long> longList;
                ArrayList<Double> doubleList;
                ArrayList<Boolean> boolList;
                ArrayList<Character> charList;
                ArrayList<String> stringList;
            	
                System.out.println("Program ended.");
                }
        }
