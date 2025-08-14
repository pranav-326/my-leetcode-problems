public class findOrgStr1 {
    public static int possibleStringCount(String word) {
        int sum=0;
        for (int i = 0; i < word.length()-1; i++) {
            if (word.charAt(i)==word.charAt(i+1)) {
                sum++;
            }
        }
        return sum+1;
    }
    public static void main(String[] args) {
        System.out.println(possibleStringCount("ere"));
    }
}
