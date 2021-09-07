//Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two number is equal to the square of the third number).

import java.util.Scanner;
import static java.lang.Math.*;

public class triplet{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number to check : ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd number to check : ");
        int num2 = in.nextInt();
        System.out.print("Enter 3rd number to check : ");
        int num3 = in.nextInt();
        pythagoreanTri(num1, num2, num3);
    };
    static void pythagoreanTri(int n, int p, int m){
        int sq = (n*n) + (p*p);
        int lastSqr = m*m;
        if(sq == lastSqr){
            System.out.println("Entered number is a pythagorean triplet!");
        }else{
            System.out.println("Entered number is not a pythagorean triplet!");
        };
    };
};
