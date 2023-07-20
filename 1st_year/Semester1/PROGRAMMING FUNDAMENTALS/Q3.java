import java.util.*;

public class Q3 {
    static ArrayList<ProFun14Employee> eList;
    
    Q3(){
        eList = new ArrayList<>();
    }

    void oldway() {
        int sumSal = 0;
        for(int i = 0; i < eList.size(); i++){
            ProFun14Employee curr = eList.get(i);
            sumSal += curr.salary;
        }         
        System.out.println(sumSal);
    }

    public static void main(String[] args) {
        Q3 demo = new Q3(); 
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
    int getSalary(){
        return salary;
    }
    public String toString(){
        return String.format("%s %s (%d) %d", dept, name, yearStart, salary);
    }
}