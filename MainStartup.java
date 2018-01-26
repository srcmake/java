class MainStartup
        {     
        public static void main(String[] args)      
                {
                System.out.println("Program began.");
  
  				srcMathLibrary math = new srcMathLibrary();
  				math.PrintFaveNum();
  				math.SetFaveNum(200);
  				math.PrintFaveNum();
  				int addition = math.Add(2, 2);
  				System.out.println(addition);
  				
  				srcMathLibrary anothermath = new srcMathLibrary(-1);
  				anothermath.PrintFaveNum();
  			
                System.out.println("Program ended.");
                }
        }
