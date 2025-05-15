public class Driver {
    private String name;
    private License license;
    private Vehicle vehicle;

    public Driver(String name, String licenseNumber, String validUntil, Vehicle vehicle) {
        this.name = name;
        this.license = new License(licenseNumber, validUntil);
        this.vehicle = vehicle;
    }

    public void showDriverInfo() {
        System.out.println("==========================");
        System.out.println("Nama Pengemudi : " + name);

        if (vehicle instanceof Car) {
            System.out.println("Jenis Kendaraan : Mobil");
        } else if (vehicle instanceof Motorcycle) {
            System.out.println("Jenis Kendaraan : Motor");
        } else {
            System.out.println("Jenis Kendaraan : Tidak Diketahui");
        }

        System.out.print("Suara Mesin : ");
        vehicle.startEngine();
        System.out.println("Nomor Lisensi : " + license.getLicenseNumber());
        System.out.println("Berlaku Hingga : " + license.getValidUntil());
        System.out.println("===========================");
    }
}
