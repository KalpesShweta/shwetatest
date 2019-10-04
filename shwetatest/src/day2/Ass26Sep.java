package day2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ass26Sep {

	public static void main(String[] args) {

		
		// TODO Auto-generated method stub
		
		//Given number is PRIME or not 
		/*Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number :");
        int n = sc.nextInt();boolean prime=true;
        for( int i=2;i<n;i++)
        if(n%i==0)
		prime=false;
	    System.out.println("Number is prime :" + prime);*/
	    
	    
	    //REmova all widespaces
		Scanner sc= new Scanner (System.in);
		//System.out.println("Enter first string :");
		
		/*String str1=sc.nextLine();
		str1=str1.replaceAll(" ", "");
		System.out.println(str1);*/
		
	    //palindrome string
		/*String str1=sc.nextLine();
		String temp=str1;
		String reverse="";
		for( int i=str1.length()-1; i >=0;i--)
		reverse+= str1.charAt(i);
		
		if(temp.toLowerCase().equals(reverse.toLowerCase()))
		 System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");*/
		
		
		//Anagram Silent=Listen
		boolean isAnagram=false;
		String str1=sc.next(); char[] c1= str1.toLowerCase().toCharArray();
		System.out.println("Enter second string :");
		String str2=sc.next(); char[] c2= str2.toLowerCase().toCharArray();
		if( str1.length()!= str2.length())
		 System.out.println("Not anagram");
		else
		{
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(str1 + " " +str2);
			//for( int i =0; i <= str1.length()-1;i++)
			if(String.valueOf(c1).equals(String.valueOf(c2)))
				isAnagram=true;
			if(isAnagram)
				System.out.println("Anagram");
			else
				System.out.println("Not anagram");
		}
		
		//Array of integers print odd nos
	/*	int no[]= {1,2,3,4,5,56,23,57,87,576,345,65}; int count =0;
		
		for (int i=0;i<no.length-1;i++)
		 if(no[i]%2!=0)
			count++;	
		
		int oddIndex=0; int oddnumber[]= new int[count];
		
		for (int i=0;i<no.length-1;i++)
		{
			if(no[i]%2!=0)
			{
				oddnumber[oddIndex]=no[i];
				oddIndex++;
				
			}
		}
		System.out.println("Odd nos  :" +  Arrays.toString(oddnumber));*/
		
		//display odd nos forst in array
	/*	int no[]= {1,2,3,4,5,56,23,57,87,576,345,65}; 
       int Index=0; int number[]= new int[no.length-1];
		
		for (int i=0;i<no.length-1;i++)
		  if(no[i]%2==0)
			{
				number[Index]=no[i];
				Index++;
			}
		
		for (int i=0;i<no.length-1;i++)
			  if(no[i]%2!=0)
			  {
				  number[Index]=no[i];
				  Index++;
			  }
		System.out.println("sorted array and arranges even no first  :" +  Arrays.toString(number));*/
	
	
		// display unique nos and occurence of duplicate nos
		/*
		int no[]= {1,2,3,4,5,56,23,57,87,345,65,1,4,57,345}; 
		int count=0; int duplicateCount=0; boolean isUnique=true;
		
		boolean[] uniqueSetter= new boolean[no.length]; 
		String uniqueNos="";
		Arrays.fill(uniqueSetter, false);
		for (int i=0; i<no.length;i++)
		{
			isUnique=true;
			int j;
			for( j=i+1;j<=no.length-1;j++)
			{
				if(no[i]==no[j])
				{
					uniqueSetter[j]=true;
					isUnique=false;
					duplicateCount++;
					break;
				}
			}
			
			if(!isUnique)
			{
				System.out.println(no[i] +" Repated :" +(duplicateCount+1));
				duplicateCount=0;
			}
		
			else
			{
				if(uniqueSetter[i]!=true)
				{
					uniqueNos+=String.valueOf(no[i]) +" ";
				//uniqueArray[uniqueIndex]=no[i];
				//uniqueIndex++;
				}
			}
		}
		
		System.out.println("Unique nos " + uniqueNos);
		*/
		
		//Generate 10 random nos
		/*Random r= new Random();
		System.out.println("Generating 10 random nos : ");
		for(int i =0; i<10;i++)
		System.out.print(r.nextInt(100)+ " ");*/
		
		
		
		//Compare two arrays and print repeated nos
	/*	int a[]= {2,3,4,5};
		int b[]= {2,5,6,7,8,9};
		
		String repeatedNos="Repeated Nos in given array ";
		for( int i =0; i <a.length;i++)
		{
			for( int j=0; j<b.length;j++)
			{
				if( a[i]==b[j])
				{
					repeatedNos+= a[i] +" ";
				}
			}
		}
		System.out.println(repeatedNos);*/
		
		//Count of pair in arrays whose addition is even
	/*	int no[]= {2,3,4,5};
		int evenPairCount=0;
		for( int i =0; i <no.length;i++)
		{
			for( int j=i+1; j<=no.length-1;j++)
			{
				if( (no[i]+ no[j])%2==0)
				{
					evenPairCount++;
				}
			}
		}
			System.out.println(" Total no of Pairs of no whose sum is evne no is: "+ evenPairCount);*/
		
		//SELECTION SORT
	/*	int no[]= {22,13,40,5};
		for( int i =0; i <no.length;i++)
		{
			 int min_Index=i;
			for( int j=i+1; j<=no.length-1;j++)
			{
				if(no[j]<no[min_Index])
				{
					min_Index=j;
				}
			}
			int temp=no[min_Index];
			no[min_Index]=no[i];
			no[i]= temp;
		}
			System.out.println(Arrays.toString(no));*/
		
		//Merge Sort
		/*int arr[] = {12, 11, 13, 5, 6, 7}; 
		Ass26Sep ob= new Ass26Sep();
		ob.sort(arr, 0, arr.length-1); 
		  
        System.out.println("\nSorted array"  ); 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " ");*/
		
		//QuickSort
	/*	 int arr[] = {10, 7, 8, 9, 1, 5}; 
	        int n = arr.length; 
	  
	        Ass26Sep ob= new Ass26Sep(); 
	        ob.sort(arr, 0, n-1); 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i] + " ");*/
		
	}
	void quickSort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            quickSort(arr, low, pi-1); 
            quickSort(arr, pi+1, high); 
        } 
    } 
	 int partition(int arr[], int low, int high) 
	    { 
	        int pivot = arr[high];  
	        int i = (low-1); // index of smaller element 
	        for (int j=low; j<high; j++) 
	        { 
	            // If current element is smaller than the pivot 
	            if (arr[j] < pivot) 
	            { 
	                i++; 
	  
	                // swap arr[i] and arr[j] 
	                int temp = arr[i]; 
	                arr[i] = arr[j]; 
	                arr[j] = temp; 
	            } 
	        } 
	  
	        // swap arr[i+1] and arr[high] (or pivot) 
	        int temp = arr[i+1]; 
	        arr[i+1] = arr[high]; 
	        arr[high] = temp; 
	  
	        return i+1; 
	    } 
	void merge(int arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        }
    }
	void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
    } 

}
