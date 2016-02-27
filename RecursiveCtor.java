
public class RecursiveCtor {
	
	//public static RecursiveCtor rc = new RecursiveCtor(); // Exception in thread "main" java.lang.StackOverflowError
	
	public static void display()
	{
		System.out.println("display");
		
		Long i1=129L;
		Long i2 = 129L;
		
		String str = new String();
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i1==i2);
	}
	
	public int getvalue()
	{
		return (true?null:0);
	}
	 
	 public static void main(String[] args)  {
	 
		 RecursiveCtor rc = new RecursiveCtor();
		 RecursiveCtor cc = null;
		 cc.display(); // static methods can be called on a null object.
		// cc.getvalue();
	      
	    }
}
