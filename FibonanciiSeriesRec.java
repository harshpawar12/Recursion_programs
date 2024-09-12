package Recursion;

public class FibonanciiSeriesRec {
	
	static int a=0,b=1,c=0;
	static int c1=0;
	public static void isFibo(int n)
	{
		if(n>0)
		{
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;
			isFibo(n-1);	
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonanciiSeriesRec.isFibo(5);

	}

}
