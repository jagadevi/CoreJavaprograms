import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	
	BlockingQueue sharedQ;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
	}
	
	 public Producer(BlockingQueue q) {
		// TODO Auto-generated constructor stub
		 
		 sharedQ = q;
		 
		 for(int i=1; i <= 10; i ++)
		 {
			try {
				q.put(i);
				System.out.println("produced = " + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		 }
	}

}
