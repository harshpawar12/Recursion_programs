package Recursion;


class sum
{
	static int c=1,sum=0;
	public static int isSum(int n)
	{
		c++;
		if(n>=1)
		{
			if(n%2==0)
			{
				sum+=n;
			}
			isSum(--n);
		}
		return sum;
	}
}
public class sumEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max=sum.isSum(6);
		System.out.println(max);
		
	}

}
