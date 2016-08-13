package beginners;

import java.util.Scanner;

public class VowelOrConsonant {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a character");
	char ch=scanner.next().charAt(0);
	if(Character.isLetter(ch)){
		int as=(int) ch;
	if(as==97||as==65||as==101||as==69||as==105||as==73||as==111||as==79||as==117||as==85){
		System.out.println(ch+" is a vowel");
	}
	else{
		System.out.println(ch+" is a consonant");
	}
	}
	else{
		System.out.println("it is not an alphabet");
	}
	scanner.close();
}
}
