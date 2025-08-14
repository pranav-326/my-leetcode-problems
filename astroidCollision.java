import java.util.Stack;

public class astroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> ast=new Stack<>();
        for (int a : asteroids) {
            if (ast.isEmpty()||a>0) {
                ast.push(a);
            } else {
                while(true) {
                    if (ast.peek()<0&&a<0) {
                        ast.push(a);
                        break;
                    } else if (ast.peek()>0&&a<0) {
                        int p=ast.pop();
                        ast.push((Math.abs(a)>Math.abs(p))?a:p);
                        break;
                    } else if (ast.peek()==-a) {
                        ast.pop();
                        break;
                    }
                }
            }
        }
        return new int[]{};   
    }
}
