import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue sharedQ;
	
	public Consumer(BlockingQueue q) {
		// TODO Auto-generated constructor stub
		
		sharedQ = q;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(sharedQ.size() != 0)
		{
		
		try {
			System.out.println(sharedQ.take());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}

	
}
