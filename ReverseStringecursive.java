
public class ReverseStringecursive {

	
	public String reverse(String string)
	{
		String str;
		
		if(string.length()==1)
		{
			return string;
		}
		else
			
		{
			System.out.println("string.length()-1 ===" + (string.length()-1));
			System.out.println(string.charAt(string.length()-1));
			System.out.println(string.substring(0,string.length()-1));
			
			str=string.charAt(string.length()-1) + reverse(string.substring(0,string.length()-1));
	
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String atr="vishnu";
		
		//System.out.println("size =" + atr.length());
		
		ReverseStringecursive  nn = new ReverseStringecursive();
		
		System.out.println(nn.reverse(atr));

	}

}
