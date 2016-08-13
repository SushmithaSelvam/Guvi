package beginners;

import java.util.Scanner;

public class PalindromeOrNot {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a number");
	int number=scanner.nextInt();
	int number1=number;
	int rem=0;
	int sum=0;
	while(number1!=0){
		rem=number1%10;
		sum=(sum*10)+rem;
		number1=number1/10;
	}
	if(number==sum){
		System.out.println("the given number is a palindrome");
	}
	else{
		System.out.println("the given no is not a palindrome");
	}
	scanner.close();
}
}
