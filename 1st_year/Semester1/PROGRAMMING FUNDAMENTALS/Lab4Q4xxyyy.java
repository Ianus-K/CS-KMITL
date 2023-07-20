// Displays the first 3 perfect numbers.
public class Lab4Q4xxyyy {
    public static void main(String[] args){
        int sum = 0;
        int x = 1;
        for (int num = 1; num < Integer.MAX_VALUE && x <= 3; num++) {
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num && num > 0) {
                System.out.println(num);
                x++;
            }
            sum = 0;
        }
    }
}