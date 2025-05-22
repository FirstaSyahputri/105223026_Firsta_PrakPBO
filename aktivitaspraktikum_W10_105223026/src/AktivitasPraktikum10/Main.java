package AktivitasPraktikum10;

class Animal {
    static void suara(){
        System.out.println("cetak suara");
    }

    public void makan(){
        System.out.println("hewan makan");
    }
}

class Dog extends Animal {
    void makan() {
        System.out.println("anjing makan daging");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal ();
        //a.suara();


        Animal.suara(); //statis (gaperlu buat object dari class animal)
        a.makan();

        Animal b = new Dog();
        b.makan();

    }
}
