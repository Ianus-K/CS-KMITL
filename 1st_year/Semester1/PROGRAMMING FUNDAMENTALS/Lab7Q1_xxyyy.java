// Factorial input
import java.util.Scanner;
class Lab7Q1_xxyyy {
    public static void main(String args[]) {  
        System.out.print("Enter the desired factorial value : ");
        Scanner input = new Scanner(System.in);
        System.out.println("Factorial is: " + factorial(input.nextInt()));
        input.close();
    }
    static int factorial(int n) {
        int i, fact = 1;
        for(i = n; i > 0; i--) {    
            fact = fact*i;    
        } 
        return(fact);
    }
    
}  