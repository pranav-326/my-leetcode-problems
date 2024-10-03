package LeetCode;

// String word="";
//         int a=0,b=0;
//         int length=word1.length()+word2.length();
//         for (int i = 0; i < length; i++) {
            
//             if (i%2==0) {
//                 word=word+word1.charAt(a);
//                 // System.out.println(a);
//                 a++;
//             }
//             else {
//                 word=word+word2.charAt(b);
//                 // System.out.println(b);
//                 b++;
//             }
//         }
//         return word;
public class merStrAlt {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder s=new StringBuilder();
        int n1=word1.length();
        int n2=word2.length();
        int i=0;
        while (i<n1||i<n2) {
            if (i<n1) {
                s.append(word1.charAt(i));
            }
            if (i<n2) {
                s.append(word2.charAt(i));
            }
            i++;
        }
        return s.toString();
    }
    public static void main(String[] args) {
        String str=mergeAlternately("ab", "pqrs");
        System.out.println(str);
    }
}
