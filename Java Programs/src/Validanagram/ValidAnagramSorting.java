package Validanagram;


import java.util.Arrays;

public class ValidAnagramSorting {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        ValidAnagramSorting obj = new ValidAnagramSorting();

        String s = "listen";
        String t = "silent";

        System.out.println(obj.isAnagram(s, t)); // true
    }

}
