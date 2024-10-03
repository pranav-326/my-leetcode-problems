package LeetCode;
public class strScore {
    public static int scoreOfString(String s) {
        int score=0;
        for (int i = 0; i < s.length()-1; i++) {
            int a=Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
            score=score+a;
        }
        return score;
    }
    public static void main(String[] args) {
        System.out.println(scoreOfString("zaz"));
    }
}