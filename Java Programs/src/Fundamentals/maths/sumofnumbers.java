package Fundamentals.maths;

public class sumofnumbers {
 public static int findSum(int n){
     int sum = 0;

     //b/w  1 to n
     for (int i=1; i<= n; i++){
         sum = sum +i;
     }
     return sum;
 }
 public static void main(String args[])
 {
     int n =5;
     System.out.println(findSum(n));
 }
}
