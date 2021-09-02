import java.util.Scanner;
import java.lang.Math.*;

public class iscotriArea{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter base of your triangle : ");
        float b = in.nextFloat();
        System.out.print("Please enter height of your triangle : ");
        float h = in.nextFloat();

        double area = (0.5) * b * h;
        System.out.println("Area of your Iscoceles triangle is : " + area);
    };
};