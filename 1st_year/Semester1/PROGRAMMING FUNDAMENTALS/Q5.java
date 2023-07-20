import java.util.*;

public class Q5 {
    static ArrayList<ProFun14Employee> eList;
    
    Q5(){
        eList = new ArrayList<>();
    }

    void oldway(String deptName) {
        ArrayList<ProFun14Employee> carreerinfo = new ArrayList<>();
        for(int i = 0; i < eList.size(); i++){
            ProFun14Employee curr = eList.get(i);
            if (curr.dept.equals(deptName)){
                carreerinfo.add(curr);
            }
        }
        System.out.println(carreerinfo);
    }

    public static void main(String[] args) {
        Q5 demo = new Q5(); 
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
        
        String career = sc.nextLine();
        sc.close();
        demo.oldway(career);
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