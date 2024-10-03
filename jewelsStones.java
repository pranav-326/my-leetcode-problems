package LeetCode;

public class jewelsStones {
    public int numJewelsInStones(String jewels, String stones) {
     char[] jew=jewels.toCharArray();
     char[] sto=stones.toCharArray();
     int count=0;
     for (char c : sto) {
        for (char d : jew) {
            if (c==d) {
                count++;
            }
        }
     }
     return count;   
    }
    public static void main(String[] args) {
        jewelsStones obj=new jewelsStones();
        int n=obj.numJewelsInStones("z", "ZZ");
        System.out.println(n);
    }
}
