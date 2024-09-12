package Recursion;

class oddSum
{
	static int sum=0,c=1;
	public static int isOddSum(int n)
	{
		if(n>=1)
		{
			if(n%2==0)
			{
				sum+=n;
			}
			isOddSum(--n);
		}
		return sum;
	}
}
public class oddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int x=oddSum.isOddSum(10);
		System.out.println("sum of odd numbers:");
		System.out.println(x);

	}

}
