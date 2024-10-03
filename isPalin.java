package LeetCode;

public class isPalin {
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int l=0, r=s.length()-1;
        while (r>l) {
            if (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(r))) {
                r--;
                continue;
            }
            if (s.charAt(r)!=s.charAt(l)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
