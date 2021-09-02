import java.util.Scanner;
import static java.lang.Math.*;

public class cylinderVolume{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Please select cylinder :1 Full cylinder || 2 Hollow cylinder : ");
        int choice = in.nextInt();
        System.out.print("Please enter the height of the cylinder : ");
        float h = in.nextFloat();
        double volume;

        if(choice == 1){
            System.out.print("Please enter the radius of the cylinder : ");
            float r = in.nextFloat();
            volume = h * PI * (r*r);
            System.out.println("Volume of Full cylinder is : " + volume);
        }else if(choice == 2){
            System.out.print("Please enter the external diameter of the cylinder : ");
        float d1 = in.nextFloat();
        System.out.print("Please enter the internal diameter of the cylinder : ");
        float d2 = in.nextFloat();
        volume = PI * h * (d1*d1 - d2*d2) / 4;
        System.out.println("Volume of Hollow cylinder is : " + volume);
        }else{
            System.out.println("Please enter a valid option!");
        }
    };
};