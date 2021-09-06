//Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class product{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        float a = in.nextFloat();
        System.out.print("Enter your second number : ");
        float b = in.nextFloat();
        prod(a, b);
    };
    static void prod(float a, float b){
        float ans = a * b;
        System.out.println("Product : " + ans);
    };
};
