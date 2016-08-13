package beginners;

import java.util.Scanner;

public class EvenInLimit {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the lowerlimit");
	int lowerlimit=scanner.nextInt();
	System.out.println("enter the upperlimit");
	int upperlimit=scanner.nextInt();
	for(int i=lowerlimit;i<=upperlimit;i++){
		if(i%2==0){
			System.out.println(i+" is a even number");
		}
	}
	scanner.close();
}
}
