import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TestBlockingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final BlockingQueue q = new LinkedBlockingQueue<>();
		
		Thread producerThread = new Thread(new Producer(q));
		Thread consumerThread = new Thread(new Consumer(q));
		
		producerThread.start();
		consumerThread.start();

	}

}
