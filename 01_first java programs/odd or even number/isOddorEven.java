
import java.util.Scanner;

public class isOddorEven{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number you wanna check : ");
        int isOddorEven = input.nextInt();
        if( isOddorEven > 0){
            if(isOddorEven % 2 == 0){
                System.out.println(isOddorEven + " : " + "is an even number!");
            }else{
                System.out.println(isOddorEven + " : " + "is an odd number!");
            }
        }else{
            System.out.println("zero is neither odd nor even!");
        }
    }
}