//import WashingMachineTest.Cloth;

public class WashingMachineTest {
	public static void main(String[] args) {
		
		try {
			WashingMachine washingMachine1=new WashingMachine();
			WashingMachine washingMachine2=new WashingMachine();
			WashingMachine washingMachine3=new WashingMachine();
			
			washingMachine1.start();	
			washingMachine2.start();
			washingMachine3.start();
		}
		
		
		catch (PowerModeOffException ex1){
			System.out.println("Power mode issue : "+ex1);
		}

	}
}


class PowerModeOffException extends Exception  //checked
{
	PowerModeOffException(String msg) {
		super(msg);
	}
}


class WaterNotFOundException extends RuntimeException 
{
	WaterNotFOundException(String msg) {
		super(msg);
	}
}

class LowVoltageFoundException extends RuntimeException 
{
	LowVoltageFoundException(String msg) {
		super(msg);
	}
}

class CutoutElectricityException extends RuntimeException 
{
	CutoutElectricityException(String msg) {
		super(msg);
	}
}

class Machine {
	
}

class WashingMachine extends Machine implements Runnable { 
	
	private boolean isSwitchOn=true;
	
	Runnable runnable;
	
	WashingMachine() throws PowerModeOffException {
		
		double value= Math.random()%10;
		
		if(value < 0.10) {
			isSwitchOn=false;
		}
		else {
			System.out.println("power mode is ON, Now you can use machine");
		}
		
		if(isSwitchOn==false) {
			PowerModeOffException ex = new PowerModeOffException("Power mode issue..");
			throw ex;
		}

//		runnable=this;
	}
	
	public void start() {
		run();
	}

//	WashingTub washTub = new WashingTub(7,"Metal"); //hasA
	
	Laundry wash(WashingPowder washPowder, Water water, Electricity elect, Cloth cloth[]) {
		
		double value = Math.random()%10;
		if(value>0.90) {
			LowVoltageFoundException ex1 = new LowVoltageFoundException("Low voltage Please Constact MSEB");
			throw ex1;
		}
		else if(value <0.10) {
			WaterNotFOundException ex1 = new WaterNotFOundException("Please Give Sufficient Water .");
			throw ex1;
		}
		else if(value<0.20) {
			CutoutElectricityException ex1 = new CutoutElectricityException("Electricity is cutout");
			throw ex1;
		}
		
		Laundry laundry=new Laundry();
		laundry.setNumberOfCloths(cloth.length);
		laundry.setTimeRequired(1.7f);
		laundry.setWaterUsed(water.getQuantity());
		laundry.setElectricityUsed(elect.getUnitUsed());
		laundry.setCostOfWashingPowder(washPowder.getPrice());
		float cost=washPowder.getPrice()+(elect.getUnitUsed()*elect.getCostPerUnit());
		laundry.setTotalCost(cost);
		laundry.setCostPerCloth(cost/cloth.length);
		return laundry;
	}

	@Override
	public void run() {
		
		Cloth cloth[]=new Cloth[3];
		cloth[0] = new Cloth("Cotton", "Yellow", 900, "Shirt", false);
		cloth[1] = new Cloth("Slik", "Black", 500, "sari", false);
		cloth[2] = new Cloth("polyster", "white", 400, "kurta", false);
		
		Water water=new Water("Soft",25,"40C");
		
		Electricity elect=new Electricity("AC",220f,10,5,"MSEB");
		
		WashingPowder washPowder = new WashingPowder(1,"Nirma", "Front Load", true, 10.0f);
		
		Laundry laundry1=this.wash(washPowder,water,elect,cloth);
		
		System.out.println("--------------------------");
		laundry1.showLaundryDetails();
//		System.out.println(laundry1);
	}
}

class Laundry {
	 private int numberOfCloths; //cloth.length
	 private float timeRequired;
	 private float totalCost ;// cloth.length * price per cloth
	 private float waterUsed;
	 private float electricityUsed;
	 private float costOfWashingPowder; //
	 private float costPerCloth;
	
	public Laundry() {
		
	}
	
	public Laundry(int numberOfCloths, float timeRequired, float totalCost, float waterUsed, float electricityUsed,
			float costOfWashingPowder) {
		super();
		this.numberOfCloths = numberOfCloths;
		this.timeRequired = timeRequired;
		this.totalCost = totalCost;
		this.waterUsed = waterUsed;
		this.electricityUsed = electricityUsed;
		this.costOfWashingPowder = costOfWashingPowder;
	}

	@Override
	public String toString() {
		return "Laundry [numberOfCloths=" + numberOfCloths + ", timeRequired=" + timeRequired + ", totalCost="
				+ totalCost + ", waterUsed=" + waterUsed + ", electricityUsed=" + electricityUsed
				+ ", costOfWashingPowder=" + costOfWashingPowder + "]";
	}

