package Recursion;

import java.util.Arrays;
import java.util.Scanner;

class sum1
{
	static int i=0;
	static int sum=0;
	int sum1=0;
	public static void ArrysSum(int a[])
	{		
		if(i<=a.length-1)
		{
			
				sum+=a[i++];
				
				
			
			ArrysSum(a);
		}
		System.out.println(sum);

	
	}
	
	
	
}
public class sumOfArray {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,5,6,7,8};
		sum1.ArrysSum(a);
		
		
	
		
	}

}
