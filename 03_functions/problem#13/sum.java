//Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;
import static java.lang.Math.*;

public class sum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the last digit : ");
        int num = in.nextInt();
        nNumSum(num);
    };
    static void nNumSum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        };
        System.out.println("Sum of first " + n + " natural numbers is : " + sum);
    };
};
