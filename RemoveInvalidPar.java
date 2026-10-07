import java.util.*;

public class RemoveInvalidPar {
    Set<String> result = new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        int openR = 0;
        int closeR = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                openR++;
            } else if (c == ')') {
                if (openR > 0) {
                    openR--;
                } else {
                    closeR++;
                }
            }
        }
        check(s, 0, 0, new StringBuilder(), openR, closeR);
        return new ArrayList<>(result);
    }

    private void check(
            String s,
            int pos,
            int bal,
            StringBuilder sb,
            int openR,
            int closeR
    ) {
        if (pos == s.length()) {
            if (bal == 0 && openR == 0 && closeR == 0) {
                result.add(sb.toString());
            }
            return;
        }

        char c = s.charAt(pos);

        if (c == '(') {
            if (openR > 0) {
                check(s, pos + 1, bal, sb, openR - 1, closeR);
            }
            sb.append(c);
            check(s, pos + 1, bal + 1, sb, openR, closeR);
            sb.deleteCharAt(sb.length() - 1);

        } else if (c == ')') {
            if (closeR > 0) {
                check(s, pos + 1, bal, sb, openR, closeR - 1);
            }
            if (bal > 0) {
                sb.append(c);
                check(s, pos + 1, bal - 1, sb, openR, closeR);
                sb.deleteCharAt(sb.length() - 1);
            }

        } else {
            sb.append(c);
            check(s, pos + 1, bal, sb, openR, closeR);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}