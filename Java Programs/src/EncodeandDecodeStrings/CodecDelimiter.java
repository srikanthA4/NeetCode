package EncodeandDecodeStrings;
import java.util.*;
public class CodecDelimiter {
    private static final String DELIM = "|||";

    public String encode(List<String> strs) {
        return String.join(DELIM, strs);
    }

    public List<String> decode(String s) {

        List<String> result = new ArrayList<>();

        if (s.isEmpty()) {
            result.add("");
            return result;
        }

        String[] parts = s.split("\\Q" + DELIM + "\\E", -1);

        return Arrays.asList(parts);
    }

    public static void main(String[] args) {
        CodecDelimiter obj = new CodecDelimiter();

        List<String> input = Arrays.asList("Hi", "Java");

        String encoded = obj.encode(input);
        System.out.println("Encoded: " + encoded);

        System.out.println("Decoded: " + obj.decode(encoded));
    }
}
