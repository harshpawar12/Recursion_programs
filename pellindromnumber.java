package Recursion;

public class pellindromnumber {
	
	static int rem=0,rev=0;
	public static int ispell(int n)
	{
		if(n<=0)
		{
			return rev;
		}
		else
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			return ispell(n);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=121;
		if(pellindromnumber.ispell(n)==n)
		{
			System.out.println("pellindrom");
		}
		else
		{
			System.out.println("not pell");
		}

	}

}
