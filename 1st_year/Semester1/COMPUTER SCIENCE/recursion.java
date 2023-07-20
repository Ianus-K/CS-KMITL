import java.util.*;

public class recursion {
    String [] arr;
    ArrayList<String> ans;
    recursion() {
        String [] obj = {"c","b","a"};
        arr = obj;
        ans = new ArrayList<String>();
    }
    public static void main(String [] args) {
        recursion b = new recursion();
        b.recurse(0,"");
        for (String str: b.ans) {
            System.out.print("\"" +str + "\", ");
        }
        System.out.println("bye");
    }
    void recurse(int pos, String tmp) {
        if (pos == arr.length) {
            ans.add(tmp);
            return;
        }
        recurse(pos + 1, tmp);
        tmp = tmp.concat(arr[pos]);
        recurse(pos + 1, tmp);
    }
}
