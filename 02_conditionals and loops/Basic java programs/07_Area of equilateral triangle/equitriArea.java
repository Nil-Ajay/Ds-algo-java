import java.util.Scanner;
import java.lang.Math.*;

public class equitriArea{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter length of side : ");
        float a = in.nextFloat();
        
        float sqrt = 0.433f;
        double area = sqrt * a * a;
        System.out.println("Area of equilateral triangle is : " + area);
    };
};