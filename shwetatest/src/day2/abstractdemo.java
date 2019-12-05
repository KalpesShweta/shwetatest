package day2;

abstract class entry
{
	
	public void test()
{
}
//below test2 is abstract method thats why class entry has to be abstract
	//sybclass need to be abstract or u implemnet abstarct method
	//tht means provide body and u can use it in subclass
abstract public void test2();


}


class BankOfamerica extends Bank
{
	public int rateofinterest()
	 {
		 return 8;
	 }
}
class WellsFargo extends Bank
{
	public int rateofinterest()
	 {
		 return 6;
	 }
}
abstract class Bank
{
	abstract public int rateofinterest();	
}

 public class abstractdemo  {
	 //implementing  abstract method in child class so no need to add abstract keyword to chidl class 
	 public void test2()
	 {
		 System.out.println("test2 abstarct methid");
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Bank b;
	b= new BankOfamerica();
	System.out.println("Bank of america rate " +b.rateofinterest());
	b= new WellsFargo();
	System.out.println("Bank of america rate "+ b.rateofinterest());
 
	}

	
}
