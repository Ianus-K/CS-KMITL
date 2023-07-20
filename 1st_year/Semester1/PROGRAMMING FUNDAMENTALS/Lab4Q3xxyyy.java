// Write a program to calculate the parking fee.
public class Lab4Q3xxyyy {
/*Number of Hours           Rate
    0-2 hr                  $4.00
    2-4 hr                  $3.00
    Every next hour         $1.00
    Daily parking fee       $24.00 */
    public static void main(String[] args) {
        int amountCharge = 0;
        int hrsPark = 0;
        int Day = 0;
        for (int i = 0; i < args.length; i++) {
            hrsPark = Integer.parseInt(args[i]);
            //your code
            //2 3 4 5 20 22 123
            if (hrsPark > 24){
                Day = hrsPark/24;
                hrsPark = hrsPark%24;
                amountCharge += Day*24;
            }
            if (hrsPark >= 18 && hrsPark <= 24){
                amountCharge += 24;
            }
            while (hrsPark > 4 && hrsPark < 18){
                hrsPark -= 1;
                amountCharge += 1;
            }
            while (hrsPark >= 3 && hrsPark <= 4){
                hrsPark -= 1;
                amountCharge += 3;
            }
            if (hrsPark >=1 && hrsPark <= 2){
                amountCharge += 4;
            }
            System.out.println(amountCharge);
            amountCharge = 0;
        }
    } //4 7 10 11 24 24 127 
}   