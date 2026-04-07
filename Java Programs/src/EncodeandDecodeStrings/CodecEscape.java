package EncodeandDecodeStrings;
import java.util.*;
public class CodecEscape {
    public String encode(List<String> strs) {

            StringBuilder encoded = new StringBuilder();

            for (String str : strs) {

                str = str.replace("/", "//");
                str = str.replace("#", "/#");

                encoded.append(str).append("#");
            }

            return encoded.toString();
        }

        public List<String> decode(String s) {

            List<String> result = new ArrayList<>();
            StringBuilder current = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == '/') {
                    current.append(s.charAt(i + 1));
                    i++;
                } else if (s.charAt(i) == '#') {
                    result.add(current.toString());
                    current = new StringBuilder();
                } else {
                    current.append(s.charAt(i));
                }
            }

            return result;
        }

        public static void main(String[] args) {
            CodecEscape obj = new CodecEscape();

            List<String> input = Arrays.asList("Hello#World", "Java");

            String encoded = obj.encode(input);
            System.out.println("Encoded: " + encoded);

            System.out.println("Decoded: " + obj.decode(encoded));
        }

}
