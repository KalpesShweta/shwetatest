package day2;

import java.util.Scanner;

//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Scanner;

public class Day2test {
	
	public static void print(char a[], int n, int ind) {

// Create an auxiliary array  
// of twice size. 
		char[] b = new char[(2 * n)];

// Copy a[] to b[] two times  
		for (int i = 0; i < n; i++)
			b[i] = b[n + i] = a[i];

// print from ind-th index to  
// (n+i)th index. 
		for (int i = ind; i < n + ind; i++)
			System.out.print(b[i] + " ");
	}

	static boolean isSubset(int arr1[], int arr2[], int m, int n) {
		int i = 0;
		int j = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++)
				if (arr2[i] == arr1[j])
					break;

			/*
			 * If the above inner loop was not broken at all then arr2[i] is not present in
			 * arr1[]
			 */
			if (j == m)
				return false;
		}

		/*
		 * If we reach here then all elements of arr2[] are present in arr1[]
		 */
		return true;
	}

	public static void main(String[] args) {
String s1="1234";
String s2="2345";
System.out.println(String.valueOf(Integer.parseInt(s1) + Integer.parseInt(s2) ));
		// Give sum of elements of array
		/*
		 * int a[]= {1,2,3,4,5,6,7,8,9,10}; Scanner sc= new Scanner(System.in);
		 * System.out.println("Enter number of elemnets you wnat to add in array of"+
		 * a.length+" elemnts :"); int k= sc.nextInt(); int sum=0; for(int i =0; i
		 * <k;i++) { sum+=a[i]; } System.out.println("Sum is " + sum);
		 */

		// return sum of diagonal element in 3x3 array and return value below diagonal
		/*
		 * int a[][]= { {1,2,3}, {4,5,6},{7,8,9}}; int sum=0; String value=""; for (int
		 * i =0; i<3;i++) for(int j=0; j<3;j++) { if(i==j) { sum+=a[i][j]; if(i!=2)
		 * value+= " , "+a[i+1][j]; } }
		 * 
		 * System.out.println("Diagonal sum is : "+ sum);
		 * System.out.println("Vlaue below diagonal "+ value);
		 */

		// display count of valid emialid in given strings
		/*
		 * String st =
		 * "hi welcome to@tekarh.com is given emial id test@test and temp@temp.com and shweta@ and sonal.com and jan.com@test"
		 * ; String[] st1 = st.split(" "); int validcount=0 , invalidcount= 0; for (int
		 * i = 0; i < st1.length; i++) { if (st1[i].contains(".com")) { if
		 * (st1[i].contains("@")) { if(st1[i].indexOf("@")< st1[i].indexOf(".com"))
		 * validcount++; } else invalidcount++;
		 * 
		 * } else if (st1[i].contains("@")) { invalidcount++; }
		 * 
		 * } System.out.println("No of valid emailid in given string is : " +
		 * validcount); System.out.println("No of invalid emailid in given string is : "
		 * + invalidcount);
		 */

		// imagine there is circular array of elements 5,7,9,0,1,3. find minimum element
		// from this array?
		char[] a = new char[] { 'A', 'B', 'C', 'D', 'E', 'F' };
		int n = 6;
		print(a, n, 3); // print all elemnst from index 3

		// find array a is subset if array B
		/*
		 * int arr1[] = {11, 1, 13, 21, 3, 7}; int arr2[] = {11, 3, 7, 1}; //int arr1[]
		 * = {5, 7, 3, 1,0,11, 13}; // int arr2[] = {12,8,6,5, 3, 7, 1}; int m =
		 * arr1.length; int n = arr2.length;
		 * 
		 * if(isSubset(arr1, arr2, m, n)) System.out.print("arr2[] is " +
		 * "subset of arr1[] "); else System.out.print("arr2[] is " +
		 * "not a subset of arr1[]");
		 * 
		 * Scanner sc= new Scanner(System.in);
		 * 
		 * for(;;) {
		 * 
		 * 
		 * System.out.println("Enter mode of transport: ");
		 * System.out.println("1: Train 2.Bus 3.Bike 4.Car 5.Walk "); String opt=
		 * sc.next(); opt=opt.toLowerCase(); if(opt.equals("exit")) {
		 * System.out.println("Program is exiting"); break; } switch(opt) { case
		 * "train": System.out.println("Takes 30 mins to  office"); break; case
		 * "bus":System.out.println("Takes 20 mins to office"); break; case
		 * "bike":System.out.println("Takes 15 mins to office"); break; case
		 * "car":System.out.println("Takes 40 mins to office"); break; case
		 * "walk":System.out.println("Dont reach office"); break; default :
		 * System.out.println("Invalid Entry");
		 * 
		 * }
		 * 
		 * }
		 */
		// display 1to100
//		for (int i = 1; i <= 100; i++) {
//			if (i < 10)
//				System.out.print(i + "  ");
//			else
//				System.out.print(i + " ");
//			if (i % 10 == 0)
//				System.out.println();
//		}

		// swap two numbers value
		// int a=10,b=20;
		// int temp1 =a, temp2=b;
		// System.out.println("New value of a : "+ temp2);
		// System.out.println("New value of b : "+ temp1);

		/*
		 * Scanner sc= new Scanner (System.in);
		 * System.out.println("Enter value of first number a: "); int a=sc.nextInt();
		 * System.out.println("Enter value of second number b: "); int b=sc.nextInt();
		 * System.out.println("before swap value of a : "+ a);
		 * System.out.println("before swap value of b : "+ b); //int temp=a; //a=b;
		 * //b=temp; a=a+b; b=a-b; a=a-b; System.out.println("swapped value of a : "+
		 * a); System.out.println("swapped value of b : "+ b);
		 */

		// arranging nos in descneding order
		/*
		 * Scanner sc= new Scanner (System.in);
		 * System.out.println("Enter the first number : "); int a=sc.nextInt();
		 * System.out.println("Enter the second number : "); int b=sc.nextInt();
		 * System.out.println("Enter the third number : "); int c=sc.nextInt();
		 * System.out.println("Enter the Fourth number : "); int d=sc.nextInt();
		 * System.out.println("Enter the Fifth number : "); int e=sc.nextInt(); Integer
		 * order[]= {a,b,c,d,e}; int temp=0;
		 * 
		 * for (int i =0; i<order.length ;i++)
		 * 
		 * for (int j=i+1;j<order.length;j++) { if( order[j]> order[i]) { temp=order[i];
		 * order[i]=order[j]; order[j]=temp; }
		 * 
		 * 
		 * } System.out.println("order of no in decreasing order : "); for (int i =0;
		 * i<order.length ;i++) System.out.print(" " + order[i]);
		 */
		/// Arrays.sort( order, Collections.reverseOrder());
		// for (int i =0; i<order.length ;i++)
		// System.out.print(" " + order[i]);

		/*
		 * if(a>b && a>c) System.out.println("First number is greatest"); else if(b>c )
		 * System.out.println("Second number is greatest"); else
		 * System.out.println("Third number is greatest");
		 */

	}
	/*
	 * if(a%2==0) {System.out.println("Number is even"); } else
	 * {System.out.println("Number is odd"); } sc.close(); }
	 */
}
