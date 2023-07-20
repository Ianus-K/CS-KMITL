import java.util.*;

public class Q2 {
    static ArrayList<ProFun14Employee> eList;
    
    Q2(){
        eList = new ArrayList<>();
    }

    void oldway() {
        int yearThreshold = 2015;
        ArrayList<ProFun14Employee> empBefore2015 = new ArrayList<>();
        for(int i = 0; i < eList.size(); i++){
            ProFun14Employee curr = eList.get(i);
            if (curr.yearStart < yearThreshold){
                empBefore2015.add(curr);
            }
        }
         
        System.out.println(empBefore2015);
    }

    public static void main(String[] args) {
        Q2 demo = new Q2(); 
        Scanner sc = new Scanner(System.in);
        int ArrL = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < ArrL; i++){
            String input = sc.nextLine();
            String []arr = input.split(" ", 4);
            String name = arr[0];
            String dept = arr[1];
            int salary = Integer.parseInt(arr[2]);
            int yearStart = Integer.parseInt(arr[3]);
            eList.add(new ProFun14Employee(name, dept, salary, yearStart));
        }
        sc.close();
        demo.oldway();
    }
}

class ProFun14Employee {
    String name;
    String dept;
    int salary;
    int yearStart;

    ProFun14Employee(String n, String d, int sal, int yr){
        name = n;
        dept = d;
        salary = sal;
        yearStart = yr;
    }
    public int getYearstart(){
        return yearStart;
    }
    public String toString(){
        return String.format("%s %s(%d) %d", dept, name, yearStart, salary);
    }
}
