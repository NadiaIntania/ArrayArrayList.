package bagian3.perpustakaan;

import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> koleksi = new ArrayList<>();

    // Menambah satu buku ke koleksi
    public void tambahBuku(Buku buku) {
        koleksi.add(buku);
    }

    // Menampilkan seluruh koleksi
    public void tampilkanKoleksi() {
        System.out.println("== Koleksi Perpustakaan ==");
        for (int i = 0; i < koleksi.size(); i++) {
            Buku b = koleksi.get(i);
            System.out.println((i + 1) + ". " + b.info());
        }
}

    // Meminjam buku berdasarkan judul
    public void pinjamBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equals(judul)) {
                if (b.isDipinjam()) {
                    System.out.println(judul + " sedang dipinjam.");
                } else {
                    b.setDipinjam(true);
                    System.out.println(judul + " berhasil dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku " + judul + " tidak ditemukan.");
    }

    // Mengembalikan buku berdasarkan judul (Latihan 3.4 No. 1)
    public void kembalikanBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equals(judul)) {
                b.setDipinjam(false);
                System.out.println(judul + " telah dikembalikan.");
                return;
            }
        }
        System.out.println("Buku " + judul + " tidak ditemukan.");
    }

    // Menghitung jumlah buku yang masih tersedia
    public int jumlahTersedia() {
        int jumlah = 0;
        for (Buku b : koleksi) {
            if (!b.isDipinjam()) jumlah++;
        }
        return jumlah;
    }

    // Mencari buku berdasarkan penulis (Latihan 3.4 No. 3)
    public void cariPenulis(String penulis) {
        System.out.println("== Buku karya " + penulis + " ==");
        boolean ditemukan = false;
        for (Buku b : koleksi) {
            if (b.getPenulis().equalsIgnoreCase(penulis)) {
                System.out.println("- " + b.info());
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada buku dari penulis tersebut.");
        }
    }
}
