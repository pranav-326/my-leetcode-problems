public class strCompression { 
    public static int compress(char[] chars) {
        int index=0;
        int start=0;
        while (start<chars.length) {
            int end=start;
            while(end<chars.length&&chars[start]==chars[end]) {
                end++;
            }
            int count=end-start;
            chars[index++]=chars[start];
            if (count>=2) {
                char[] freq=Integer.toString(count).toCharArray();
                for (char c : freq) {
                    chars[index++]=c;
                }
            }
            start=end;
        }
        return index;
    }
    public static void main(String[] args) {
        char[] chars=new char[]{'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }
}
