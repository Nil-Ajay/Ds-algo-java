import java.util.Scanner;
import static java.lang.Math.*;

public class coneVolume{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter radius of cone : ");
        float r = in.nextFloat();
        System.out.print("Please enter height of cone : ");
        float h = in.nextFloat();

        double volume = (PI * r * r * h) / 3;
        System.out.println("Volume of cone is : " + volume);
    };
};