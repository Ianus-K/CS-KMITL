// Find the sum of the prices of 3 items, considering only the 2 most valuable of the 3 items
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Lab4Q2xxyyy {
    public static void main(String[] args) {
        ArrayList<Integer> Num = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.printf("First piece : ");
        for (int i = 0; i < 3; i++){
            int input = sc.nextInt();
            Num.add(input);
            if(i == 0){
                System.out.printf("Second piece : ");
            }
            if(i == 1){
                System.out.printf("Third piece : ");
            }
        }
        Num.remove(Collections.min(Num));
        System.out.println(Num.get(0)+Num.get(1));
        sc.close();
    }   
}