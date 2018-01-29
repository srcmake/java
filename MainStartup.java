import java.util.*;

class MainStartup
	{     
    public static void main(String[] args)      
    	{
        System.out.println("Program began.");
  		
  		// Stack
  		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(4);
		stack.pop();
		stack.push(3);
		stack.push(2);
		stack.push(1);
  				
  		int stacksize = stack.size();
  		System.out.println("There are " + stacksize + " elements in the stack.");
  		
  		while(stack.isEmpty() == false)
  			{
  			int top = stack.peek();
  			System.out.print(top + " ");
  			stack.pop();
  			}
  		System.out.println();
  		
  		// Queue
  		Queue<Integer> q = new LinkedList<Integer>();		
  		q.add(4);
  		q.add(5);
  		q.add(2);
  		
  		int qsize = q.size();
  		System.out.println("There are " + qsize + " elements in the queue.");
  		
		while(q.isEmpty() == false)
			{
			int top = q.peek();
  			System.out.print(top + " ");
  			q.remove();
			}
  		System.out.println();
  		
  		// Priority Queues
  		PriorityQueue<String> pq = new PriorityQueue<String>();
  		
  		pq.add("B");
  		pq.add("Q");
  		pq.add("S");
  		pq.add("A");
  		pq.add("Z");
  		pq.add("X");
  		pq.add("L");
  		pq.add("P");
  		
  		int pqsize = pq.size();
  		System.out.println("There are " + pqsize + " elements in the priority queue.");
  		
  		while(pq.isEmpty() == false)
  			{
  			String top = pq.peek();
  			System.out.print(top + " ");
  			pq.remove();
  			}
  		System.out.println();
  				
  		
  		// Set
  		Set<String> set = new TreeSet<String>();
  		
  		set.add("src");
  		set.add("make");
  		set.add("java");
  		set.add("make");
  		set.add("src");
  		set.add("icecream");
  		set.add("curtains");
  		
  		int setsize = set.size();
  		System.out.println("There are " + setsize + " elements in the set.");
  		
  		for(String setitem : set)
  			{
  			System.out.print(" " + setitem + " |");
  			}
  		System.out.println();
  		
  		
  		// Hash Map
  		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("srcmake", 100);
		map.put("vegetables", 0);
		map.put("chocolate", 500);
		
		System.out.println("srcmake scores a value of " + map.get("srcmake"));
		
		for(Map.Entry<String, Integer> pair : map.entrySet())
			{
			String key = pair.getKey();
			int value = pair.getValue();
			
			System.out.println("Key: " + key + "\tValue: " + value);
			}
  				
        System.out.println("Program ended.");
        }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
