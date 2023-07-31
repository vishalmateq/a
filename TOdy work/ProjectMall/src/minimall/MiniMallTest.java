package minimall;
import java.util.ArrayList;
import minimall.Laptop;
import java.util.Iterator;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class MiniMallTest {

	public static void main(String[] args) {
		
		ChromaStore laptop = new Laptop(0.18, "HP", "i3" , "4GB", 40000);
		ChromaStore mobile = new Mobile(0.18, "Oneplus",  "4GB", "128GB", 25000 );
		Cloth cloth        = new Cloth("cotton", "black", "Shirt", 500);
		
		laptop.personChecking();
		mobile.personChecking();
		cloth.personChecking();
		
		ArrayList customerList = new ArrayList();
		
		Customer customer1=new Customer( "vishal","online",laptop);
		Customer customer2=new Customer("rohan","cash",mobile);
		Customer customer3=new Customer( "mohan","cash",cloth);
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		
		
		Iterator logIterator = customerList.iterator();
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("customer.txt", false); //true means append to the file

 			String str="";
			while(logIterator.hasNext()) {
				Customer x = (Customer) logIterator.next(); //cast it to Log, as it was added as an Object
				str=x.toString()+"\n";
				byte array[] = str.getBytes(); //converts the string into a byte array
				fileOutputStream.write(array);
			}
			
			//System.out.println("String is written to the file");

			fileOutputStream.close();
			//System.out.println("File is closed now...");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		customer1.run();
		customer2.run();
		customer3.run();
		
		
		
		
	}

}


class Billing{
	
	private String custName;
	private String product;
	private int price;
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Billing [custName=" + custName + ", product=" + product + ", price=" + price + "]";
	}
	
	
}


class Customer extends Thread{
	

	private String name;
	private String paymentType;
	MiniMall mall;
	
	public Customer(String name, String paymentType, MiniMall mall) {
		super();
	
		this.name = name;
		this.paymentType = paymentType;
		this.mall = mall;
	}
	
	public void run()
	{
		Billing bill = this.customers(mall);
		System.out.println(mall);
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", paymentType=" + paymentType + ", mall=" + mall + "]";
	}

	Billing customers(MiniMall mall) {
		
		
		Billing Bill=new Billing();
		
		Bill.setCustName(this.name);
		Bill.setProduct(mall.getClass().getSimpleName());
		Bill.setPrice(mall.getPrice());
		
//		try {
//			//1. Load the Driver
//			Class.forName("org.hsqldb.jdbc.JDBCDriver");
//			
//			//2. Acquire the connection
//			Connection conn = 	DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
//			
//			//3. make a desired statement (insert/update/delete/select)
//			PreparedStatement pst = conn.prepareStatement("INSERT INTO SALESINFO VALUES (?,?,?,?)");
//			
//			pst.setString(1, Bill.getCustName());
//			pst.setString(2, Bill.getProduct());
//			pst.setInt(3,Bill.getPrice());
//			
//			System.out.println("PreparedStatement is created : "+ pst);
//			
//			//4. execute that statement //  UR TABLENAME IS MYDEPT120
//			int rows = pst.executeUpdate();
//			
//			System.out.println("Rows created : "+rows);
//			
//			//6. close the statement, and connection
//			
//			pst.close();
//			conn.close();
//		} 
//		catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		
		return Bill;
	}
	
}
	
	
//Billing makeBill (Laptop l , Mobile m , Cloth c) {
//		
//		
//		Billing b =new Billing();
//		
//	    b.setCustName(this.name);
//		b.setProduct(mall.getClass().getSimpleName());
//		b.setPrice((l.getPrice()) +(m.getPrice() + c.getPrice()) );
//	
//		return b;
//  }
//
//}
