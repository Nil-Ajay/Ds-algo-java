import java.util.Scanner;
import static java.lang.Math.*;

public class pyramidVolume{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter length of a side of pyramid : ");
        float a = in.nextFloat();
        System.out.print("Please enter height of pyramid : ");
        float h = in.nextFloat();

        double volume = (a*a * h) * 1/3;
        System.out.print(volume);
    };
};