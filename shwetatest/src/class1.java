import java.util.Scanner;
//overridng class example
 class parent
{
	 //commit test
public void test()
{
	System.out.println("Parent test running..");
}
}
public class class1 extends parent {
	
	  public void test() { System.out.println("Child test running.."); }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//example of overriding
		//class1 c= new class1();
		//c.test();
	
		//int a=10,b=20;
	  //  System.out.println("Addition is : " + (a+b));
         //System.out.println("hello");

		/* data types 
		 * byte(size=1 byte) -128 to +127
		 *  short(size=2 byte)
		 * int(size =4 byte) 
		 * float( size - 4 byte)
		 * double( size =8 byte)
		 * boolean ( true or false)
		 * char( 1 byte)
		 * Scanner scan = new Scanner(System.in); System.out.println("Enter float");
		 * Float User_Input=scan.nextFloat(); System.out.println("User input is :" ) ;
		 * System.out.print(User_Input);
		 */

		
		//math operators + - * / %
 	    //int x=70,y=30,answer=x%y;
		//System.out.println("Answer is " + answer);
		
		//increment/decrement( x++/x++) and assignment operators (+=,-=,*=,/=,%=)
		//int x=10;
		//System.out.println(x%=5);
		
		//conditional statements if(boolean_expression){}, if(){} else{}
		//comaprison or relational operator == , >=, <=, != ,< ,>
		/*
		 * int temp=5; if(temp>=10) {System.out.println("number is greater than 10 ");}
		 * else { System.out.println("less than 10 " ); }
		 */
		
		
		//logical operators and(&&) or (||)
		/*
		 * int sub1=25, sub2=65; if((sub1>=35) &&(sub2>=35))
		 * {System.out.println("condition true " );} else {
		 * System.out.println("condition false " );}
		 */
		
		//switch statement ( we use switch when we have to check multiple conditions)
		/*
		 * int score=32; switch(score) { case 90:
		 * System.out.println("score is very good " ); break; case 60:
		 * System.out.println("score is good " ); break; case 30:
		 * System.out.println("score is ok " ); break; default :
		 * System.out.println("grade is not defined" ); break; }
		 */
		//whenever u wnat to print same statements in switch then u can define case without break
		//for eg 
		//case 100:
		//case 90:
		//System.out.println("score is very good " );
		//break;
		
		//Loops most common loop is while loop in java ,, while excutes your loop until condition is met
		/*
		 * int a=0; while(a<10) {System.out.println(a); a++;}
		 */
		/*int a=100;
		while(a>=10)
		{System.out.println(a); 
		a--;}*/
		
		//do while loop 
		//syntax:- do{}while(condition)
		//difference between while and do while loop is
		// while loop first checks conidtion then run/excutes the statements in loop and do while runs first then chcek condition
		
		 // int b=0; do {System.out.println(b); b++; }while(b<=10);
		 
			
		//array is a set of same data types ...
		//array is lika varaible but it can have more than one valur of same data types 
		//three common ways to decalre array
		//int[] myintarray= {1,2,3,4};
		//int[] myintarray= new int[4];
		//int[] myintarray= new int []{1,2,3,4};
		/*
		 * int[] myintarray= {1,2,3,4}; int index=0; while(index<4) {
		 * System.out.println(myintarray[index]); index++; }
		 */
		 //for( int i =0; i<4;i++)
		// {System.out.println(myintarray[i]);
		 //}
		
		//one more way of using for loop with array is below
		//int[] myintarray= {1,2,3,4};
		//for( int element : myintarray)
		//{System.out.println(element);}
		
		//String mystring ="Hello world";System.out.println(mystring.toLowerCase());
		//System.out.println(mystring.indexOf('o'));
		
		
		//myFirstMethod();
		
		
		//  Student Tom= new Student("Tommy"); Tom.setAge(15); //Tom.setName("Tom");
		//  System.out.println("Student " + Tom.getName()+ " is " + Tom.getAge() );
		 
		
		/*
		 * //string memory and equal
		 * 
		 * String s1="Tekarch";//string pool
		 * 
		 * String s2= new String("Tekarch");//heap memory String s3="Tekarch";// string
		 * pool s3 is new obect reference to s1 memory
		 * 
		 * String s4= new String("Tekarch"); System.out.println(s1.equals(s2));//true
		 * equals compares only value System.out.println(s3.equals(s4));//true
		 * System.out.println(s1==s2);//false == compares value and memory location
		 * System.out.println(s3==s4);//false System.out.println(s1==s3);//true
		 */		
		
