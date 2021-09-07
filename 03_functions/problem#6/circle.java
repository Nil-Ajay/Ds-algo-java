//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.Scanner;
import static java.lang.Math.*;

public class circle{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        float r = in.nextFloat();
        cArea(r);
    };

    static void cArea(float r){
        double circumfrence = 2 * PI * r;
        double area = PI * (r*r);
        System.out.println("Circumference : " + circumfrence);
        System.out.println("Area : " + area);
    };
};
