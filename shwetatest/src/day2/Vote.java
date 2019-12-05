package day2;

public class Vote {
	
	static void casteVote(int age)
	{
		if( age<18)
		{
			throw new ArithmeticException("Not eligilble ");
		}
		else
		{
			System.out.println("Eligible to vote");
		}
	}
	public static void main(String[] args) throws Throwable {
		casteVote(19);
		Thread.sleep(5000);
		System.out.println("End of code");
		
	}

}

