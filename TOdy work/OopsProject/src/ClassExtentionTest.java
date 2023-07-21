
public class ClassExtentionTest {
	public static void main(String[] args) {
		
//****** Normal object  creation	
//		Doctor x = new Doctor();
//		x.diagnose();
		
//		Surgeon x = new Surgeon();
//		x.diagnose();
		
//		HeartSurgeon x = new HeartSurgeon();
//		x.diagnose();
	
		Surgeon x = new Surgeon();
		x.diagnose();// At compiletime binding Doctor :: diagnose()
		             // at runtime it find Surgeon 
		             // hence runtime binding is  of HeartSurgeon::diagnose()
		x.cut();
		x.stich();
		
//******We can maker the object in hierarchical order 
//------------Here we can use only the overide method at not the own method of a object --------
//      We can go from [Top ---> Bottom]
//		Doctor x = new Surgeon();
//		Doctor x = new HeartSurgeon();
//		Surgeon x = new HeartSurgeon();
		
		
//******We can't go from [Bottom ---> Top]
//		HeartSurgeon x = new Doctor();
		//Type mismatch:
		// cannot convert from Doctor to HeartSurgeon
/*
		if(x instanceof Doctor) {
			System.out.println(" its a doctor's obj");
		}else
		{
			System.out.println(" its not a doctor's obj");
		}
		
		if(x instanceof Surgeon) {
			System.out.println(" its a surgeon's obj");
		}else
		{
			System.out.println(" its not a surgeon's obj");
		}
		
		if(x instanceof HeartSurgeon) {
			System.out.println(" its a HeartSurgeon's obj");
		}else
		{
			System.out.println(" its not a HeartSurgeon's obj");
		}
*/	
	}
}

class Doctor{
	void diagnose() //exclusive to Doctor
	{
		System.out.println("Doctor : is Dignosing and ENT checkup ");
	}
	void prescribe() //exclusive to Doctor
	{
		System.out.println("Doctor : is prescribing .. RGB pills ");
	}
	void charge() //exclusive to Doctor
	{
		System.out.println("Doctor : ischarging 300 rs ");
	}
}

class Surgeon extends Doctor{
	//diagnose is inherited to Surgeon
	void diagnose() // Method overriding
	{
		System.out.println("Surgeon : is Dignosing... CT Scan");
	}
	void prescribe() 
	{
		System.out.println("Surgeon : is prescribing .. expensive pills ");
	}
	void charge()
	{
		System.out.println("Surgeon : ischarging 1000 rs");
	}
	void cut()
	{
		System.out.println("Surgeon : is cutting......");
	}
	void stich()
	{
		System.out.println("Surgeon : is Stiching.....");
	}
}

class HeartSurgeon extends Surgeon{
	void diagnose() // Method overriding
	{
		System.out.println("HeartSurgeon : is Dignosing... ECGreport");
	}
	
	void prescribe() 
	{
		System.out.println("HeartSurgeon : is prescribing .. expensive pills . . pluse yooga ");
	}
	void charge()
	{
		System.out.println("HeartSurgeon : ischarging 5000");
	}
}

