
public class PerfectNumber {
	
	public void isPerfect(int number)
	{
		int temp = 0;
		
		for(int i=1; i <= number/2; i++)
		{
			if((number%i)==0)
			{
				temp+=i;
				System.out.println("Divisor = " + i);
			}
		}
		
		if(temp == number)
		{
			System.out.println( number + " is perfect number");
		}
		else
		{
			System.out.println( " is not a perfect number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PerfectNumber n = new PerfectNumber();
		n.isPerfect(36);
		
	}

}
