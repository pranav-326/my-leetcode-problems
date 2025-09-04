
import java.util.Stack;

public class baseballgame {
    public static int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        int score=0;
        for (String ops : operations) {
            if (ops.equals("+")) {
                int meh=s.get(s.size()-1)+s.get(s.size()-2);
                s.push(meh);
            }
            else if (ops.equals("D")) {
                s.push(2*s.peek());
            }
            else if (ops.equals("C")) {
                s.pop();
            }
            else {
                s.push(Integer.valueOf(ops));
            }
        }
        for (Integer i : s) {
            score+=i;
        }
        return score;
    }
}
/*
An integer x.
Record a new score of x.
'+'.
Record a new score that is the sum of the previous two scores.
'D'.
Record a new score that is the double of the previous score.
'C'.
Invalidate the previous score, removing it from the record.
 */