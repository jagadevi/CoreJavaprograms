
public class ReverseANumber {
	
	public Integer reverse(Integer n)
	{
		Integer ii=0 ;
		
		int mod = n%10;
		
		///System.out.println(mod);
		int reverse = 0;
		while(n !=0)
		{
			reverse = (n%10)+(reverse*10);
			System.out.println(reverse);
			n=n/10;
		}
		
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer num = 1234;
		
		ReverseANumber r = new ReverseANumber();
		System.out.println(r.reverse(num));

	}

}
