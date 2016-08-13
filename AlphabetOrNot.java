package beginners;

import java.util.Scanner;

public class AlphabetOrNot {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a character");
		char ch=scanner.next().charAt(0);
		if(Character.isAlphabetic(ch)){
			System.out.println(ch+" is an alphabet ");
		}
		else{
			System.out.println(ch+" is not an alphabet");
		}
		scanner.close();
	}

}
