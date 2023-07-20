// Find the sum of numbers 0-1000 that are divisible by 3 and divisible by 5
public class Lab3Q3xxyyy {

    public static void main(String[] args) {
        int a = 1, b = 0, c = 0, d = 0;
        while (b < 1000){
            b = 3*a;
            if (b<1000){
                c = 5*a;
                if(c<1000){
                    if(c % 15 != 0){
                        d=d+b+c;
                    }
                    else{
                        d=d+b;
                    }
                }
                else{
                    d=d+b;
                }
            }
            else{
                System.out.println(d);
            }
            
            a++;
        }
    }
}