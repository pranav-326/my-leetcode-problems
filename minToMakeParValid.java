import java.util.ArrayDeque;
import java.util.Deque;

public class minToMakeParValid {
    public int minAddToMakeValid(String s) {
        Deque<Integer> st = new ArrayDeque<>();
        int out=0;
        for (char c:s.toCharArray()) {
            if(c=='(')
                st.push(1);
            else if(c==')' && !st.isEmpty())
                st.pop();
            else
                out++;
        }
        return out+st.size();
    }
}