	public int getNumberOfCloths() {
		return numberOfCloths;
	}

	public void setNumberOfCloths(int numberOfCloths) {
		this.numberOfCloths = numberOfCloths;
	}

	public float getTimeRequired() {
		return timeRequired;
	}

	public void setTimeRequired(float timeRequired) {
		this.timeRequired = timeRequired;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	public float getWaterUsed() {
		return waterUsed;
	}

	public void setWaterUsed(float waterUsed) {
		this.waterUsed = waterUsed;
	}

	public float getElectricityUsed() {
		return electricityUsed;
	}

	public void setElectricityUsed(float electricityUsed) {
		this.electricityUsed = electricityUsed;
	}

	public float getCostOfWashingPowder() {
		return costOfWashingPowder;
	}

	public void setCostOfWashingPowder(float costOfWashingPowder) {
		this.costOfWashingPowder = costOfWashingPowder;
	}
	
	
	public float getCostPerCloth() {
		return costPerCloth;
	}

	public void setCostPerCloth(float costPerCloth) {
		this.costPerCloth = costPerCloth;
	}

	public void showLaundryDetails() {
		System.out.println("Number of cloths : "+numberOfCloths);
		System.out.println("Time required : "+timeRequired);
		System.out.println("Total cost : "+totalCost);
		System.out.println("Water used : "+waterUsed);
		System.out.println("Electricity used : "+electricityUsed);
		System.out.println("Cost of washing powder : "+costOfWashingPowder);
		System.out.println("Cost per cloth : "+costPerCloth);
	}
	
}

class Tub {
	
}

class WashingTub  extends Tub {
	private int capacity;
	private String type; //
	public WashingTub(int capacity, String type) {
		super();
		this.capacity = capacity;
		this.type = type;
	}
	@Override
	public String toString() {
		return "WashingTub [capacity=" + capacity + ", type=" + type + "]";
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}

class Powder {
	
}

class WashingPowder extends Powder { // isA

	private int quantity;
	private String brand;
	private String type;
	private boolean scented;
	private float price;
	
	public WashingPowder(int quantity, String brand, String type, boolean scented, float price) {
		super();
		this.quantity = quantity;
		this.brand = brand;
		this.type = type;
		this.scented = scented;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "WashingPowder [quantity=" + quantity + ", brand=" + brand + ", type=" + type + ", scented=" + scented
				+ ", price=" + price + "]";
	}
	/*public String toString() {
		String str = (scented) ? "Scented" :"Not Scented";
		return str+ " "+brand+" Washing Powder of "+type+ " type quantity used "+quantity+ " grams ";
	}*/

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isScented() {
		return scented;
	}

	public void setScented(boolean scented) {
		this.scented = scented;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}	
	
}

class Water {
	private String type;
	private int quantity;
	private String temperature;
	
	public Water(String type, int quantity, String temperature) {
		super();
		this.type = type;
		this.quantity = quantity;
		this.temperature = temperature;
	}
	@Override
	public String toString() {
		return "Water [type=" + type + ", quantity=" + quantity + ", temperature=" + temperature + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

}

class Electricity {
	private String type; //ac dc
	private float voltage; 
	private int costPerUnit;
	private int unitUsed;
	private String supplier;
	public Electricity(String type, float voltage, int costPerUnit, int unitUsed, String supplier) {
		super();
		this.type = type;
		this.voltage = voltage;
		this.costPerUnit = costPerUnit;
		this.unitUsed = unitUsed;
		this.supplier = supplier;
	}
	@Override
	public String toString() {
		return "Electricity [type=" + type + ", voltage=" + voltage + ", costPerUnit=" + costPerUnit + ", unitUsed="
				+ unitUsed + ", supplier=" + supplier + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getVoltage() {
		return voltage;
	}
	public void setVoltage(float voltage) {
		this.voltage = voltage;
	}
	public int getCostPerUnit() {
		return costPerUnit;
	}
	public void setCostPerUnit(int costPerUnit) {
		this.costPerUnit = costPerUnit;
	}
	public int getUnitUsed() {
		return unitUsed;
	}
	public void setUnitUsed(int unitUsed) {
		this.unitUsed = unitUsed;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
}

class Cloth {
	private String material; //
	private String color;
	private float cost;
	private String type;
	private boolean clean; //
	
	public Cloth(String material, String color, float cost, String type, boolean clean) {
		super();
		this.material = material;
		this.color = color;
		this.cost = cost;
		this.type = type;
		this.clean = clean;
	}
	@Override
	public String toString() {
		return "Cloth [material=" + material + ", color=" + color + ", cost=" + cost + ", type=" + type + ", clean="
				+ clean + "]";
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isClean() {
		return clean;
	}
	public void setClean(boolean clean) {
		this.clean = clean;
	}
		
}