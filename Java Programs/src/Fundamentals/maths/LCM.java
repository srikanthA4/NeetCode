package Fundamentals.maths;

public class LCM {
    static int nthFibonacci(int n){
        // base case
        if (n <= 1) {
            return n;
        }
        // sum of the two
        // Fibonacci numbers
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }
    public static void main(String[] args){
        int n = 5;
        int result = nthFibonacci(n);
        System.out.println(result);
    }
}
