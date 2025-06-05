package abstrak;

public class Main {
    
    public static void main (String[] args){
        Kucing k = new Kucing ("Kucing");
        Anjing a = new Anjing ("dog");

        k.makan();
        k.bersuara();

        a.makan();
        a.bersuara();
    }
}
