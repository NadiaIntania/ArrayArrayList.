//Nama : Nadia Intania
//NPM : 2510010500
package tugas;

public class MainTugas {
    public static void main(String[] args) {

        String[] mataKuliah = {
            "Pemrograman Berbasis Objek 1",
            "Struktur Data",
            "Basis Data"
        };
        System.out.println("== Daftar Mata Kuliah ==");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        KelasKuliah kelas = new KelasKuliah();
        kelas.tambahMahasiswa(new Mahasiswa("Andi Pratama",  "2301001", 85.0));
        kelas.tambahMahasiswa(new Mahasiswa("Budi Santoso",  "2301002", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra Dewi",    "2301003", 78.5));
        kelas.tambahMahasiswa(new Mahasiswa("Doni Saputra",  "2301004", 42.0));
        kelas.tambahMahasiswa(new Mahasiswa("Eva Rahayu",    "2301005", 91.0));

        kelas.tampilkanSemua();
        System.out.println();

        System.out.printf("Rata-rata nilai   : %.2f%n", kelas.hitungRataRata());
        System.out.println("Jumlah lulus      : " + kelas.jumlahLulus());
        System.out.println();

        System.out.println("=== Menambah mahasiswa baru ===");
        kelas.tambahMahasiswa(new Mahasiswa("Fajar Nugroho", "2301006", 67.0));
        kelas.tampilkanSemua();
        System.out.println();
        System.out.printf("Rata-rata nilai   : %.2f%n", kelas.hitungRataRata());
        System.out.println("Jumlah lulus      : " + kelas.jumlahLulus());
    }
}

