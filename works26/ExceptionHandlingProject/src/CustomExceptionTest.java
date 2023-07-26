
public class CustomExceptionTest {
	public static void main(String[] args) 
	{
		System.out.println("MAIN started...\n");
		
		try {
			Car myCar = new Car();
			myCar.longDrive();
		}
		catch(CarKeyNotFoundException ex1) {
			System.out.println("Key Issue : "+ex1);
		} 
		catch (CarBatteryDownException ex2) {
			System.out.println("Battery Issue : "+ex2);
		}catch (CheckLicenceException ex3) {
			System.out.println("License Issue : "+ex3);
		} catch (seatBeltException ex4) {
			System.out.println("SeatBelt Issue : "+ex4);
		}
		System.out.println("\nMAIN finished...\n");
		
	}
}



class CarKeyNotFoundException extends Exception //checked
{
	CarKeyNotFoundException(String msg) {
		super(msg);
	}
}

class CarBatteryDownException extends Exception //checked
{
	CarBatteryDownException(String msg) {
		super(msg);
	}
}

class CheckLicenceException extends Exception //checked
{
	CheckLicenceException(String msg) {
		super(msg);
	}
}

class seatBeltException extends Exception //checked
{
	seatBeltException(String msg) {
		super(msg);
	}
}




class RedSignalDishnouredException extends RuntimeException //unchecked
{
	RedSignalDishnouredException(String msg) {
		super(msg);
	}
}

class TyrePuncturedException extends RuntimeException //unchecked
{
	TyrePuncturedException(String msg) {
		super(msg);
	}
}


class BrakeFailException extends RuntimeException //unchecked
{
	BrakeFailException(String msg) {
		super(msg);
	}
}


class AcFailException extends RuntimeException //unchecked
{
	AcFailException(String msg) {
		super(msg);
	}
}


class Car
{
	boolean keyFound=false;
	boolean carBatteryFunctioning=true;
	boolean takeLicense = false;
	boolean beltapply = false;
	
	Car() throws CarKeyNotFoundException, CarBatteryDownException , CheckLicenceException, seatBeltException
	{
		double value = Math.random()%10;
		
		if(value>=0.50) {
			keyFound=true;
		}
		
		if(value<0.10) {
			carBatteryFunctioning=false;
		}
		else {
			System.out.println("Car Battery is FINE...!!!");
		}
		
		if(carBatteryFunctioning==false) {
			CarBatteryDownException ex = new CarBatteryDownException("Car Battery is out of order...");
			throw ex;
		}
		
		if(value>=0.40) {
			takeLicense=true;
		}
		
		if(takeLicense == true)
		{
			System.out.println("You have take the license....");
		}
		else
		{
			throw new CheckLicenceException("Please take the licence...");
		}
		
		if(keyFound==true) {
			System.out.println("Car is started....");
			
		}
		else {
			//System.out.println("Car Key Not Found....");
			throw new CarKeyNotFoundException("Hey...Where is the Car Key? im not getting it...");
			
		}
		
		if(value >0.50)
		{
			beltapply =true;
		}
		
		if(beltapply==true) {
			System.out.println("you applied seat belt....");
			
		}
		else {
			
			throw new seatBeltException("Hey..where is the seat belt plesae apply it....");
			
		}
		
	}
	
	
	public void longDrive() {
		for (int i = 1; i <=30; i++) {
			System.out.println(i+" kms driven....");
			double value = Math.random()%10;
			if(value>0.96) {
				RedSignalDishnouredException ex1 = new RedSignalDishnouredException("Oh No!!! Red signal is dishonoured....");
				throw ex1;
			}
			else if(value>0.65 && value <=0.70) {
				TyrePuncturedException ex1 = new TyrePuncturedException("Oh No!!! tyre got punctured.......");
				throw ex1;
			}
			else if(value > 0.98) {
				BrakeFailException ex1 = new BrakeFailException("Oh No!!! break is Failed.......");
				throw ex1;
			}
			else if(value >0.85)
			{
				AcFailException ex1 = new AcFailException("Oh No!!! Ac is not .......");
				throw ex1;
			}
			
			
		}
	}
}