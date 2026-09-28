import java.util.Stack;

public class dailyTemp {
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] out=new int[temperatures.length];
        Stack<int[]> s=new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            int t=temperatures[i];
            while (!s.isEmpty()&&t>s.peek()[0]) {
                int[] pair=s.pop();
                out[pair[1]]=i-pair[i];
            }
            s.push(new int[]{t,i});
        }
        return out;
    }
}
