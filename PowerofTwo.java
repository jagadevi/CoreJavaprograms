
public class PowerofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4,9,16,25,36
		//2,3, 4, 5, 6
		int  n=33;
		if(Integer.bitCount(n) == 1)
		{
			System.out.println("power of 2");
		}
		else
		{
			System.out.println("no");
		}

	}

}
