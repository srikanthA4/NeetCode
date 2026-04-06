package Validanagram;

public class ValidAnagramFrequency {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] count = new int[26]; // for lowercase letters

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int num : count) {
            if (num != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidAnagramFrequency obj = new ValidAnagramFrequency();

        String s = "jar";
        String t = "jam";

        System.out.println(obj.isAnagram(s, t)); // false
    }
}
