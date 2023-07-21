
public class BikeTest {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.idOfPeolpe(1,2);

	}

}

class Bike{
	
	void idOfPeolpe()
	{
		System.out.println("No one is on Bike");
	}
	
	void idOfPeolpe(int id1)
	{
		System.out.println("id of People on bike :" +id1);
	}
	
	void idOfPeolpe(int id1 , int id2 )
	{
		System.out.println("id of 1st person :" + id1 + "and id of second person" +id2);
	}
	
	void idOfPeolpe(float id1 , int id2 )
	{
		System.out.println("id of 1st person :" + id1 + "and id of second person" +id2);
	}
	
}