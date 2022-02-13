package Labs;

// Exercise : Create a class with a method which can calculate the sum of first n natural 
//numbers which are divisible by 3 or 5.

public class Lab1 {
	public static void main(String[] args) {
	int sum =0;
	int num =100;
	for (int i = 0 ; i<=num;i++) {
		if (i%5==0 || i%3==0) {
			System.out.println(i + "");
			sum += i;
			
	
		}
	}
	System.out.println("sum"+ sum);
	}
}

	
	