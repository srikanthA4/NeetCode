package Fundamentals.maths;

public class ComputenCr {
    public static int nCr(int n, int r) {

        // No valid combinations if r is greater than n
        if (r > n)
            return 0;

        // Base case: only one way to choose 0 or all elements
        if (r == 0 || r == n)
            return 1;

        // include or exclude current element
        return nCr(n - 1, r - 1) + nCr(n - 1, r);
    }

    // Driver Code
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        System.out.println(nCr(n, r));
    }
}
