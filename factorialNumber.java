package Recursion;

import java.util.Scanner;

class facto
{
	static int fact=1;
	public static int isfact(int n)
	{
	
		if(n>=1)
		{
			fact=fact*n;
			isfact(n-1);
		}
		
		return fact;
		
	}
}
public class factorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		facto d=new facto();
		int fac=d.isfact(n);
		
		System.out.println("factorial is:"+fac);

	}

}
