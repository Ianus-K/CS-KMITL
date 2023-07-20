import java.util.Arrays;
public class ProFun10_Q3_xxyyy {
    public static void main(String[] args) {
        int[] ayyay = { 1, -2, 3, 4, -5 };
        System.out.println(Arrays.toString(negativeToZero_(ayyay)));
    }

    public static int[] negativeToZero_(int[] a) {
        int i = 0;
        return (negativeToZero(a, i));
    }
    
    public static int[] negativeToZero(int[] a, int i) {
        if (i == a.length) {
            return (a);
        }
        if (a[i] < 0) {
            a[i] = 0;
            negativeToZero_(a);
        }
        return (negativeToZero(a, i + 1));
    }
}
