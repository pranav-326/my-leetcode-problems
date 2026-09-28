public class TransformArray {
    public boolean canTransform(int[] source, int[] target) {
        long ss=0,ts=0;
        for (int i = 0; i < source.length; i++) {
            ss+=source[i];
            ts+=target[i];
        }
        return ss==ts;
    }
}
