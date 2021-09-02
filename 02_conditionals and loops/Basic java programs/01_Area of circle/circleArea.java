import java.util.Scanner;
import static java.lang.Math.*;

public class circleArea{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter the radius of circle : ");
		float r = in.nextFloat();
		double area = PI * r * r;
		System.out.println("Area of circle with radius " + r + " is: " + area);
	}
};
