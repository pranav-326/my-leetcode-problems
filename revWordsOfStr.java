
import java.util.Arrays;

public class revWordsOfStr {
    public static String reverseWords(String s) {
        String s1[]=s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i=s1.length-1;i>=0;i--){
            if (i==s1.length-1) {
                sb.append(s1[i]);
            }
            else {
                sb.append(" ");
                sb.append(s1[i]);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="jidiwdj djwjdiwjd    wdnddnw a good   example";
        String s1[]=s.split("\\s+");
        System.out.println(Arrays.toString(s1));
    }
}
