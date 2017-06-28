/**
 * Making another class Waiter it implements the runnable interface
 * @author Pri
 *
 */
public class Waiter implements Runnable{
	//Reference variable of message class
	private Message msg;
	//Constructor of Waiter class and passing the reference as argument
	public Waiter(Message m){
		msg=m;
		
	}
	//Overriding the run method as we have implemented runnable interface
	@Override
	public void run() {
		//Getting the name of the current running thread
		String name= Thread.currentThread().getName();
		// Applying the Synchronized keyword  so that only one thread can get access at a time
		synchronized (msg) {
			//the try block
			try {
				//Thread 1
				System.out.println(name+"  waiting to get notified at time"+System.currentTimeMillis());
				//putting the thread on wait
				msg.wait();
				//Catch block
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//thread 2
			System.out.println(name+ " waiter Thread is notified at time"+System.currentTimeMillis());
			//process the message now
			System.out.println(name+" proceesed "+ msg.getMsg());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
