//Find max // max is the largest value in data
class Lab6Q2_1xxyyy {
    public static void main(String[] args) {
        int []data={7, 1, 2, -1, 3, 4, 10, -12, 3, 21, -9};
        int max = 0;
            for(int j = 0; j < data.length-1; j++){
                if(data[j] < data[j+1]){
                    max = data[j+1] ;
                }
            }
        System.out.println("The largest value in data = " + max);
    }
}