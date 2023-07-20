public class Lab4 {

    public static void main(String[] args) {
        
        int []arr = { 1, 1, 2, 2, 2, 4, 5, 7 };
        int i= 0; 
        int j= 0;
        int ans= 0; 
        int cnt= 0;
        int maxCnt = 0;
        int m= 0; 
        int k= 0;
        int secret= 0;
        int arrSize = arr.length; // arrSize is 8
        for (i = 0; i < arrSize; i++) {
            cnt = 0;
            for (j = 0; j < arrSize; j++) {
                if (arr[i] == arr[j]) {
                cnt++;
                k++;
                }
            }
            if (cnt > maxCnt) {
            maxCnt = cnt;
            ans = arr[i];
            secret = i;
            m++;
            }
        }
        System.out.println(ans + " " + maxCnt);
        secret += k + m;
        System.out.println(secret);
    }
}
