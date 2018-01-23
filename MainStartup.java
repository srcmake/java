class MainStartup
        {
        public static void main(String[] args)      
                {
                System.out.println("Program began.");
                
            	int max = 5;
            	
            	for(int i = 0; i < max; i++)
            		{
					System.out.print(i + " ");
            		}
            	System.out.println(".");
            	
            	
            	if(max > 4) 
            		{
            		System.out.println("The number stored in \"max\" is greater than 4.");
            		}
            	else if (max > 2) 
            		{
            		System.out.println("The number stored in \"max\" is greater than 2 but less than 4.");
            		}
            	else 
            		{
            		System.out.println("The number stored in \"max\" is less than 2.");
            		}
                
                }
        }
