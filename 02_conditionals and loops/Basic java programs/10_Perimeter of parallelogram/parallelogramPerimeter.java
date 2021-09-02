import java.util.Scanner;
import static java.lang.Math.*;

public class parallelogramPerimeter{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the length of side of parallelogram : ");
        float a = in.nextFloat();
        System.out.print("Please enter the length of base of parallelogram : ");
        float b = in.nextFloat();

        double perimeter = 2 * (a + b);
        System.out.println("Perimeter of given parallelogram is : " + perimeter);
    };
};