
import java.util.HashMap;

public class validAnagram {
    public boolean isAnagram(String s1, String s2) {
        HashMap<Character, Integer> m3= new HashMap<>();
        HashMap<Character, Integer> m4= new HashMap<>();
        if (s1.length()!=s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            char ch=s1.charAt(i);
            m3.put(ch, m3.getOrDefault(ch, 0)+1);
            char ch1=s2.charAt(i);
            m4.put(ch1, m4.getOrDefault(ch1, 0)+1);
        }
        if (m3.equals(m4)) {
            return true;
        }
        return false;
    }
}