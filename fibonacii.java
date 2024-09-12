package Recursion;

class fibo
{
	
	static int a=0,b=1,c;
	public static void isFibo(int n)
	{
		if(n>=1)
		{
			c=a+b;
			System.out.print(a+" ");
			a=b;
			b=c;
			isFibo(--n);
		}
	}
}
public class fibonacii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibo.isFibo(8);
		
	}

}
