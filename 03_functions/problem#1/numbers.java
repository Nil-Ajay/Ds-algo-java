//Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.

import java.util.Scanner;
import static java.lang.Math.*;

public class numbers{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number : ");
        float a = in.nextFloat();
        System.out.print("Enter second number : ");
        float b = in.nextFloat();
        System.out.print("Enter third number : ");
        float c = in.nextFloat();
        larger(a, b, c);
        smaller(a, b, c);
    };
    static void larger(float a, float b, float c){
        float max = a;
        max = Math.max(Math.max(max, b), c);
        System.out.println("Maximum number : " + max);
    };

    static void smaller(float a, float b, float c){
        float min = a;
        min = Math.min(Math.min(min, b), c);
        System.out.println("Minimum number : " + min);
    };
};

