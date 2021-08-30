import java.util.Scanner;

public class interest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter principle for your loan : ");
        float p = input.nextFloat();
        System.out.print("Please enter rate of your loan : ");
        float r = input.nextFloat();
        System.out.print("Please enter time for your loan : ");
        float t = input.nextFloat();

        float interest = p * r * t;
        System.out.println("You'd pay $" + interest + " on your $" + p + " interest " + "after " + t + " years!");
    }
}