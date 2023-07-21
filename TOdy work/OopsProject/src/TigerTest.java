
public class TigerTest {

	public static void main(String[] args) {
		
		Tiger t = new Tiger();
		t.jump();
	}

}

class Tiger
{
	void jump()
	{
		System.out.println("Tiger : jump()is jumpiung");
	}
	
	void jump(int length)
	{
		System.out.println("Tiger : jump(int) is jumpiung..."+ length + " long");
	}
	
	void jump(int length, int height)
	{
		System.out.println("Tiger : jump(int , int) is jumpiung..."+ length + " length" + height + "long height");
	}
	
	void jump (float length)
	{
		System.out.println("Tiger : jump(float) is jumpiung..."+ length + " long");
	}
	
	void jump(int length, float height)
	{
		System.out.println("Tiger : jump(int , float) is jumpiung..."+ length + " length" + height + "long height");
	}
	void jump(float length, int height)
	{
		System.out.println("Tiger : jump(float,int) is jumpiung..."+ length + " length" + height + "long height");
	}
}