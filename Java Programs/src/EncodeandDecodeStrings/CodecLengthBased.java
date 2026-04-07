package EncodeandDecodeStrings;

import java.util.*;

class CodecLengthBased {

    // Encode
    public String encode(List<String> strs) {

        StringBuilder encoded = new StringBuilder();

        for (String str : strs) {
            encoded.append(str.length()).append("#").append(str);
        }

        return encoded.toString();
    }

    // Decode
    public List<String> decode(String s) {

        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {

            int j = i;

            // Find '#'
            while (s.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(s.substring(i, j));

            String word = s.substring(j + 1, j + 1 + length);
            result.add(word);

            i = j + 1 + length;
        }

        return result;
    }

    public static void main(String[] args) {
        CodecLengthBased obj = new CodecLengthBased();

        List<String> input = Arrays.asList("Hello", "World");

        String encoded = obj.encode(input);
        System.out.println("Encoded: " + encoded);

        System.out.println("Decoded: " + obj.decode(encoded));
    }
}