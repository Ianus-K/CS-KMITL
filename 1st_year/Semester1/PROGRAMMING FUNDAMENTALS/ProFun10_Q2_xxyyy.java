public class ProFun10_Q2_xxyyy {
    public static void main(String[] args){// caller 
        int[] a = {1,2,3,2,4,2};
        System.out.println(occurrences_(a, 2)); // true
    }
    static int occurrences_(int[] a, int n) {
        return occurrences(a, n, 0,0);
        }
    
    static int occurrences(int[] a, int n, int idx,int cnt) {
        if (idx == a.length)
            return cnt;
        if (a[idx] == n)
            cnt++;
        return occurrences(a, n, idx + 1,cnt);
    }
}
