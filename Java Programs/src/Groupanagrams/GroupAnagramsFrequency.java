package Groupanagrams;
import java.util.*;
public class GroupAnagramsFrequency {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            int[] count = new int[26];

            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();
            for (int num : count) {
                keyBuilder.append(num).append('#');
            }

            String key = keyBuilder.toString();

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagramsFrequency obj = new GroupAnagramsFrequency();

        String[] strs = {"x"};

        System.out.println(obj.groupAnagrams(strs));
    }
}
