package beginners;

import java.util.Scanner;

public class CountNumbersOfDigit {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter an integer");
	int number=scanner.nextInt();
	int length=(int)Math.log10(number)+1;
	System.out.println("the length of the given integer "+number+" is "+length);
	scanner.close();
}
}
