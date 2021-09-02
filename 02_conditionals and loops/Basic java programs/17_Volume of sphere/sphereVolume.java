import java.util.Scanner;
import static java.lang.Math.*;

public class sphereVolume{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the radius of sphere : ");
        float r = in.nextFloat();

        double volume = (PI * (r*r*r)) * 4/3;
        System.out.println("Volume of sphere is " + volume);
    };
};