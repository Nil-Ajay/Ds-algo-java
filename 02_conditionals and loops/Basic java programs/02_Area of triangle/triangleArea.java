import java.util.Scanner;
import static java.lang.Math.*;

public class triangleArea{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter base of your triangle : ");
		float b = in.nextFloat();
		System.out.print("Please enter height of your triangle : ");
		float h = in.nextFloat();

		double area = (b / h) * 1/2;
		double area1 = (0.5 * b * h);

		System.out.println("Area of triangle with base " + b + " and height " + h + " is : " + area + area1);
	}
};
