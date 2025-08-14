
import java.util.*;

public class validpar {
    public boolean isValid1(String s) {
        String st = s.replaceAll("\\s", "");
        if (st.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i); 
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string of parentheses:");
        String str = in.nextLine();
        validpar tr1 = new validpar();
        System.out.println(tr1.isValid1(str));
    }
}
