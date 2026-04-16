package Fundamentals.maths;
import java.util.ArrayList;
import java.util.List;
public class powerset {
    static List<String> AllPossibleStrings(String s)
    {
        int n = s.length();
        List<String> res = new ArrayList<>();

        // Iterate through all subsets (represented by 0 to
        // 2^n - 1)
        for (int i = 0; i < (1 << n); i++) {
            StringBuilder sub = new StringBuilder();
            for (int j = 0; j < n; j++) {
                // Check if the j-th bit is set in i
                if ((i & (1 << j)) != 0) {
                    sub.append(s.charAt(j));
                }
            }
            res.add(sub.toString()); // Add the subset to
            // the result
        }

        return res;
    }

    public static void main(String[] args)
    {
        String s = "abc";
        List<String> subsets = AllPossibleStrings(s);

        // Print all subsets
        for (String sub : subsets) {
            System.out.println(sub);
        }
    }
}
