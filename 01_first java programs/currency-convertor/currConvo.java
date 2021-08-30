import java.util.Scanner;

public class currConvo{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);

		System.out.print("Please enter your amount : ₹");
		float rupee = input.nextFloat();
		
		if(rupee > 0){
			float dollar = rupee / 74;
                	System.out.println("₹" + rupee + " in us dollars is $" + dollar);
		}
	}
}
