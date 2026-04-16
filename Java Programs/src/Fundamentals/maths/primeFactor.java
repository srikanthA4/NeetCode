package Fundamentals.maths;
import java.util.*;
public class primeFactor {
    public static ArrayList<Integer> primeFac(int n) {
        ArrayList<Integer> res = new ArrayList<>();

        // Check for factor 2
        if (n % 2 == 0) {
            res.add(2);
            while (n % 2 == 0) {
                n /= 2;
            }
        }

        // Check for odd prime factors
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                res.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }

        // If remaining n is a prime number > 2
        if (n > 2) {
            res.add(n);
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 100;
        ArrayList<Integer> result = primeFac(n);

        for (int factor : result) {
            System.out.print(factor + " ");
        }
    }
}

