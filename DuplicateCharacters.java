import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
	
	public void dup(String str)
	{
		Map<Character, Integer> m = new HashMap<Character,Integer>();
		
		for(int i=0; i< str.length();i++)
		{
			if(m.containsKey(str.charAt(i)))
			{
				int value = m.get(str.charAt(i));
				m.put(str.charAt(i), ++value);
			}
			else
			{
				m.put(str.charAt(i), 1);
			}
		}
		
		for(Character n : m.keySet())
		{
			if(m.get(n) >1)
			{
				System.out.println("Character " + n + " Is repeated for " + m.get(n) + " times " ) ;
			}
			else
			{
				System.out.println( n + " is single charcaetr");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DuplicateCharacters d = new DuplicateCharacters();
		d.dup("siddddappa");

	}

}
