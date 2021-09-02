import java.util.Scanner;
import java.lang.Math.*;

public class rectangleArea{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the length of your rectangle : ");
        float l = in.nextFloat();
        System.out.print("Please enter the width of your rectangle : ");
        float w = in.nextFloat();

        double area = l * w;
        System.out.println("Area of rectangle with length " + l + " and width " + w + " is : " + area);
    }
};