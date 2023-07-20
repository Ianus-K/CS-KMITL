public class ProFun10_Q1_xxyyy {
    public static void main(String[] args){// caller 
        int[] a = {1,2,3,2,4,2};
        System.out.println(appearsIn_(a, 2)); // true
    }
    static boolean appearsIn_(int[] a, int n) {
        return appearsIn(a, n, 0,false);
    }
    
    public static boolean appearsIn(int[] a, int n, int idx, boolean x) {
        if (idx == a.length){
            return x;
        }
        if (a[idx] == n){
            x = true;
            return x;
        }
        return appearsIn(a, n, idx + 1, x);
    }
}
