// Christmas tree
public class Lab5Q5_4xxyyy {
    public static void main(String[] args) {
        int n = 3;
        int layer = 0;
        // layer
        for(int x = 0; x < n; x++){
            for(int i = 1; i <= 4; i++){
                for(int y = 0; y <= (4-i)+(n-(x+1)); y++){
                    System.out.print(" ");
                }    
                for(int z = 1; z <= ((2 * i) - 1) + (x * 2) ; z++){
                    System.out.print("*");   
                    layer = z;    
                }
                System.out.println();
            } 
        }
        //trunk
        for(int a = 1; a <= n; a++){
            for(int x = 0; x <= (layer/2)-1; x++){
                System.out.print(" ");
            }
            for(int trunk = 0; trunk < 3; trunk++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}