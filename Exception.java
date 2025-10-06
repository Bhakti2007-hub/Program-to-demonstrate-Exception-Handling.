import java.util.*;
public class Exception
{
	public static void main(String args[])
	{
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println("Division is: "+c);
		int d=a+b;
		System.out.println("Addition is: "+d);
	}
}
/*through an runtime error means a/b is not possible so we got the runtime error and because of that error we cant get after output of the code means it disrupt the all code for this we use 
try-catch block*/