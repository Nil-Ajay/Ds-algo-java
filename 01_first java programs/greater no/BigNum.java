import java.util.Scanner;

public class BigNum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first number to compare : ");
		float a = input.nextFloat();
		System.out.print("Enter yopur second number to compare : ");
		float b = input.nextFloat();

		if(a > b){
			System.out.println(a + " is greater than " + b);
		}else if(a == b){
			System.out.println("Both numbers are equal!");
		}else{
			System.out.println(b + " is greater than " + a);
		}
	}
}
