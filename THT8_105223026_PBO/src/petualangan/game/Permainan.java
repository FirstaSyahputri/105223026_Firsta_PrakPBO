package petualangan.game;

public class Permainan {
    private static int langkahKe = 0;

    public static void langkah() {
        int pilihan = langkahKe % 4;

        switch (pilihan) {
            case 0:
                System.out.println("Kamu menemukan kunci misterius");
                break;
            case 1:
                System.out.println("Kamu bertemu makhluk asing dan melarikan diri");
                break;
            case 2:
                System.out.println("Tanah tiba-tiba runtuh, kamu berhasil selamat");
                break;
            case 3:
                System.out.println("Perjalanan sepi, tidak ada yang terjadi");
                break;
        }

        langkahKe++;
        System.out.println();
    }
}
