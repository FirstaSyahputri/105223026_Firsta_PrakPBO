package SistemSewaKendaraan;

public class Truk extends Kendaraan implements DapatDisewa, Muatan {
    public Truk(String platNomor, String merk, int tahunProduksi) {
        super(platNomor, merk, tahunProduksi);
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return 800000 * hari;
    }

    @Override
    public boolean perluSupir() {
        return true;
    }

    @Override
    public double kapasitasMuatan() {
        return 5000;
    }
}

