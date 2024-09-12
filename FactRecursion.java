package Recursion;

public class FactRecursion {
	
	static int fact=1;
	public static int isFact(int n)
	{
		if(n==1)
		{
			return fact;
		}
		
		
		return n*isFact(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactRecursion.isFact(5);
		int fact=FactRecursion.isFact(5);
		System.out.println("Factorial of number:");
		System.out.println(fact);
		

	}

}
