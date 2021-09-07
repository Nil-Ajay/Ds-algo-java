import java.util.Scanner;
import static java.lang.Math.*;

public class result{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks out of 100 : ");
        int marks = in.nextInt();
        grade(marks);
    };
    static void grade(int m){
            if(m > 100){
                System.out.println("Please enter marks out of 100! ");
            }else if(m > 90){
                System.out.println("AA");
            }else if(m > 80){
                System.out.println("AB");
            }else if(m > 70){
                System.out.println("BB");
            }else if(m > 60){
                System.out.println("BC");
            }else if(m > 50){
                System.out.println("CD");
            }else if(m > 40){
                System.out.println("DD");
            }else{
                System.out.println("You've been failed, Better luck next time!");
            }
        };
    };
