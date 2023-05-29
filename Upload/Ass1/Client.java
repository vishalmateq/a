import java.net.MalformedURLException;
import java.rmi.*;
import java.util.Scanner;

public class Client {
	public Client() {
	}

	public static void main(String args[]) throws RemoteException, MalformedURLException, NotBoundException {
		
		try {
			int radius;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the radius of the circle");
			radius = sc.nextInt();

			circleInterface c = (circleInterface) Naming.lookup("rmi://localhost:1054/circle");

			System.out.printf("area = %.2f sq units \n" , c.area(radius));
			System.out.println();
			System.out.printf("perimeter = %.2f units \n" , c.perimeter(radius));
		}
		catch(Exception e)
		{
			System.out.println("Exception in client " + e.getMessage());
		}
	}
}
