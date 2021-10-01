import java.util.Scanner;

// public class ins{
//     public static void main(String[] args){
//     int[] arr = {45, 452, -78, -98, 321, 41, 01, 23, 45, -9};
//     int target = 1321;
//     int ans = linearSearch(arr, target);
//     System.out.print(ans);
//     };
//     static int linearSearch(int[] arr, int target){
//         if(arr.length == 0){
//             return -1;
//         }

//         for(int i = 0; i < arr.length; i++){
//             int element = arr[i];
//             if(element == target){
//                 return i;
//             };
//         }
//         return -1;
//     }

// }

// insertion search for integer using enhanced for loop


// public class ins{
//     public static void main(String[] args){
//     int [] arr = {45, 78, 987, 314, 4587};
//     int target = 45;
//     boolean answer = search(arr, target);
//     System.out.print(answer);
//     }

//     static boolean search(int[] arr, int target){
//         if(arr.length == 0){
//             return false;
//         }
//         for(int element: arr){
//             if(element == target){
//                 return true;
//             }
//         }
//         return false;
//     } 
// }

// insertion search for string or character

public class ins{
    public static void main(String[] args){

    String str = "CyLax";
    char c = 'C';
    System.out.print(search(str, c));
    }
    static boolean search(String str, char c){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(c == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}