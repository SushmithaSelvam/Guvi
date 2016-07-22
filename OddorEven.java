import java.util.Scanner;


public class OddorEven {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number");
	int number=scanner.nextInt();
	if(number%2==0){
		System.out.println(number+" is a even number");
	}
	else if(number==0){
		System.out.println(number+" is neither odd nor even");
	}
	else{
		System.out.println(number+" is odd number");
	}
	scanner.close();

	}

}
