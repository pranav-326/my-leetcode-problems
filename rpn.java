import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.Stack;

public class rpn {
    public static int evalRPN2(String[] tokens) {
        Deque<Integer> s = new ArrayDeque<>();
        for (String token : tokens) {
            if(isOP(token)) {
                int a=s.pop();
                int b=s.pop();
                switch (token) {
                    case "+":
                        s.push(a+b);
                        break;
                    case "-":
                        s.push(b-a);
                        break;
                    case "*":
                        s.push(a*b);
                        break;
                    case "/":
                        s.push(b/a);
                        break;
                    default:
                        break;
                }
            }
            else s.push(Integer.parseInt(token));
        }
        return s.peek();
    }
    public static boolean isOP(String op) {
        return Objects.equals(op, "+") || Objects.equals(op, "-") || Objects.equals(op, "*") || Objects.equals(op, "/");
    }
    public static int evalRPN1(String[] tokens) {
        Stack<String> s=new Stack<>();
        for (String token : tokens) {
            if (token.matches("-?\\d+")) {
                s.push(token);
            } else {
                switch (token) {
                    case "+":
                        s.push(String.valueOf(Integer.parseInt(s.pop()) + Integer.parseInt(s.pop())));
                        break;
                    case "-":
                        String tempSub = s.pop();
                        s.push(String.valueOf(Integer.parseInt(s.pop()) - Integer.parseInt(tempSub)));
                        break;
                    case "*":
                        s.push(String.valueOf(Integer.parseInt(s.pop()) * Integer.parseInt(s.pop())));
                        break;
                    case "/":
                        String tempDiv = s.pop();
                        s.push(String.valueOf(Integer.parseInt(s.pop()) / Integer.parseInt(tempDiv)));
                        break;
                    default:
                        break;
                }
            }
        }
        return Integer.parseInt(s.peek());
    }

    public static void main(String[] args) {
        System.out.println(evalRPN1(new String[]{"4","13","5","/","+"}));
    }
}
