import java.util.ArrayList;

public class Owner {
    private String name;
    private ArrayList<Animal> animals;

    public Owner(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAnimals() {
    System.out.println("========================");
    System.out.println("DATA PEMILIK & HEWAN");
    System.out.println("========================");
    System.out.println("Nama Pemilik : " + name);
    System.out.println();

    for (Animal animal : animals) {
        System.out.println("-----------------------------");
        if (animal instanceof Dog) {
            System.out.println("Jenis Hewan : Anjing");
            System.out.print("Suara : ");
            animal.makeSound();
        } else if (animal instanceof Cat) {
            System.out.println("Jenis Hewan : Kucing");
            System.out.print("Suara : ");
            animal.makeSound();
        }

        System.out.println("Tanggal Rekam  : " + animal.getHealthRecord().getRecordDate());
    }
    System.out.println("---------------------------------");
    }
}
