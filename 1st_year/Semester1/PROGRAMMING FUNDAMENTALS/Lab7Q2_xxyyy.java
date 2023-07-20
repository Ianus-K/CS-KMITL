//Find the largest value in data but split method
class Lab7Q2_xxyyy {
    public static void main(String[] args) {
        int [] data = {7, 1, 2, -1, 3, 4, 10, -12, 3, 21, -9};
        System.out.println(  maxElement(data));
    }
    static int maxElement(int[] data) {
        
        int max = 0;
        for(int i = 0; i < data.length-1; i++){
            if(data[i] < data[i+1]){
                max = data[i+1] ;
            }
        }
        return(max);
    }
}