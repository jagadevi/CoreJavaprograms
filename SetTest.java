import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<String>();
		
		
		
		
		set.add("1");
		set.add("2");
		set.add("20");
		
		set.add("4");
		Iterator it = set.iterator();
		
		set.add("5"); // If you add also no exception, just replaces it.
		set.add("5");
		set.add("3");
		set.add(" ");
		set.add(null);
		
	
		
		try
		{
		for(String str : set)
		{
			//System.out.println(str);
			System.out.println(" String = before" + str);
			set.remove("dd"); // This does not throw exception as the object is not present.
			set.remove("1");
			//set.add("ff");
			
		}
		}
		catch(ConcurrentModificationException cm)
		{
			cm.printStackTrace();
		}
		
		for(String str : set)
		{
			//System.out.println(str);
			System.out.println(" String = after exc" + str);
			//set.remove("dd"); // This does not throw exception as the object is not present.
			//set.remove("1");
			//set.add("ff");
			
		}
		
		/*while(it.hasNext())
		{
			it.next();
			it.remove(); // This does not throw exception.
			
		}
		
		for(String str : set)
		{
			System.out.println(" String = after" + str);
			set.remove("dd"); // This does not throw exception as the object is not present.
			//set.remove("1");
			//set.add("ff");
			
		}*/

	}

}
