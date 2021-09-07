//Write a function to find if a number if palindrome or not. Take number as parameter.

import java.util.Scanner;
import static java.lang.Math.*;

public class palindrome{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check : ");
        int num = in.nextInt();
        palindromeNum(num);
    };
    static void palindromeNum(int n){
        int original = n;
        int rem;
        int sum = 0;
        while(n > 0){
            rem = n % 10;
            sum = (sum*10) + rem;
            n = n / 10;
        }
        if(original == sum){
            System.out.println("Entered number is a palindrome number!");
        }else{
            System.out.println("Entered number is not a palindrome number!");
        };
    };
};
