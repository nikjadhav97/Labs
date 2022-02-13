package Labs;
import java.util.*;
//Create a method that can accept an array of String objects and sort in
//alphabetical order. The elements in the left half should be completely in uppercase and
//the elements in the right half should be completely in lower case. Return the resulting
//array

public class Lab5 {
	public static void main(String args[])   
	   {  
	      Scanner sc=new Scanner(System.in);
	      Scanner sc1=new Scanner(System.in);

	      int n;   
	      System.out.println("Enter the number of elements ");
	      n=sc.nextInt();     

	      String str[]=new String[n];   
	      System.out.println("Enter the String ");
	      for(int i=0; i<n ;i++)    
	      {
	          str[i]=sc1.nextLine();
	      }

	      Arrays.sort(str);    

	      System.out.println(Arrays.toString(str));  
	   }  
	}  

