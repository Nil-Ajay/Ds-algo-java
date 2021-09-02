import java.util.Scanner;
import static java.lang.Math.*;

public class TSAcube{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter length of side of cube : ");
        float a = in.nextFloat();

        double TSA = 6 * a*a;
        System.out.println(TSA);
    };
};