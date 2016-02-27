import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestConCurrHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<Integer,String>();
		
		chm.put(1, "1");
		chm.put(2, "2");
		chm.put(3, "3");
		
		Iterator<Integer> it = chm.keySet().iterator();

		while(it.hasNext())
		{
			System.out.println(chm.get(it.next()));
			chm.put(6, "6");
		}
	}

}
