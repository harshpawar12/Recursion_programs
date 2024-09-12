package Recursion;



class pell
{
	public static boolean isPell(String s)
	{
		if(s.length()<=1)
		{
			return true;
		}
		if(s.charAt(0)!=s.charAt(s.length()-1))
		{
			return false;
		}
		return isPell(s.substring(1, s.length()-1));
	}
}
public class Stringpellindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="nitin";
		if(pell.isPell(s))
		{
			System.out.println("is pellindrom");
		}
		else
		{
			System.out.println("not pellindrom");
		}

	}

}
