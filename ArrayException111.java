import java.util.*;
public class ArrayException111
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements for the Array:");
		for(int j=0;j<size;j++)
		{
			arr[j]=sc.nextInt();
		}
		System.out.println("Enter index number you want to print");
		int i=sc.nextInt();
		
		try
		{
			System.out.println("ARRAY ELEMENTS IS :"+ arr[i]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ARRAY IS OUT OFF RANGE!!!");
		}
	}
}