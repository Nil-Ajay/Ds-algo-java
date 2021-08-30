import java.util.Scanner;

public class calc{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		float a = input.nextFloat();
		System.out.print("Enter your second number : ");
		float b = input.nextFloat();
		System.out.print("Please select your operator between (+, -. /, *) : ");
		char o = input.next().charAt(0);

		if(o == '+' || o == '-' || o == '/' || o == '*'){
			if(o == '+'){
				float sum = a + b;
				System.out.println("Addition of " + a + " and "  + b + " is " + sum);
			}else if(o == '-'){
				float sub = a - b;
				System.out.println("Substraction of " + a + " and " + b + " is " + sub);
			}else if(o == '/'){
				float div = a / b;
				System.out.println("Division of " + a + " and " + b + " is " + div);
			}else{
				float prod = a * b;
				System.out.println("Product of " + a + " and " + b + " is " + prod);
			}
		}else{
			System.out.println("Please enter a valid operator! ");
		}
		
	}
}
