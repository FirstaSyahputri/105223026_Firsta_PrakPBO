public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Angel");

        Dog dog = new Dog("2020-02-20");
        Cat cat = new Cat("2021-01-21");

        owner.addAnimal(dog);
        owner.addAnimal(cat);

        owner.showAnimals();
    }
}
