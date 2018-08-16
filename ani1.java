import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
	            String  input1=sc.next();
		String input2=sc.next();
		
		try
		{
			Integer.parseInt(input1);
			System.out.println(input1 + "is a numeric");
			
			
		}
		catch (NumberFormatException e)
		{
			System.out.println(input1 + "is not a numeric");
			
		}
		try
		{
			Integer.parseInt(input2);
			System.out.println(input2 + "is a numeric");
			
			
		}
		catch (NumberFormatException e)
		{
			System.out.println(input2 + "is not a numeric");
			
		}
	}
}
