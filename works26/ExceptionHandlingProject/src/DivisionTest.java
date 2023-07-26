
public class DivisionTest {
	public static void main(String[] args) {
		System.out.println("BEGIN of main\n");
		

	
			try {
				Calculator.divide(100, 0);
			} catch (Exception e1) {
				System.out.println("Exception : "+e1);	
			}finally
			{
				System.out.println(" Finally runa at ones....");
			}
		
		
		try {
			Calculator.divide(40, 5);
		} catch (Exception e2) {
			System.out.println("Exception : "+e2);	

		}
		finally
		{
			System.out.println(" Finally runa at second time....");
		}
		
		try {
			Calculator.divide(60, 0);
		} catch (Exception e3) {
			System.out.println("Exception : "+e3);	

		}	
		finally
		{
			System.out.println(" Finally runa at 3rdTime....");
		}
		
		System.out.println("\nEND   of main");

	}
}

class Calculator
{
	/*static void divide(int num, int deno) {
		System.out.println("BEGIN of divide");
		System.out.println("Numerator   : "+num);
		System.out.println("Denominator :"+deno);
		System.out.println("Trying to divide "+num+ " by "+deno);
		if(deno!=0) { //BL
			int division  = num / deno ;
			System.out.println("Division    : "+division);
		}
		else {//EL
			System.out.println("CANNOT DIVIDE BY ZERO....");
		}
		System.out.println("END of divide\n");
	}*/

	static void divide(int num, int deno) throws Exception
	{
		System.out.println("\nBEGIN of divide");
		System.out.println("Numerator   : "+num);
		System.out.println("Denominator :"+deno);
		System.out.println("Trying to divide "+num+ " by "+deno);
		 
		int division  = num / deno ;
		System.out.println("Division    : "+division);
		
		//It is just for the Checked Exception 
		if(10>545) {
			throw new Exception("some problem....");
		}
		
		System.out.println("END of divide\n");
	}
}
