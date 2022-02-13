package Labs;

import java.util.*;
// Create a method which accepts an array of integer elements and return the
//second smallest element in the array

class Lab4{
	public static int getSecondSmallest(Integer[] a, int total){  
		List<Integer> list=Arrays.asList(a);  
		Collections.sort(list);  
		int element=list.get(1); 

		return element;  
		}  

		public static void main(String args[]){ 
			
		Integer x[]={1,5,8,6,2};  
		Integer y[]={15,52,23,79,37,66,47};

		System.out.println("Second Smallest: "+getSecondSmallest(x,5));  
		System.out.println("Second Smallest: "+getSecondSmallest(y,7));  
		} 
}