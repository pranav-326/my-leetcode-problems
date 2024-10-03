package LeetCode;

public class isSubs {
    public static boolean isSubsequence(String s, String t) {
        int sl = s.length();
        int tl = t.length();

        if (s.isEmpty()) {
            return true;  
        }
        if (sl > tl) {
            return false;  
        }

        int j = 0;  
        for (int i = 0; i < tl; i++) {  
            if (s.charAt(j) == t.charAt(i)) {
                j++;
                if (j == sl) {  
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String a = "abc";
        String b = "ahbgdc";
        boolean result = isSubsequence(a, b);
        System.out.println(result);  // Output: true
    }
}
