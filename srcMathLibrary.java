class srcMathLibrary
	{
	// Private variables and functions.
	private int favenum; // Our favorite number.
	
	// Constructor
	public srcMathLibrary()
		{
		SetFaveNum(7);
		}
		
	// Overload constructor
	public srcMathLibrary(int fave)
		{
		SetFaveNum(fave);
		}
		
	public int Add(int a, int b)
		{
		return a + b;
		}
		
		
	public void PrintFaveNum()
		{
		System.out.println(GetFaveNum());
		}
		
	public int GetFaveNum()
		{
		return this.favenum;
		}
		
	public void SetFaveNum(int fave)
		{
		this.favenum = fave;
		}
	
	}
