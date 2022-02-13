package Labs;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

//Write a Java program that reads on file name from the user, then displays information
//about whether the file exists, whether the file is readable, whether the file is writable, the type of
//file and the length of the file in bytes?

public class Lab11 {

	public static void
	getDayMonthYear(String date)
	{

		LocalDate currentDate
			= LocalDate.parse(date);

		int day = currentDate.getDayOfMonth();

		Month month = currentDate.getMonth();

		int year = currentDate.getYear();

		System.out.println("Day: " + day);
		System.out.println("Month: " + month);
		System.out.println("Year: " + year);
	}

	public static void main(String args[])
	{
		
		String date = "2022-02-13";

		getDayMonthYear(date);
	}

}
