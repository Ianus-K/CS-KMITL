import java.util.Scanner;

public class Programming_Quiz_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int column = sc.nextInt();
        int row = sc.nextInt();
        int[][] data = new int[row][column];

        for(int i = 0; i < row; i++){
          for (int j = 0; j < column; j++){
            data[i][j] = sc.nextInt();
          }
        }

        int sortCol = sc.nextInt();

        //Sort
        int[][] mem = {{}, {}};
        for(int i = 0; i < row - 1; i++){
            for(int j = i + 1; j < row; j++){
                if(data[i][sortCol] > data[j][sortCol]){
                    mem[0] = data[i];
                    mem[1] = data[j];
                    data[j] = mem[0];
                    data[i] = mem[1];
                }
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(data[i][j]);
                if(j < column - 1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}