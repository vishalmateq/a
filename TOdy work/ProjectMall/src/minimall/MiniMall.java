package minimall;

public interface MiniMall {///
	
	void personChecking(); ///

	int getPrice();
}

abstract class ChromaStore implements MiniMall {

	double GST = 0.18;

	public ChromaStore(double GST) {
		this.GST = GST;
	}

}


//////////////////////////////////////////////////////////////////////////////////////////////////////////
class Laptop extends ChromaStore {

	private String brand;
	private String processor;
	private String ram;
	private int price;
	

	public Laptop(double GST, String brand, String processor, String ram, int price) {
		super(GST);
		this.brand = brand;
		this.processor = processor;
		this.ram = ram;
		this.price = price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getProcessor() {
		return processor;
	}


	public void setProcessor(String processor) {
		this.processor = processor;
	}


	public String getRam() {
		return ram;
	}


	public void setRam(String ram) {
		this.ram = ram;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = (int) (price * GST);
	}


	@Override
	public void personChecking() {
		System.out.println("Person is checked , now person is ready to enter the mall........");
	}
	
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Mobile extends ChromaStore{
	
	private String brand;
	private String ram;
	private String rom;
	private int price;
	
	public Mobile(double GST, String brand, String ram, String rom, int price) {
		super(GST);
		this.brand = brand;
		this.ram = ram;
		this.rom = rom;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getRom() {
		return rom;
	}

	public void setRom(String rom) {
		this.rom = rom;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public void personChecking() {
		System.out.println("Person is checked , now person is ready to enter the mall........");
		
	}
	
	
}


///////////////////////////////////////////////////////////////////////////////
class Cloth implements MiniMall{
	
	private String material; //
	private String color;
	private String type;
	private int price;
	
	public Cloth(String material, String color, String type, int price) {
		super();
		this.material = material;
		this.color = color;
		this.type = type;
		this.price = price;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public void personChecking() {
		System.out.println("Person is checked , now person is ready to enter the mall........");
	};
	
}


///////////////////////////////////////////////////////////////////////
class GameZone implements MiniMall
{
	
	private int price;
	private String name ;
	
	
	public GameZone(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public void personChecking() {
		System.out.println("Person is checked , now person is ready to enter the mall........");
		
	}

	@Override
	public int getPrice() {
		return 0;
	}
	
}
////////////////////////////

