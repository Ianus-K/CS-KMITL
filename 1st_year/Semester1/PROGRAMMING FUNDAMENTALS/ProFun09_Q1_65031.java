import java.util.Arrays;
public class ProFun09_Q1_65031 {
    public static void main(String[] args) {
        int[] data = { 0, 1, 0, 1, 1, 0, 0, 0, 1 };
        System.out.println(Arrays.toString(shake(data)));
    }

    static int[] shake(int[] data) {
        int count1 = 0;
        int count0 = 0;
        for (int i = 0; i < data.length; i++) {
            if(data[i] == 1){
                count1 ++;
            }
            else{
                count0++;
            }
        }
        int[] sort = new int[data.length];
        for(int i = 0; i < count0; i++){
            sort[i] = 0;
        }
        for(int i = count1 + 1; i < data.length; i++){
            sort[i] = 1;
        }
        return sort;
    }
}
