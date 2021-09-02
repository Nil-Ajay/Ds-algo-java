import java.util.Scanner;
import static java.lang.Math.PI;

public class circlePerimeter{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter radius of circle : ");
        float r = in.nextFloat();

        double perimeter = PI * 2 * r;
        System.out.println("Perimeter of given circle is : " + perimeter);
    };
};