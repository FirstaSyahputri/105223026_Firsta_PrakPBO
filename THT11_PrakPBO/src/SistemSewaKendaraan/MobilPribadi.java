package SistemSewaKendaraan;

public class MobilPribadi extends Kendaraan implements DapatDisewa {
    public MobilPribadi(String platNomor, String merk, int tahunProduksi) {
        super(platNomor, merk, tahunProduksi);
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return 300000 * hari;
    }

    @Override
    public boolean perluSupir() {
        return false;
    }
}

