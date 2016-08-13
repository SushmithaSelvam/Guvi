package beginners;

import java.util.Scanner;

public class PrimeOrNot {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a number");
	int number=scanner.nextInt();
	if(number==1||number==2){
		System.out.println(number+" ia neither prime nor composite");
	}
	else if(number>2){
		int count=0;
		for(int i=2;i<number;i++){
			if(number%i==0){
				count=0;
				break;
			}
			else{
				count++;
			}
		}
		if(count>0){
			System.out.println(number+" is prime number");
		}
		else{
			System.out.println(number+" is not a prime number");
		}
	}
	scanner.close();
}
}
