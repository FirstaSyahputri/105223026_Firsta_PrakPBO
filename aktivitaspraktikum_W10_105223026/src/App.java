class Animal {
    public void suara(){
        System.out.println("cetak suara");
    }

    public void makan(String lauk){
        System.out.println("hewan makan" + lauk);
    }
}

class Dog extends Animal {
    @Override
    public void suara(){
        System.out.println("guk guk guk");
    }

    public void makan(String lauk, String minuman){
        System.out.println("hewan makan" + lauk + " dan minum " + minuman);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Animal a = new Animal ();
        a.suara();

        Animal d = new Dog();
        d.suara();
        d.makan( " ayam goreng"); //method dari parent
       
        Dog anjing = new Dog();
        anjing.makan(" tulang", "air");
    }
}
