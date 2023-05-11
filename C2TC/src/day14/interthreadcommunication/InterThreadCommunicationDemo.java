package day14.interthreadcommunication;

public class InterThreadCommunicationDemo {

	public static void main(String[] args) {
		//Shared resource
		Agent obj = new Agent ();
		
		Producer p1=new Producer(obj);
		Consumer c1=new Consumer(obj);
		
		p1.start();//producer thread
		c1.start();//consumer thread
	}

}

