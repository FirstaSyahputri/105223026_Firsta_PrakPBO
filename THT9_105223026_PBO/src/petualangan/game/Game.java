package petualangan.game;

import petualangan.akun.User;
import java.util.Scanner;

public class Game {
    private User user;
    private Scanner scanner;

    public Game(User user) {
        this.user = user;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean berjalan = true;
        while (berjalan) {
            System.out.print("Pilih aksi (maju/mundur/keluar): ");
            String aksi = scanner.nextLine().toLowerCase();

            switch (aksi) {
                case "maju":
                case "mundur":
                    Permainan.langkah();
                    break;
                case "keluar":
                    System.out.println("Petualangan berakhir. Sampai jumpa, " + user.getUsername() + "!");
                    berjalan = false;
                    break;
                default:
                    System.out.println("Aksi tidak dikenali.");
            }
        }
    }
}