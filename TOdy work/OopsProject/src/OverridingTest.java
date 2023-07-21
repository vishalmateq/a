
public class OverridingTest {

	public static void main(String[] args) {
	
//		Child x = new Child();
//		x.farming();
		
		Father x  = new Father();
		x.farming();
		x.banking();
		
	}

}

class Grandfather
{
	void farming()
	{
		System.out.println("GF : farming old style bull");
	}
	void banking()
	{
		System.out.println("Fater is Banking");
	}
	
}

class Father extends Grandfather
{
	void farming()
	{
//		super.farming();
		System.out.println("F : farming by Trctor");
	}
}

class Child extends Father
{
	void farming()
	{
		super.farming();
		System.out.println("C : farming robotic Trctor");
	}
	
	
	void javaCoding()
	{
		System.out.println("child is doing java coding");
	}
}