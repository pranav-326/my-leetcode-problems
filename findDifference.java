public class findDifference {
    public static char findTheDifference(String s, String t) {
        char a[]=s.toCharArray(),b[]=t.toCharArray();
        int x=0,y=0;
        for (int i = 0; i < b.length; i++) {
            y+=(int)b[i];
            if (i<a.length) {
                x+=(int)a[i];
            }
        }
        int diff=y-x;
        return (char) diff;
    }
    public static void main(String[] args) {
        System.out.println(findTheDifference("", "y"));
    }
}
