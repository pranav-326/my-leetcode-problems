// import java.util.*;
public class lenOfLast {
    public static int lengthOfLastWord(String s) {
        int g=s.length();
        int f=0;
        for(int i=g-1;i>=0;i--){
            if(s.charAt(i) != ' '){
                f++;
            }else if(f>0){
                break;
            }
        }
        return f;
    }
    public static int lengthOfLastWord1(String s) {
        int lenOfLast=s.trim().split(" ")[s.trim().split(" ").length-1].length();
        return lenOfLast;
    }
    public static void main(String[] args) {
        String s="you are the boss of your own life";
        System.out.println(lengthOfLastWord1(s));
    }
}