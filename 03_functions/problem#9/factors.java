//Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.- 4! = 1 * 2 * 3 * 4 = 24 3! = 3 * 2 * 1 = 6 2! = 2 * 1 = 2 Also, 1! = 1 0! = 

import java.util.Scanner;
import static java.lang.Math.*;

public class factors{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find it's factorial : ");
        int num = in.nextInt();
        System.out.println("Factorial of " + num + " is : " + factorial(num));
    }
    static int factorial(int n){
        int ans = 1;
        for(int x = 2; x <= n; x++){
            ans *= x;
        };
        return ans;
    };
};
