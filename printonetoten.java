package Recursion;


class print_no
{
	static int c=0;
	public static void isprinting(int n)
	{
		c++;
		if(c<=n)
		{
			
			System.out.println(c+" ");
			isprinting(n);
		}
		
	}
}
public class printonetoten {
	
	public static void main(String[] args) {
		print_no.isprinting(10);
	}

}
