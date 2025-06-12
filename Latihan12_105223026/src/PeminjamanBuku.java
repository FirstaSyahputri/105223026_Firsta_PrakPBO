import java.util.Scanner;

public class PeminjamanBuku {
    static String[] daftarBuku = {"B001", "B002", "B003"};

    public static void validasiIDBuku(String idBuku) throws PeminjamanException {
        boolean valid = false;
        for(String id : daftarBuku) {
            if(id.equalsIgnoreCase(idBuku)) {
                valid = true;
                break;
            }
        }
        if(!valid) {
            throw new PeminjamanException("ID Buku tidak valid.");
        }
    }

    public static void validasiLamaPinjam(int lama) throws PeminjamanException {
        if(lama < 1 || lama > 14) {
            throw new PeminjamanException("Lama peminjaman harus antara 1-14 hari.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan nama anda: ");
            String nama = input.nextLine();

            System.out.print("Masukkan ID Buku: ");
            String idBuku = input.nextLine();
            validasiIDBuku(idBuku);

            System.out.print("Masukkan lama peminjaman (hari): ");
            int lamaPinjam = input.nextInt();
            validasiLamaPinjam(lamaPinjam); 

            System.out.println("Peminjaman berhasil!"); 
        } catch (PeminjamanException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input: " + e.getMessage());
        } finally {
            input.close();
            System.out.println("Program selesai.");
        }
    }
}
