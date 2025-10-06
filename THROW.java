import java.util.*;
public class THROW
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age");
		int age=sc.nextInt();
		if(age>18)
		{
			System.out.println("Valid User");
		}
		else
		{
			throw new ArithmeticException("Invalid Userrrr!!!!!!");
		}
		System.out.println("WELCOMEEEEEE TOOOOO VOTINGGGG MANAGEMENT............SYSTEM!!!!!!!!!!");
	}
}