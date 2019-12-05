package day2;

import java.util.Scanner;

public class assignments {
	public static void main(String[] args) {

		

		// Factorial
		/*
		 * Scanner sc= new Scanner (System.in); int factorial=1;
		 * System.out.println("Enter number to calculate factorial: "); int
		 * n=sc.nextInt(); for(int i =1;i<=n;i++) { factorial*=i; }
		 * System.out.println("Factorila of entered no is : "+ factorial);
		 */

		// pascal triangle

		
		//  Scanner sc = new Scanner(System.in); System.out.
		//  println("Enter number of rows you would like to print for pascal triangle : "
		//  ); int n = sc.nextInt(); int[] previousRow; int[] currentRow = { 1 };
		//  previousRow = currentRow; printRow(currentRow); for (int i = 2; i <= n; i++)
		//  { currentRow = new int[i]; currentRow[0] = 1; currentRow[i - 1] = 1; for (int
		//  j = 0; j <= i - 3; j++) { currentRow[j + 1] = previousRow[j] + previousRow[j
		//  + 1]; } printRow(currentRow); previousRow = currentRow; }
		 
		
		
		//pasacl  traingle second way 
		/*
		 * int line=5; int a;
		 * 
		 * for(int i =0; i<=line;i++) {a=1; for(int j=1;j<=i;j++) { System.out.print(a
		 * +" "); a=a*(i-j)/j; }System.out.println(); }
		 */
		
		//string immutable cos of secuirty and thread safe.. create new string instead of modifying as it may effect security
		/*
		 * String str1="shweta"; String str2="shweta"; final String s3;
		 * s3="  shweta is good girl  "; //value cannot change as final varaible
		 * System.out.println(Integer.toHexString(str1.hashCode()));
		 * System.out.println(Integer.toHexString(str2.hashCode()));
		 * System.out.println(str1.substring(2));
		 * System.out.println(str1.substring(2,4)); System.out.println(s3.replace("g",
		 * "m")); System.out.println(s3.replaceFirst("g", "m"));//only first one will be
		 * replaced System.out.println(s3.trim());// removes osaces from starting and
		 * end System.out.println(s3.contains("s"));
		 * System.out.println(s3.indexOf("go")); System.out.println(s3.replace(" ",
		 * ""));// removes all spaces System.out.println(s3.split(" ")[2]);// split and
		 * stores in array
		 */		
		
		
		
		// HCF and LCM
				
		/*
		 * Scanner sc= new Scanner (System.in);
		 * System.out.println("Enter value of first number a: "); int x=sc.nextInt();
		 * System.out.println("Enter value of second number b: "); int y=sc.nextInt();
		 * int hcf=0; int count; if(x<y) count=x; else count=y; for(int i=1;i<=x;i++) {
		 * if((x%i==0 )&& (y%i==0)) hcf=i; }
		 * System.out.println("HCF of given two nos is: " +hcf);
		 * System.out.println("LCM of given two nos is: " +(x*y)/hcf);
		 */
		/*
		 * int a,b,t; a=x;b=y; while(b!=0) { t=b; b=a%b; a=t; }
		 * System.out.println("HCF of given two nos is: " +a);
		 * System.out.println("LCM of given two nos is: " +(x*y)/a);
		 */
				
		
		//palindrome
		/*
		 * int n =12321,sum=0; int temp=n; int reverse; while(n>0) { reverse=n%10;
		 * sum=(sum*10)+reverse; n=n/10; } if(sum==temp)
		 * System.out.println("Palindrome "); else
		 * System.out.println("Not Palindrome ");
		 */
		
	String s="aaabbbccdegld";
	//String output=s.replaceAll("(?i)(\\p{L}\\1)","$1");
	String output=s.replaceAll("(?s)(.)\\1+", "$1");
    System.out.println(output);
	}
	
	
	
	public static void printRow(int[] row) {
		for (int i = 0; i < row.length; i++) {
			System.out.print(row[i] + " ");
		}
		System.out.println();
	}

}
