
public class PalindrmeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "1234321";
		
		StringBuffer sb = new StringBuffer(str);
		String rev = sb.reverse().toString();
		
		System.out.println(sb.toString());
		
		if(rev.equals(str))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("no");
		}
		

	}

}
