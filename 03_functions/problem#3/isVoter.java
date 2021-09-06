import java.util.Scanner;
import static java.lang.Math.*;

public class isVoter {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = in.nextInt();
        voter(age);
    };
    static void voter(int age){
            if(age >= 18){
                System.out.print("Indeed, you're eligible to vote!");
            }else{
                System.out.print("Sorry dear, you're not eligible to vote yet, come back after " + (18 - age) + " years");
            };
    };
};
