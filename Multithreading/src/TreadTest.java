import java.util.Iterator;

public class TreadTest {

	public static void main(String[] args) {
		Car car1 = new Car("Swift" , 1000);
		Car car2 = new Car("\tSkoda" , 1000);
		Car car3 = new Car("\t \t KIA" , 1000);
		
		car1.start();
		car2.start();
		car3.start();
		
		
		
		Car bus1 = new Car("PMT" , 10);
		Car bus2 = new Car("\tShivneari" , 100);
		Car bus3 = new Car("\t \t Shivshahi" , 10);
		
		car1.start();
		car2.start();
		car3.start();
		
		
	}

}

class Car extends Thread
{
	String model;
	int delay;
	public Car(String model, int delay) {
		super();
		this.model = model;
		this.delay = delay;
	}
	
	public void run() {
		for(int i = 1; i<=10; i++)
		{
			System.out.println(model + "  running  " +i);
		}
		
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	
}





class Bus extends Thread
{
	String model;
	int delay;
	public Bus(String model, int delay) {
		super();
		this.model = model;
		this.delay = delay;
	}
	
	public void run() {
		for(int i = 1; i<=30; i++)
		{
			System.out.println(model + "  running  " +i);
		}
		
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	
}