package day2;

public class exception {
	
	
public static void main(String[] args) {
	int a=10,b=0;
	try
	{
	System.out.println(a/b);//will throw airthmetic excetion as result is infinte
	}
	catch( ArithmeticException ex)
	{
		System.err.println(ex.getMessage());
	}
	finally
	{
		System.out.println("end of code");
	}
}
}

