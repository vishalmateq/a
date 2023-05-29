import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
	public Server() throws RemoteException {
		super();
	}
	
    
    	public static void main(String args[]) throws RemoteException {

    		try 
    	    {
    		circleImpl ci = new circleImpl();           //creating object for method implementation
    		
    		Registry reg = LocateRegistry.createRegistry(1054);
    		reg.rebind("circle", ci);

    		System.out.println("Server is waiting....");
    	
            }
    		catch(Exception e) 
    		{
        	   System.out.println("Exception found at server " + e.getMessage() );
            }
	
	}
}
