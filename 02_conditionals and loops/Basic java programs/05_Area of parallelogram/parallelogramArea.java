import java.util.Scanner;
import java.lang.Math.*;

public class parallelogramArea{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter base of your parallelogram : ");
        float b = in.nextFloat();
        System.out.print("Please enter height of your parallelogram : ");
        float h = in.nextFloat();

        double area = b * h;
        System.out.println("Area of your parallelogram is : " + area);
    };
};