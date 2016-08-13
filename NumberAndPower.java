package beginners;

import java.util.Scanner;

public class NumberAndPower {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a number and its power");
	int number=scanner.nextInt();
	int power=scanner.nextInt();
	int sum=(int)Math.pow(number, power);
	System.out.println("output= "+sum);
	scanner.close();
}
}
