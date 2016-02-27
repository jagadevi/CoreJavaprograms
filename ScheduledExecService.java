import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecService implements Runnable{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScheduledExecService ex = new ScheduledExecService();
		//ex.ex();
		
		ScheduledExecutorService sdc = Executors.newScheduledThreadPool(3);
		
		//public void ex()
		{
			sdc.scheduleWithFixedDelay(ex, 5, 10, TimeUnit.SECONDS);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("hi");
		
	}

}
