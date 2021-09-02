import java.util.Scanner;
import static java.lang.Math.*;

public class prismVolume{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the length of prism : ");
        float l = in.nextFloat();
        System.out.print("Please enter the width of prism : ");
        float w = in.nextFloat();
        System.out.print("Please enter the height of prism : ");
        float h = in.nextFloat();

        double volume = (l * w) * h;
        System.out.println("Volume of given prism is : " + volume);
    };
};