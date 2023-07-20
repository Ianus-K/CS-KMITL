// There are 10 arrays. Sort the received positive integers in descending order.
import java.util.*;
class ProFun08_Q3_xxyyy {
    public static void main(String[] args) {
        int[] intArr = new int[10];
        topK(intArr);
    }

    static void topK(int[] intArr) {
        Scanner sc = new Scanner(System.in);
        int input;
        int c = 0;
        
        do {
            input = sc.nextInt();
            if (input > 0) {
                for (int i = 0; i < intArr.length; i++) {
                    if (input >= intArr[i]) {
                        c = i;
                        break;
                    }
                }
                for (int i = intArr.length - 1; i > c; i--) {
                    intArr[i] = intArr[i - 1];
                }
                intArr[c] = input;
                System.out.println(Arrays.toString(intArr));
            }
        } 
        while (input > 0);
        System.out.println("<Program Terminated>");
        sc.close();
    }
}
