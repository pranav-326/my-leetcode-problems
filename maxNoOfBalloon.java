package LeetCode;

import java.util.HashMap;

public class maxNoOfBalloon {
    public static int maxNumberOfBalloons(String text) {
        if (text.length()>=7) {
            HashMap<Character, Integer> m=new HashMap<>();
            for (char ch : text.toCharArray()) {
                if (ch=='b'||ch=='a'||ch=='l'||ch=='o'||ch=='n') {
                    m.put(ch, m.getOrDefault(ch, 0)+1);
                }
            }
            int mi1=Math.min(m.getOrDefault('b', 0),Math.min(m.getOrDefault('a', 0),m.getOrDefault('n', 0)));
            int mi2=Math.min(m.getOrDefault('l', 0)/2,m.getOrDefault('o', 0)/2);
            return Math.min(mi1, mi2);
        }  
        return 0;
    }
    public static void main(String[] args) {
        int i=maxNumberOfBalloons("ballo");
        System.out.println(i);
    }
}
