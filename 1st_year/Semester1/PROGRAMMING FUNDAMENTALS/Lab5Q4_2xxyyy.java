/*Answers the first position where the vowel (a, e, i, o, u) is found in a String. -1 if String
There is no vowel.
String s1 = "I am happy"; // 0 with s1 = s1.toLowerCase();
String s2 = "xyz" // -1 */
public class Lab5Q4_2xxyyy {
    public static void main(String[] args){
        String s1 = "I am happy"; // 0 with s1 = s1.toLowerCase();
        String s2 = "xyz"; // -1
        s1 = s1.toLowerCase();
        char check;
        for (int Position = 0; Position < s1.length(); Position++){
            check = s1.charAt(Position);
            if (check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u'){
                System.out.println(Position);
                Position = 0;
            }
            else {
                System.out.println(-1);
                break;
            }
            
        }

        for (int Position = 0; Position < s2.length(); Position++){
            check = s2.charAt(Position);
            if (check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u'){
                System.out.println(Position);
                Position = 0;
            }
            else {
                System.out.println(-1);
                break;
            }
        }  
    }
}