import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int ArrL = sc.nextInt();
        for (int i = 0; i <= ArrL; i++){
            String input = sc.nextLine();
            String []arr = input.split(" ", 5);
            name.add(arr[0]);
        }
        name.remove(0);
        System.out.print(name);
        sc.close();
    }
}
