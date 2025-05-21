package petualangan.main;

import petualangan.akun.User;
import petualangan.game.Game;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Game Petualangan ===");
        System.out.print("Buat Username : ");
        String username = input.nextLine();
        System.out.print("Buat Password : ");
        String password = input.nextLine();

        User user = new User(username, password);
        Game game = new Game(user);

        System.out.println("\nSilakan Login :");
        System.out.print("Username : ");
        String loginUser = input.nextLine();
        System.out.print("Password : ");
        String loginPass = input.nextLine();

        if (user.login(loginUser, loginPass)) {
            System.out.println("Login berhasil\n");
            game.start();
        } else {
            System.out.println("Login gagal. Username atau password salah.");
        }

        input.close();
    }
}