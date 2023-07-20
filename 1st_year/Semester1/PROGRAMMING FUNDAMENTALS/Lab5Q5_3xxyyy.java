// Show P as a triangle.
public class Lab5Q5_3xxyyy {
    public static void main (String[] args){
        int n = 4;
        for (int i = 1; i <= n; i++){
            int count = 0;
            for (int blank = 1; blank <= n - i; blank++){
                System.out.print (" ");
            }
            while (count != (i * 2) - 1){
                System.out.print("P");
                count++;
            }
            System.out.println();
            System.out.println(" ");
        }
    }
}
