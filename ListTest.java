import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		
		list.add("1");
		
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		
		for(String ss : list)
		{
			System.out.println(ss);
		}
		
		
		//list.remove(2);
		int i =0;
		for(String ss : list)
		{						
			if(ss.equals("4"))
			{
				
				list.remove(i); // ConcurrentModificationException.
			}
			i++;
		}
		System.out.println("ffffffffffffffff");
		for(String ss : list)
		{
			System.out.println(ss);
		}
		
	}

}
