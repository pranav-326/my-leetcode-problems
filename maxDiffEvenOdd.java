
import java.util.*;

public class maxDiffEvenOdd {
    public static int maxDifference(String s) {
        int Omax=0,Emax=0,Omin=101,Emin=101;
        Map<Character,Integer> m=new LinkedHashMap<>();
        char[] c=s.toCharArray();
        Arrays.sort(c);
        for (char d : c) {
            m.put(d, m.getOrDefault(d, 0)+1);
        }
        for (int d : m.values()) {
            if (d%2==0) {
                Emax=Math.max(Emax, d);
                Emin=Math.min(Emin,d);
            }
            else {
                Omax=Math.max(Omax, d);
                Omin=Math.min(Omin, d);
            }
        }
        return Omax-Emin;
    }
    public static void main(String[] args) {
        System.out.println(maxDifference("abcabcab"));
    }
}
