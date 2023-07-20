import java.util.Arrays;
public class ProFun09_Q3_65031 {
    public static void main(String[] args) {
        int[][] bMap = {
                { 0, 0, 9, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 9, 9, 9, 0, 0, 0 },
                { 0, 9, 9, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 9, 0, 0, 9, 9, 0, 0, 9, 0, 9, 0, 0 },
                { 0, 9, 0, 0, 9, 9, 0, 0, 9, 9, 9, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 9, 9, 9, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 9, 9, 0, 0, 0, 0 }
        };
        int[][] mMap = markMap(bMap);
        for (int i = 0; i < bMap.length; i++) {
            System.out.print(Arrays.toString(bMap[i]) + " ");
            System.out.print(Arrays.toString(mMap[i]));
            System.out.println();
        }
    }

    static int[][] markMap(int[][] bMap) {
        int rowCnt = bMap.length;
        int colCnt = bMap[0].length;
        int[][] mMap = new int[rowCnt][colCnt];
        for (int i = 0; i < rowCnt; i++) {
            for (int j = 0; j < colCnt; j++) {
                mMap[i][j] = bMap[i][j];
            }
        }
        int bombCnt = 0;
        for (int i = 0; i < rowCnt; i++) {
            for (int j = 0; j < colCnt; j++) {
                if (mMap[i][j] == 9) {
                    continue;
                }
                for (int si = -1; si <= 1; si++) {
                    for (int sj = -1; sj <= 1; sj++) {
                        try {
                            if (mMap[i + si][j + sj] == 9) {
                                bombCnt++;
                            }
                        } catch (IndexOutOfBoundsException e) {
                            continue;
                        }
                    }
                }
                if (bombCnt > 0) {
                    mMap[i][j] = bombCnt;
                    bombCnt = 0;
                }
            }
        }
        return mMap;
    }
}