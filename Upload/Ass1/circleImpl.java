import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class circleImpl extends UnicastRemoteObject implements circleInterface {
    public circleImpl() throws RemoteException {
        super();
    }

    public double area(int radius) throws RemoteException {
        double pi = 3.14;
        return pi * radius * radius;
    }

    public double perimeter(int radius) throws RemoteException {
        double pi = 3.14;
        return 2 * pi * radius;
    }
}

