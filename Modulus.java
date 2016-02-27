
public class Modulus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =22;
		int j = 6;
		
		int k = i/j;
		
		int mod = 0;
		
		if(j*k == i)
		{
			mod =0;
		}
		else if (j*k < i)
		{
			mod= i-j*k;
		}
		
		System.out.println(mod);

	}

}
