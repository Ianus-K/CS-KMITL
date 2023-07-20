// Finds the sum of the positive even numbers from 0 to the received numbers
import java.util.Scanner;

class EvenNumbers{
    public static void main(String[] args) {
        System.out.print("Input number :");
        Scanner input = new Scanner(System.in);
        int Num = input.nextInt();
        int Sum = 0;
        while(Num >= 0){
            if(Num % 2 == 0){
                Sum = Sum + Num;
                Num = Num - 2;
            }
            else{
                Num = Num - 1;
            }
        }
        System.out.print(Sum);
        input.close();

    }

}