import java.util.Arrays;
public class ProFun09_Q2_65031 {
    public static void main(String[] args) {
        int[][] data = { { 11, 12, 13, 14 },
                { 15, 16, 17, 18 },
                { 19, 20, 21, 22 },
                { 23, 24, 25, 26 },
                { 27, 28, 29, 30 },
        };
        int[][] hori = flipHorizontal(data);
        for(int row = 0; row < data.length; row++){
            System.out.println(Arrays.toString(hori[row]));
        }
    }

    static int[][] flipHorizontal(int[][] data) {
        int[][] aRef = new int[data.length][data[0].length];
        for(int i =0; i<data.length / 2 +1;i++){
            int[] tmp1 = data[i];
            int[] tmp2 = data[data.length-i-1];

            aRef[i] = tmp2;
            aRef[aRef.length-i-1] = tmp1;

        }
        return aRef;
    }
}
