import java.util.Scanner;
import static java.lang.Math.*;

public class equitriPerimeter{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter length of a side of triangle : ");
        float a = in.nextFloat();

        double perimeter = 3 * a;
        System.out.println("Perimeter of equilateral triangle is : " + perimeter);
    };
};