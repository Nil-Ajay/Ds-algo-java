//Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;
import static java.lang.Math.*;

public class prime{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = in.nextInt();
        System.out.print("Enter second number : ");
        int b = in.nextInt();
        primeBtn(a, b);
    };
    static void primeBtn(int strt, int end){
        String z = " ";
        for(int n = strt; n <= end; n++){
            boolean prime = true;
            for(int i = 2; i <= n / 2; i++){
                if(n % i == 0 && n != i){
                    prime = false;
                }
            }
            if(prime){
                z += n + " ";
            }
        }
        System.out.println("All prime numbers betn " + strt + " and " + end + " are : " + z);

    };
};
