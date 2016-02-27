public class SumOfDigits
{
	public static void main(String []args)
	{
		int number = 12345; // Sum should be 6.
		int mod;
		int sum=0;
		while (number>0)
		{
			mod = number%10;
			number=number/10;
			sum += mod;
		}
		
		System.out.println("sum =" + sum);
	}
}