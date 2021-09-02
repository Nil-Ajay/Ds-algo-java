import java.util.Scanner;
import java.lang.Math.*;

public class rhombusArea{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter first diagonal of your rhombus : ");
        float d1 = in.nextFloat();
        System.out.print("Please enter second diagonal of your rhombus : ");
        float d2 = in.nextFloat();

        double area = (d1 * d2) /2;
        System.out.println("Area of rhombus is : " + area);
    };
};