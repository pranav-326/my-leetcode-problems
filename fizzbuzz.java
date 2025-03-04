package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class fizzbuzz {
    public List<String> fizzBuzz(int n) {
        List<String> out=new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i%3==0&&i%5==0) {
                out.add("FizzBuzz");
            }
            else if (i%5==0) {
                out.add("Buzz");
            }
            else if (i%3==0) {
                out.add("Fizz");
            }
            else {
                out.add(Integer.toString(i));
            }
        }
        return out;
    }
    public static void main(String[] args) {
        fizzbuzz f=new fizzbuzz();
        System.out.println(f.fizzBuzz(15));
    }
}