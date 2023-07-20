/*String str = "WWWWMMMMWMWMWMWMMMWWWWWM";
Collect the gender of a group of students. It is counted as
How many W students are there?
How many M students are there? */
public class Lab5Q4_1xxyyy {
    public static void main(String[] args){
        String str = "WWWWMMMMWMWMWMWMMMWWWWWM";
        int Women = 0;
        int Men = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'W'){
                Women = Women + 1;
            }
            else {
                Men = Men + 1;
            }
        }
        System.out.println("Women = " + Women);
        System.out.println("Men = " + Men);
    }
}