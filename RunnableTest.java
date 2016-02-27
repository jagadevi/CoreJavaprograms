
public class RunnableTest  implements Runnable{
	
	Thread thr ;
	
	public static int n=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RunnableTest t = new RunnableTest();
		Thread th = new Thread(t,"name");
		th.start();
		System.out.println("value in main== " + ++n);
		System.out.println("value in main= " + ++n);
		System.out.println("value in main= " + ++n);

	}
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("value in thr== " + ++n);
				
	}

}
