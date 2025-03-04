package LeetCode;

public class revstr {

    public static void reverseString(char[] s) {
        int len=s.length;
        for (int i=0; i<len/2;i++) {
            char ch1=s[i];
            char ch2=s[len-i-1];
            char temp=ch1;
            s[i]=ch2;
            s[len-i-1]=temp;
        }
    }
    public static void main(String[] args) {
        String s1="hellomoto";
        char[] s=s1.toCharArray();
        reverseString(s);
        System.out.println(s);
    }
}