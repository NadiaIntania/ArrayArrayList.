package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();

        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));

        perpus.tampilkanKoleksi();
        System.out.println();

        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia"); // coba pinjam kedua kali
        System.out.println();

        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();

        // Latihan 3.4 No. 1: kembalikan buku
        perpus.kembalikanBuku("Bumi Manusia");
        System.out.println();

        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();

        // Latihan 3.4 No. 3: cari berdasarkan penulis
        perpus.cariPenulis("Andrea Hirata");
    }
}
