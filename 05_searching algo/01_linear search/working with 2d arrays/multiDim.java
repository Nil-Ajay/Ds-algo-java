import java.util.Arrays;
import java.util.stream.IntStream;

// finding the index of an element present in multi dimensional array
// public class multiDim {
//         public static void main(String[] args){
//                 int [][] arr = {
//                                 {45, 78, 341},
//                                 {478, 10, 301, 78},
//                                 {98},
//                                 {01, 02, 30, 78, 98, 78}
//                 };
//                 int target = 78;
//                 int[] ans = search(arr, target);
//                 System.out.print(Arrays.toString(ans));
//         }
//         static int[] search(int [][] arr, int target){
//                 for(int row = 0; row < arr.length; row++){
//                         for(int col = 0; col < arr[row].length; col++){
//                                 if(arr[row][col] == target){
//                                         return new int[]{row, col};
//                                 }
//                         }
//                 }
//                 return new int[] {-1, -1};
//         }
// }



// finding max and min number in multi-dimensional array
// max number in array
// public class multiDim{
//         public static void main(String[] args){
//                 int [][] arr = {
//                                 {45, 78, 341},
//                                 {478, 10, 301, 78},
//                                 {98},
//                                 {01, 02, 30, 78, 98, 788}
//                 };
//                 int ans = search(arr);
//                 System.out.print(ans);
//         }
//         static int search(int [][] arr){
//                 int max = Integer.MIN_VALUE;
//                 for(int[] row: arr){
//                         for(int ele: row){
//                                 if(ele > max){
//                                         max = ele;
//                                 }
//                         }
//                 }
//                 return max;
//         }
// }



// check how many numbers contains even number of digits in an array
public class multiDim{
        public static void main(String[] args){
        int[] nums = {784, 987, 451, 21, 01, 45};
        System.out.print(digits(56736));
        }
        static int findNum(int[] arr){
                int count = 0;
                for(int num: arr){
                        if(even(num)){
                                count++;
                        }
                }
                return count;
        }
        static boolean even(int num){
                int nOfDigits = digits(num);
                return nOfDigits % 2 == 0;
        }
        static int digits(int num){
                int count = 0;
                while(num > 0){
                        count++;
                        num /= 10;
                }
                return count;
        }
}