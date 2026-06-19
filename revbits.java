public class revbits {
    public int reverseBits(int n) {
        StringBuilder sb=new StringBuilder(String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0'));
        sb.reverse();
        return Integer.parseInt(sb.toString(), 2);
    }
}
