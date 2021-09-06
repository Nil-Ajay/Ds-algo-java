//Define a program to find out whether a given number is even or odd.
import java.util.Scanner;
import static java.lang.Math.*;

public class numbers{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = in.nextInt();
        isOddEven(num);
    };
    static void isOddEven(int num){
        if(num == 0){
            System.out.println("0 is not odd nor even");
        }
        else if(num % 2 == 0){
            System.out.println("Given number is even!");
        }else{
            System.out.print("Given number is odd");
        };
    };
};
