package Groupanagrams;

import java.util.*;

public class GroupAnagramsSorting {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagramsSorting obj = new GroupAnagramsSorting();

        String[] strs = {"act","pots","tops","cat","stop","hat"};

        System.out.println(obj.groupAnagrams(strs));
    }
}
