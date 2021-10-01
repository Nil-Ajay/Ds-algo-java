import java.util.Scanner;

// finding minimum number in an array
// public class minMax {
//         public static void main(String[] args){
//         int[] num = {45, 78, 98, 45, 784};
//         System.out.print(search(num));
//         }
        
//         static int search(int[] number){
//                 int ans = number[0];
//                 for(int i = 1; i < number.length; i++){
//                         if(number[i] < ans){
//                                 ans = number[i];
//                         }
//                 }
//                 return ans;
//         }
// }

// finding maximum number in an array

public class minMax {
        public static void main(String[] args){
        int[] num = {45, 78, 98, 45, 784};
        System.out.print(search(num));
        }
        
        static int search(int[] number){
                int ans = number[0];
                for(int i = 1; i < number.length; i++){
                        if(number[i] > ans){
                                ans = number[i];
                        }
                }
                return ans;
        }
}
