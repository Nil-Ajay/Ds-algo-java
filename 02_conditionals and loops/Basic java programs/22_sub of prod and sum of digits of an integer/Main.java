import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a digit : ");
        int num = in.nextInt();

        int prod = 1;
        int sum = 0;
        int rem = 0;
        int sub;

        while(num > 0){
            rem = num % 10;
            sum += rem;
            prod *= rem;
            num /=10;
        }
        sub = prod - sum;
        System.out.println("Answer is : " + sub);
    };
};