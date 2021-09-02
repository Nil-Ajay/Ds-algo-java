import java.util.Scanner;
import static java.lang.Math.*;

public class CSAcylinder{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter height : ");
        float h = in.nextFloat();
        System.out.print("Please enter radius : ");
        float r = in.nextFloat();

        double CSA = 2*PI * r*h;
        System.out.println(CSA);
    };
};