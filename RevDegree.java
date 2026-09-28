public class RevDegree {
    public static int reverseDegree(String s) {
        int out=0,prd=1;
        for (int i = 0; i < s.length(); i++) {
            int index=s.charAt(i)-'a';
            int rev=26-index;
            prd=(i+1)*rev;
            out+=prd;
        }
        return out;
    }
    public static void main(String[] args) {
        System.out.println(reverseDegree("abc"));
    }
}
