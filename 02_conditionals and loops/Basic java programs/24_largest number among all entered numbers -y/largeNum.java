import java.util.Scanner;
import static java.lang.Math.*;

public class largeNum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        float num = in.nextFloat();
        float temp = num;
        while(num != 0){
            System.out.print("Enter a number or press 0 to exit : ");
            num = in.nextFloat();
            if(temp < num){
                temp = num;
            };
        };
        System.out.println("Largest number among numbers you entered is : " + temp);
    };
};