import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoveOutermostPar {
    public static String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int lvl=0;
        for (char c : s.toCharArray()) {
            if (c=='(') {
                if (lvl > 0) sb.append(c);
                lvl++;
            }
            else if(c==')')  {
                lvl--;
                if (lvl > 0) sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
    }
}
