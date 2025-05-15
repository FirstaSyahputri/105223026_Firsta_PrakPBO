public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        Driver driver1 = new Driver("Akbar", "12345", "2026-12-31", car);
        Driver driver2 = new Driver("Boby", "67891", "2025-11-15", motorcycle);

        driver1.showDriverInfo();
        driver2.showDriverInfo();
    }
}
