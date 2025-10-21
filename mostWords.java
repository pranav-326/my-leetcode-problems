public class mostWords {
    public static int mostWordsFound(String[] sentences) {
        int max=0;
        for (String string : sentences) {
            String[] str=string.split(" ");
            if (str.length>max) {
                max=str.length;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String[] s={"alice and bob love leetcode","i think so too","this is great thanks very much"};
        System.out.println(mostWordsFound(s));
    }
}
