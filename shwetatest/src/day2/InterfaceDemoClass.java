package day2;

interface Bank1
{
	int minBalance=25;
	public void depositMoney();
	public void withdrawMoney();
	
	
}

interface Bank2 //extneds bank1 // we can also us extend keyword and inherit bank1 and not implement in other class
{
	
	public void internetBanking();
	public void depositCheck();
	

public class InterfaceDemoClass implements Bank1 , Bank2{
	public static void main(String[] args) {
		InterfaceDemoClass b1 = new InterfaceDemoClass();
		b1.depositMoney();
		b1.withdrawMoney();
		b1.depositCheck();
	}

	@Override
	public void depositMoney() {
		System.out.println("depositMoney");
		
	}

	@Override
	public void withdrawMoney() {
		
		System.out.println("withdrawMoney");
	}

	@Override
	public void depositCheck() {
		System.out.println("depositCheck");	
	}

	@Override
	public void internetBanking() {
		
		System.out.println("internetBanking");
	}

}

}