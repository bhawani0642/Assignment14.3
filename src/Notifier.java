/**
 * creating a class notifier it implements the runnable interface
 * @author Pri
 *
 */
public class Notifier implements Runnable {
	//Reference variable of message class
private Message msg;
//Constructor of Notifier class and passing the reference as argument
public Notifier(Message m){
	msg=m;
}
@Override
public void run() {
	//Getting the name of the current running thread
	String name= Thread.currentThread().getName();
	//print line it should print the name of thread along with message we have passed
	System.out.println(name +" get started");
	try {
		//here we are putting our main Thread on sleep
		Thread.sleep(1000);
		//applying synchronized keywoprd and handing the exception
		synchronized (msg) {
			//called the setmsg method and pass the message
			msg.setMsg(name+"Notifer has done his work");
			//msg.notify();
			msg.notifyAll();
			
		}
	} catch (InterruptedException e) {
		
		
		
		e.printStackTrace();
	}
	
	
}
}
