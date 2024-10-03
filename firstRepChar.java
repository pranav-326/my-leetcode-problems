package LeetCode;

import java.util.ArrayList;

/**
 * firstRepChar
 */
public class firstRepChar {
    public static char repeatedCharacter(String s) {
        ArrayList <Character> li= new ArrayList<>();
        for (char ch : s.toCharArray()) {
            if (li.contains(ch)) {
                return ch;
            }
            li.add(ch);
        }
        return ' ';
    }
    public static void main(String[] args) {
        System.out.println(repeatedCharacter("abcdd"));
    }
}