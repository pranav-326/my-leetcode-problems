import java.util.*;
public class mapground {
    public static void main(String[] args) {
        String s1="Pranav";
        mapground mg=new mapground();
        boolean a=repeatedchars(s1);
        int[] arr1={1,2,7,2,3};
        int[] arr=twosum(arr1, 10);
        int[] a1={1,3,5};
        int[] a2={2,4,6};
        System.out.println(findDupl(arr1));
        // System.out.println(inCommon(a1, a2));
        // System.out.println(a);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(mg.validAnagram("rat", "car"));
        // System.out.println(mg.repeatedInts(arr1));
    }
    public static boolean repeatedchars(String s) {
        HashMap<Character, Integer> m1= new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (m1.containsKey(ch)) {
                m1.put(ch, m1.get(ch)+1);
            }
            else {
                m1.put(ch, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (m1.get(ch)>1) {
                return true;
            }
        }
        return false;
    }
    public static int[] twosum(int[] nums, int target) {
        HashMap<Integer, Integer> m2=new HashMap<>();
        int[] out=new int[2];
        if (nums.length>=2) {
        for (int i = 0; i < nums.length; i++) {
            int curr=nums[i];
            if (m2.containsKey(target-curr)) {
                out[0]=m2.get(target-curr);
                out[1]=i;
                return out;
            } else {
                m2.put(curr, i);
            }
        }
        }
        if (out[0]==0&&out[1]==0) {
            return new int[0];
        }
        return out;
    }
    public static boolean validAnagram(String s1, String s2) {
        HashMap<Character, Integer> m3= new HashMap<>();
        HashMap<Character, Integer> m4= new HashMap<>();
        if (s1.length()!=s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            char ch=s1.charAt(i);
            if (m3.containsKey(ch)) {
                m3.put(ch, m3.get(ch)+1);
            }
            else {
                m3.put(ch, 1);
            }
            char ch1=s2.charAt(i);
            if (m4.containsKey(ch1)) {
                m4.put(ch1, m4.get(ch1)+1);
            }
            else {
                m4.put(ch1, 1);
            }
        }
        if (m3.equals(m4)) {
            return true;
        }
        return false;
    }
    public static boolean repeatedInts(int[] arr) {
        HashMap<Integer, Integer> m=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int curr=arr[i];
            if (m.containsKey(curr)) {
                m.put(curr, m.get(curr)+1);
            }
            else {
                m.put(curr, 1);
            }
        }
        for (Map.Entry<Integer,Integer> entry:m.entrySet()){
            if (entry.getValue()>=2) {
                return true;
            }
        }
        return false;
    }
    public static boolean inCommon(int[] arr1,int[] arr2) {
        HashMap<Integer, Boolean> m=new HashMap<>();
        for (int i : arr1) {
            m.put(i, true);
        } 
        for (int i : arr2) {
            if (m.containsKey(i)) {
                return true;
            }
        }
        return false;
    }
    public static ArrayList<Integer> findDupl(int[] arr) {
        ArrayList<Integer> li=new ArrayList<>();
        HashMap<Integer, Integer> m=new HashMap<>();
        for (int i : arr) {
            m.put(i, m.getOrDefault(i, 0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue()>=2) {
                li.add(entry.getKey());
            }
        }
        return li;
    }
}