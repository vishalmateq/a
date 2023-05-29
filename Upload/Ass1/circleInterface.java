import java.rmi.*;

public interface circleInterface extends Remote {
	//creating methods only Declaration
	public double area(int radius) throws RemoteException;

	public double perimeter(int radius) throws RemoteException;
}
