/* Show
4 

4 3

4 3 2

4 3 2 1
*/
public class Lab5Q5_2xxyyy {
    public static void main (String[] args){
        int count = 1;
        int n = 4;
        int number [][] = new int[4][];
        for (int i = 0; i < 4; i++){
            number[i] = new int[count++];
            for (int j = 0; j <= i; j++){
                number[i][j] = n;
                System.out.print(number [i][j] - j + " ");
            }
            System.out.println();
            System.out.println(" ");
        }
    }
}