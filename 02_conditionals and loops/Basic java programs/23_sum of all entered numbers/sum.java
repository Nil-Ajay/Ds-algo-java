import java.util.Scanner;
import static java.lang.Math.*;

public class sum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number : ");
        float input = in.nextFloat();
        float sum = 0;
        while(input != 0){
            sum += input;
            System.out.print("Enter a number to add or prees 0 to exit : ");
            input = in.nextFloat();
        };
        System.out.println(sum);
    };
};
