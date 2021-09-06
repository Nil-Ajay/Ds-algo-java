//Define a method that returns the sum of two numbers entered by user.

import java.util.Scanner;
import static java.lang.Math.*;

public class sum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        float a = in.nextFloat();
        System.out.print("Enter your Second number : ");
        float b = in.nextFloat();
        addNumbers(a, b);
    };
    static void addNumbers(float a, float b){
        float ans = a + b;
        System.out.println("Sum : " + ans);
    };

};
