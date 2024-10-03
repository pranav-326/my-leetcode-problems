import java.util.*;

public class validpar {
    public boolean isValid1(String s) {
        // Remove all whitespaces from the string
        String st = s.replaceAll("\\s", "");
        
        // If the string length is odd, it cannot have valid pairs
        if (st.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        
        // Iterate over the modified string `st` instead of `s`
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);  // Use `st` here
            
            // If the character is an opening bracket, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // If the stack is empty or the brackets don't match, return false
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        // If the stack is empty, the string is valid
        return stack.isEmpty();
    }
}

/*        String st = s.replaceAll("\\s", ""); 

        if (st.length() % 2 != 0) { 
            return false;
        }

        int round = 0, curly = 0, square = 0;

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            switch (ch) {
                case '(':
                    round++;
                    break;
                case ')':
                    round--;
                    if (round < 0) return false;
                    break;
                case '{':
                    curly++;
                    break;
                case '}':
                    curly--;
                    if (curly < 0) return false;
                    break;
                case '[':
                    square++;
                    break;
                case ']':
                    square--;
                    if (square < 0) return false;
                    break;
                default:
                    return false; 
            }
        }
        return round == 0 && curly == 0 && square == 0;
    }
    public boolean isValid2(String s) {
        
        return false;
    }
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string of parentheses:");
        String str = in.nextLine();
        validpar tr1 = new validpar();
        System.out.println(tr1.isValid1(str));
    }
}
