import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CallableTest implements Callable<String> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScheduledExecutorService sc = Executors.newScheduledThreadPool(3);
		
		CallableTest cl = new CallableTest();
		
		Future<String> str = sc.submit(cl);
		try {
			System.out.println("Returned value =" + str.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sc.shutdown();
		System.out.println(sc.isTerminated());
		
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("dsdasd");
		return "hi";
	}

}
