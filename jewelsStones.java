
import java.util.HashSet;
import java.util.Set;


public class jewelsStones {
    public int numJewelsInStones(String jewels, String stones) {
    //  char[] jew=jewels.toCharArray();
    //  char[] sto=stones.toCharArray();
    //  int count=0;
    //  for (char c : sto) {
    //     for (char d : jew) {
    //         if (c==d) {
    //             count++;
    //         }
    //     }
    //  }
    //  return count;   
    Set<Character> s=new HashSet<>();
    for (char c : jewels.toCharArray()) {
        s.add(c);
    }
    int count=0;
    for (char c : stones.toCharArray()) {
        if(s.contains(c))
         count++;
    }
    return count;
    }

    public static void main(String[] args) {
        jewelsStones obj=new jewelsStones();
        int n=obj.numJewelsInStones("z", "ZZ");
        System.out.println(n);
    }
}
