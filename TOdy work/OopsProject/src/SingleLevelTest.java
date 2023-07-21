
public class SingleLevelTest {

	public static void main(String[] args) {
		
		OldMobileNetwork n1 = new OldMobileNetwork("3G","4G");
		n1.showNetwork();
		
		System.out.println("----------");
		
		NewMobileNetwork n2 = new NewMobileNetwork("3G","4G" ,"5G");
		n2.showNetwork();
		
		
		System.out.println("----------");
		SatelliteCall n3 = new SatelliteCall("3G","4G" ,"5G" , "Yes");
		n3.showNetwork();
		
	}
	

}

class OldMobileNetwork
{
	private String net1;
	private String net2;
	
	OldMobileNetwork(String net1 , String net2)
	{
		this.net1= net1;
		this.net2= net2;
	}
	
	void showNetwork()
	{
		System.out.println("Network is : " +net1);
		System.out.println("Network is : " +net2);
	}
}

class NewMobileNetwork extends OldMobileNetwork
{
	private String net3;
	NewMobileNetwork(String net1 , String net2 , String net3)
	{
		super(net1 , net2);
		this.net3= net3;
	}
	
	void showNetwork()
	{
		super.showNetwork();
		System.out.println("Network is : " +net3);
	}
	
}

class SatelliteCall extends NewMobileNetwork
{
	private String sat;
	SatelliteCall(String net1 , String net2 , String net3 , String sat)
	{
		super(net1 , net2 ,net3);
		this.sat= sat;
	}
	
	void showNetwork()
	{
		super.showNetwork();
		System.out.println("is satellite call Present : " +sat);
		
	}
	
}



