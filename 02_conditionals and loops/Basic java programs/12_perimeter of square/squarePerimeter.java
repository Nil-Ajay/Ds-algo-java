import java.util.Scanner;
import static java.lang.Math.*;

public class squarePerimeter{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter length of side of square: ");
        float a = in.nextFloat();

        double perimeter = 4 * a;
        System.out.println("Perimeter of square is : " + perimeter);
    };
};