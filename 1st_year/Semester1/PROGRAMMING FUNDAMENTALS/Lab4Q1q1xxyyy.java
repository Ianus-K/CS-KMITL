// Convert temperature from degree Fahrenheit to degree Celsius
import java.util.Scanner;

class Lab4Q1q1xxyyy{
    public static void main(String[] args) {
        System.out.print("Enter the temperature in Fahrenheit : ");
        Scanner input = new Scanner(System.in);
        double Temp = input.nextDouble();
        Temp = ((Temp-32)/9)*5;
        System.out.print(Temp + " C");
        input.close();
    }

}