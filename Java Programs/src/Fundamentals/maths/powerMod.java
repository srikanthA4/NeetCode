package Fundamentals.maths;

public class powerMod {
    public static int powMod(int x, int n, int M) {
        int res = 1;

        for (int i = 1; i <= n; i++) {

            // Multiplying res with x and
            // taking modulo to avoid overflow
            res = (res * x) % M;
        }

        return res;
    }

    public static void main(String[] args) {
        int x = 3, n = 2, M = 4;
        System.out.println(powMod(x, n, M));
    }
}
