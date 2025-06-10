package SistemSewaKendaraan;

public class Main {
    public static void main(String[] args) {
        MobilPribadi mobil = new MobilPribadi("B 1234 NPZ", "BYD", 2020);
        Bus bus = new Bus("B 5678 FKS", "Alphard", 2018);
        Truk truk = new Truk("B 91011 MT", "Hiace", 2015);

        System.out.println("=== Mobil Pribadi ===");
        mobil.tampilkanInfo();
        System.out.println("Biaya Sewa 2 hari: " + mobil.hitungBiayaSewa(2));
        System.out.println("Perlu Supir: " + mobil.perluSupir());

        System.out.println("\n=== Bus ===");
        bus.tampilkanInfo();
        System.out.println("Biaya Sewa 3 hari: " + bus.hitungBiayaSewa(3));
        System.out.println("Perlu Supir: " + bus.perluSupir());

        System.out.println("\n=== Truk ===");
        truk.tampilkanInfo();
        System.out.println("Biaya Sewa 1 hari: " + truk.hitungBiayaSewa(1));
        System.out.println("Perlu Supir: " + truk.perluSupir());
        System.out.println("Kapasitas Muatan: " + truk.kapasitasMuatan() + " kg");
    }
}

