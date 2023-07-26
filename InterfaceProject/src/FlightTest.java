
public class FlightTest {
	public static void main(String[] args) {
		
		CommercialFlight commFlight = new CommercialFlight();
		/*commFlight.checkTicket();
		commFlight.checkIdentityOfCPassengers();
		commFlight.fly();
		commFlight.land();
		*/
		
		System.out.println("-----------");
		
		FighterFlight fightFlight = new FighterFlight();
		/*fightFlight.armMissiles();
		fightFlight.fly();
		fightFlight.fireMissile();
		fightFlight.land();
		*/
		
		System.out.println("-----------");
		
		CargoFlight cargoFlight = new CargoFlight();
		/*cargoFlight.checkTheCapacity();
		cargoFlight.carryGoods();
		cargoFlight.fly();
		cargoFlight.land();
		*/
		
		RadarControlSystem.checkFlyingObjects(commFlight);
		RadarControlSystem.checkFlyingObjects(fightFlight);
		RadarControlSystem.checkFlyingObjects(cargoFlight);
		
		System.out.println("-------------------");
		
		GroundOperation.checkLandingStatus(commFlight);
		GroundOperation.checkLandingStatus(fightFlight);
		GroundOperation.checkLandingStatus(cargoFlight);
		
	}
}


class RadarControlSystem
{
	static void checkFlyingObjects(Flying x) {
		System.out.println("CHECKING FLYING OBJECT....");
		x.fly();
	}
}

class GroundOperation{
	static void checkLandingStatus(Landing x)
	{
		System.out.println("CHECKING Landing OBJECT....");
		x.land();
	}
}

interface Flying{
	void fly();
}

interface Landing{
	void land();
}

abstract class Flight implements Flying, Landing{
	
}
interface Ticketing{
	void checkTicket();
}

interface Fighting{
	void fireMissile();
}

interface Carrying{
	void carryGoods();
}


class CommercialFlight extends Flight implements Ticketing{

	
	public void fly() {
		System.out.println(" CommercialFlight is flying");
	}

	public void land() {
		System.out.println(" CommercialFlight is landinging");
	}

	public void checkTicket() {
		System.out.println(" CommercialFlight checking tiket ...");
	}
	
	public void checkIdentityOfCPassengers()
	{
		System.out.println("Commercial Flight is checking identities of passengers...");
	}
	
}





class FighterFlight extends Flight implements Fighting{

	
	public void fly() {
		System.out.println(" FighterFlight is flying");
	}

	public void land() {
		System.out.println(" FighterFlight is landinging");
	}

	public void fireMissile() {
		System.out.println("FighterFlight fire the missiles");
	}
	
	public void armMissiles() {
		System.out.println("Fighter Flight is arming the missiles...");
	}
	
}



class CargoFlight extends Flight implements Carrying {

	
	public void fly() {
		System.out.println(" CargoFlight is flying");
	}

	public void land() {
		System.out.println(" CargoFlight is landinging");
	}
	
	public void carryGoods() {
		System.out.println(" CargoFlight is carrying goods ...");
		
	}
	
	public void checkTheCapacity() {
		System.out.println("CargoFlight is checking the carriage capacity ");

	}
}

