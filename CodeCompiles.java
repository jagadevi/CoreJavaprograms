
public class CodeCompiles {

	
	public CodeCompiles() {
		// TODO Auto-generated constructor stub
	}
	public static void display()
	{
		
	System.out.println("works");
	String name="Srija";
	StringBuffer sb = new StringBuffer(name);
	int index= sb.indexOf("a");
	
	sb.deleteCharAt(index);
	
	System.out.println(sb.toString());
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1CodeCompiles(null);
		display();
		short i = 0;
		int j = 07;
		//int k = 08;
		int l = 123456;
		//System.out.println(k);
	}
	

}
