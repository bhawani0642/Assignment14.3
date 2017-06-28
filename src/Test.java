/**
 * Creating a class Test it contains our main method
 * @author Pri
 *
 */
public class Test {

	public static void main(String[] args) {
		//created object of message class and passed the argument
		Message msg= new Message("done it");
		//created object of waiter class
		Waiter waiter= new Waiter(msg);
		//constructor of thread class,passing reference and calling the start method
		new Thread(waiter,"Waiter").start();;
		//created object of waiter1 class
		Waiter waiter1= new Waiter(msg);
		//constructor of thread class,passing reference and calling the start method
		new Thread(waiter1,"Waiter1").start();
		//created object of Notifier class
		Notifier notifire= new Notifier(msg);
		//constructor of thread class,passing reference and calling the start method
		new Thread(notifire,"notifier").start();
		//print line
		System.out.println("All thread started");
		
		
	}

}
