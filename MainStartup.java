class MainStartup
        {
        public static void SayHi(String name)
        	{
        	System.out.println("Hi from " + name);
        	}
        
        public static int ReturnsFive()
        	{
        	int five = 5;
        	return five;
        	}
        	
		public static boolean IsEven(int num)
			{
			if(num % 2 == 0) // Means the number is even.
				{ 
				return true; 
				}
			
			return false;
			}
        
        public static void main(String[] args)      
                {
                System.out.println("Program began.");
                
                SayHi("srcmake");
                
                int num = ReturnsFive(); // num = 5
                
                if(IsEven(num) == true)
                	{
                	System.out.println(num + " is even!");
                	}
            	else
            		{
            		System.out.println(num + " is odd!");
            		}
            	
                System.out.println("Program ended.");
                }
        }
