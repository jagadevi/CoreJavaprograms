
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		int j =1;
		
		System.out.println(i);
		System.out.println(j);
		
		//1,1,2,3,5,8,13
		int l=0;
		for (int k =1; k <=10;k++)
		{
			l=i+j;
			System.out.println(l);
			i=j;
			j=l;
		}

	}

}
