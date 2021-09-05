import java.util.Scanner;
import static java.lang.Math.*;

public class largeNum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        float num = in.nextFloat();
		float temp = num;
        while(num != 0){
			temp = num;
            System.out.print("Enter a number or enter 0 to exit : ");
            num = in.nextFloat();
        };
        System.out.println(temp);
    };
};
