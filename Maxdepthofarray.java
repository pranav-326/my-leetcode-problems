public class Maxdepthofarray {
    public int maxDepth(String s) {
        int max=0, co=0;
        for(char c:s.toCharArray()) {
            if(c=='(') {
                co++;
                max=Math.max(max,co);
            }
            else if(c==')') co--;
        }
        return max;
    }
}
