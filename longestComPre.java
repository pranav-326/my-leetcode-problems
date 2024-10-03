package LeetCode;

import java.util.Arrays;

public class longestComPre {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder result=new StringBuilder();
        char[] first=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();
        for (int i = 0; i < first.length; i++) {
            if (first[i]!=last[i]) {
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String[] str={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }
}