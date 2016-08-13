package beginners;

import java.util.Scanner;

public class LeapyearOrNot {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the year");
	int year=scanner.nextInt();
	if(Integer.toString(year).length()==4){
	if(year%4==0){
		System.out.println(year+" is a leap year");
	}
	else{
		System.out.println(year+" is not a leap year");
	}
	}
	else{
		System.out.println("enter a valid input year");
	}
	scanner.close();
}
}
