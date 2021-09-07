import java.util.Scanner;

public class Prime{

	public static void main(String[] args){
        System.out.print("Enter a number : ");
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    primeCal(n);
	};

    static void primeCal(int num){
	    int count = 0;
	    for(int i=1;i<=num;i++){
	        if(num%i==0){
	            count++;
            }
        }
	    if(count==2){
	       System.out.println("prime number ");
        }else
	        System.out.println("Not a prime number ");
    }; 
};
