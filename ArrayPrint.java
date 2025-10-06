import java.util.*;
public class ArrayPrint
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements for the array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			System.out.println("ENter "+i+" element "+arr[i]);			
		}
		for(int i=0;i<size;i++)
		{
			System.out.println("Array "+i+" Elements is "+arr[i]);
		}
	}
}