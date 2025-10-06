import java.util.*;
public class NULLPOINTER
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter String");
		String a;
		a=sc.next();
		try
		{
			String b=null;
		
			System.out.println("Length of string is  "+b.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("The String lenght is null!!!");
		}
		System.out.println("Length of string is  "+a.length());
	}
}