public class Coin_650031 {
    public static void main(String[] args) {
        coin  e1 = new coin ();
        e1.setcolor("blue");
        e1.flip();
        System.out.print(e1.toString());
    }
}

class coin {
    String colorHead="red";
    String colorTail="red";
    boolean Head=true;
    
    String getcolor(){
        return toString();
    }
    void setcolor(String color){
        if(Head)colorHead=color;
        else colorTail = color;
    }
    void flip(){
        Head=!Head; 
    }
    public String toString() {
        if (Head) return "coin[color=" + colorHead + "]";
        else  return "coin[color=" + colorTail + "]";
    }
}