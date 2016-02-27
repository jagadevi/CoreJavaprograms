
public class TrickyQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Compilation error .The method println(char[]) is ambiguous for the type PrintStream
		//System.out.println(null); // 
		
		int i = 10;
		int j = 12;
		
		 i = i + j;
		 j = i-j;
		 i=i-j;
		
		System.out.println(i);
		System.out.println(j);
		
		Integer intL = 4;
		
		System.out.println(intL.BYTES);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		
		Integer n1 = Integer.valueOf(128);
		Integer n2 = Integer.valueOf(128);;
		
		System.out.println((n1) == (n2));
		//System.out.println(n1.equals(n2));
		
		System.out.println(Math.pow(2, 5)); // Power of a number
		

	}

}
