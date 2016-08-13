package beginners;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the nth number");
		int number=scanner.nextInt();
		int i=1;
		int sum=0;
		do{
			sum+=i;
			i++;
		}while(i<=number);
		System.out.println("the sum of "+number+" number is "+sum);
		scanner.close();
	}

}
