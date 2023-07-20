/* Show
 xxxxxxxx 

x xxxxxx x

xx xxxx xx

xxx xx xxx

xxxx  xxxx

xxxx  xxxx

xxx xx xxx

xx xxxx xx

x xxxxxx x

 xxxxxxxx
  */
public class Lab5Q5_1xxyyy {
    public static void main (String[] args){
        int n = 10;
        for(int row = 1; row <= n; row++){
            for(int column = 1; column <= n; column++){
                if(column == row || column == n - (row - 1)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("x");
                   } 
            }
            System.out.println();
            System.out.println(" ");
        }
    }
}
