package beginners;

import java.util.Scanner;

 class SumUsingFor {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the nth number");
		int number=scanner.nextInt();
		int sum=0;
		for(int i=0;i<=number;i++){
			sum+=i;
		}
		System.out.println("the sum of "+number+" numbers is"+" "+sum);
		scanner.close();
	}

}
