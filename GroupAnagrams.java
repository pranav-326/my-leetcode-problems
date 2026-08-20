import java.util.*;
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
//        Map<String, List<String>> m=new HashMap<>();
//        for(String s: strs) {
//            int[] count=new int[26];
//            for(char c : s.toCharArray()) {
//                count[c-'a']++;
//            }
//            StringBuilder key=new StringBuilder();
//            for(int num: count) {
//                key.append('#').append(num);
//            }
//            String keys=new String(key);
//            m.computeIfAbsent(keys, k-> new ArrayList<>()).add(s);
//        }
//        return new ArrayList<>(m.values());
        HashMap<String, List<String>> m=new HashMap<>();
        for (String s: strs) {
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            m.putIfAbsent(key, new ArrayList<>());
            m.get(key).add(s);
        }
        return new ArrayList<>(m.values());
    }
}
