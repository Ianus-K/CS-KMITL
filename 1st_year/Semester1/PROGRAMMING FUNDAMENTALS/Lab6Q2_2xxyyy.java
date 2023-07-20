/*find magnetic group 
ex input 10 10 10 01 10 10 */
import java.util.Scanner;
public class Lab6Q2_2xxyyy {
    public static void main(String[] args){
        int ttgroub = 1;
        int magnetic = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter magnets: ");
        String magnets = sc.nextLine();

        for(int i = 0;i<magnets.length();i++){
            if(magnets.charAt(i) == ' ')
                magnetic++;
        }
        for(int i = 1; i <= (magnetic - 1); i++){
            if(magnets.charAt(3 * i - 2) == magnets.charAt((3 * i - 2) + 2)){
                ttgroub++;
            }
        }
        System.out.println("Group of all magnets = " + ttgroub);
        sc.close();
    }
}
