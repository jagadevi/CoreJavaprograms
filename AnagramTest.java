import java.util.Arrays;

/**
 * a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.
 * @author jagad
 *
 */
public class AnagramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word1= "cinema";
		String word2 = "iceman";
		
		char [] arr1 = word1.toCharArray();
		char [] arr2 = word2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
				
		if(Arrays.equals(arr1,arr2))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("Noo");
		}
		
		int n = 123;
		String str = String.valueOf(n);
		String s = "456";
		int m = Integer.parseInt(s);
		
	}

}