		//string compare return difference of ASCII value
	//	String s1="A";
		//String s2="B";
		//System.out.println(s1.compareTo(s2));
		/*
		 * String s1="   HELLO WORLD"; String s2="hello world";
		 * System.out.println(s1.compareToIgnoreCase(s2));
		 * System.out.println(s1.charAt(1)); System.out.println(s1.contains("L"));
		 * System.out.println(s1.endsWith("o")); System.out.println(s1.toLowerCase());
		 * System.out.println(s2.toUpperCase()); System.out.println(s1.length());
		 * System.out.println("Before trimming : "+s1); s1=s1.trim();// trimming example
		 * for string System.out.println("After trimming : "+s1);
		 * System.out.println(s1.length());
		 * 
		 * //split example String st="This is my world";
		 * 
		 * String a[]=st.split(" "); for (int i=0;i<a.length;i++)
		 * System.out.println(a[i]); //replace example for string
		 * System.out.println(st.replace("s", "r"));
		 * System.out.println(st.replace(" is", " are"));
		 */
		  
		//unique words and their occurence and display them
		
		
		
		  Scanner sc= new Scanner(System.in); System.out.println("Enter the string: ");
		  String str= sc.nextLine();
		 
		  String[] strarray=str.split(" ");
		  String uniqueArray="";
		  int count=0; 
		  for(int i =0;i<strarray.length;i++) 
		  {
			if( ! uniqueArray.contains( strarray[i]))
			{
				uniqueArray+=strarray[i] +" ";
			}
			//else
			//uniqueArray=	uniqueArray.replaceAll(strarray[i], "");
		   
		  } 
		// for(int j=0; j<uniqueArray.length;j++)
		  System.out.println("Unique words :"+ uniqueArray);
		 
		 // System.out.println("No of unique words" +strtemp.length);
		 
		
		//unqiue characters in string and display them
		
		/*  Scanner sc= new Scanner(System.in); 
		  System.out.println("Enter the string: ");
		  String str= sc.nextLine();
		  char[] chArray=str.toCharArray(); 
		  for(int i =0;i<chArray.length;i++) 
		  { 
			  for(int j=i+1;j<chArray.length;j++) 
			  { 
				  if(chArray[j]==chArray[i]) 
				  str= str.replace(chArray[i], ' '); 
			  } 
	      }
		  str=str.replace(" ", ""); 
		  System.out.println("unique characters in string :"+str);*/
		 
		 
		
		//total no of aplhabets , number and special characters in a given string
		
		 
		/*
		 * Scanner sc= new Scanner(System.in); System.out.println("Enter the string: ");
		 * String str= sc.nextLine(); char[] chArray=str.toCharArray(); int
		 * totLowerCaseCount=0,totUpperCaseCount=0, totNumbers=0,totSpecailChars=0; for(
		 * int i=0; i<str.length();i++) { if (str.charAt(i) >= 65 && str.charAt(i) <=
		 * 90) totUpperCaseCount++; else if (str.charAt(i) >= 97 && str.charAt(i) <=
		 * 122) totLowerCaseCount++; else if(str.charAt(i)>=48 && str.charAt(i)<=57)
		 * totNumbers++; else totSpecailChars++; }
		 * System.out.println("Total no of Alphabets is : " +(totLowerCaseCount+
		 * totUpperCaseCount)); System.out.println("Total Lower Case Chars : "+
		 * totLowerCaseCount); System.out.println("Total Upper Case Chars : "+
		 * totUpperCaseCount); System.out.println("Total No of Integers : "+
		 * totNumbers); System.out.println("Total No of Special Chars : "+
		 * totSpecailChars);
		 */
	
	}
	
}
/*
 * public static void myFirstMethod()//public static are access specifier
 * {System.out.println("hello");} }
 */
