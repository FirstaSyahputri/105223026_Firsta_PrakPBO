public class Main {
    public static void main(String[] args) {
        Transportasi[] daftar = new Transportasi[3];

        daftar[0] = new Bus("Bus", 30, "Bandung");
        daftar[1] = new Kereta("Kereta", 100, "Surabaya");
        daftar[2] = new Pesawat("Pesawat", 180, "Medan");

        for (Transportasi t : daftar) {
            System.out.println(t.getNama() + " ke " + t.getTujuan() + " - Harga tiket (default) : " + t.hitungHargaTiket());

            String kelasLayanan = getKelasLayanan(t);

            if (!kelasLayanan.isEmpty()) {
                System.out.println(t.getNama() + " ke " + t.getTujuan() + " - Harga tiket (" + kelasLayanan + ") : " + t.hitungHargaTiket(kelasLayanan));
            }

            System.out.println();
        }
    }

    private static String getKelasLayanan(Transportasi t) {
        switch (t.getClass().getSimpleName()) {
            case "Bus":
                return "Bisnis";
            case "Kereta":
                return "VIP";
            case "Pesawat":
                return "Ekonomi";
            default:
                return "";
        }
    }
}
