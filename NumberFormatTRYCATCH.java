import java.util.*;
public class NumberFormatTRYCATCH
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		try
		{
			int num=Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			System.out.println("We cannot Convert string into integer");
		}
	}
}