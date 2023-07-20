// Use a loop to find the sum of the numbers 1 - 199, skipping numbers that are divisible by 10 by continue.
public class Lab5Q3xxyyy {
    public static void main(String[] args){
        
        int sum = 0;
        for (int num = 1; num <= 199; num++) {
            if (num % 10 != 0) {
                sum += num;
            }
            else {
                continue;
            }
        }
        System.out.println(sum);
    }
}