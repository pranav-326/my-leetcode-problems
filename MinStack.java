import java.util.*;
class MinStack {
    Stack<Integer> s;
    Stack<Integer> min;

    public MinStack() {
        s = new Stack<>();
        min = new Stack<>();
    }

    public void push(int value) {
        s.push(value);
        if (min.isEmpty()) min.push(value);
        else min.push(Math.min(min.peek(), value));
    }

    public void pop() {
        s.pop();
        min.pop();
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
//    int n, min;
//    List<Integer> s;
//    public MinStack() {
//        s=new ArrayList<>();
//        n=0;
//        min = Integer.MAX_VALUE;
//    }
//    public void push(int value) {
//        s.add(n, value);
//        n++;
//        if(value<min) min=value;
//    }
//    public void pop() {
//        if (n == 0) return;
//        s.remove(n - 1);
//        n--;
//
//        if (n > 0) {
//            min = s.get(0);
//            for (int i = 1; i < n; i++) {
//                min = Math.min(min, s.get(i));
//            }
//        }
//    }
//    public int top() {
//        return s.get(n-1);
//    }
//    public int getMin() {
//        return min;
//    }


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */