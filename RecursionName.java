package Recursion;

class Naming
{
	static int c=0;
	public static void isname(int n)
	{
		c++;
		if(c<=n)
		{
			System.out.println("java");
			
			isname(n);

		}
	}
}
public class RecursionName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Naming.isname(5);
		
		
		
	
		
		

	}

}
