//**********public main class 
public class Bike{
	public static void main(String[] args) {
		BikeInfo b1 = new BikeInfo(5963, "Pulser" , "Vishal" , 100000f , "Petrol");
		BikeInfo b2 = new BikeInfo("Electric",896, "OLA" , "Rohan" , 105000f);
		b1.getBike();
		System.out.println();
//		b2.getBike();
		
		System.out.println();
		b1.changePrice(125000);
		b1.getBike();
		
		
		System.out.println();
		float totalCost = b1.buyBike(2);
		System.out.println(" is "+totalCost);
		
		System.out.println();
		String type = b1.typeOfBike();
		System.out.println("Type of Bike is : " +type);
	}
}

//**********another class of bike information 
class BikeInfo 
{
	private int numberPlate;
	private String name;
	private String owner;
	private float price;
	private String type;
	
//	default constructor
//	Bike(){}
	
//Parameterized Constructor 
	BikeInfo(int numberPlate, String name, String owner, float price, String type) {
		this.numberPlate = numberPlate;
		this.name = name;
		this.owner = owner;
		this.price = price;
		this.type = type;
	}
	
	BikeInfo(String type,int numberPlate, String name, String owner, float price) {
		this.numberPlate = numberPlate;
		this.name = name;
		this.owner = owner;
		this.price = price;
		this.type = type;
	}
	
	//Variation of the function based on argument and return type
	// 1) no arg and no return 
	public void getBike()
	{
		System.out.println("Number plate no  : " +numberPlate );
		System.out.println("Name of bike     : " +name );
		System.out.println("Name of owner    : " +owner );
		System.out.println("Price of Bike    : " +price );
		System.out.println("Type of Bike is  : " +type);

	}
	
	//2)with arg and no return
	void changePrice(int newPrice)
	{
		System.out.println("Changing the price of bike...");
		price=newPrice;
	}
	
	
	//3)with arg and with return
	float buyBike(int quatity)
	{
		System.out.print(owner +" is buying " + quatity + " Bikes of name " + name +" With the total Price ");
		return quatity*price;
	}
	
	//4)without arg and with return
	String typeOfBike()
	{
		return type;
	}
	
}



