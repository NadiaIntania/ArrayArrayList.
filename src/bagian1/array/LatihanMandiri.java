package bagian1.array;

public class LatihanMandiri {
    public static void main(String[] args) {

        // No. 1: Suhu tertinggi dan terendah
        double[] suhu = {30.5, 28.0, 33.2, 27.8, 31.1, 29.4};
        double max = suhu[0], min = suhu[0];
        for (double s : suhu) {
            if (s > max) max = s;
            if (s < min) min = s;
        }
        System.out.println("=== Suhu Harian ===");
        System.out.println("Tertinggi: " + max);
        System.out.println("Terendah : " + min);

        // No. 2: Nama hari dengan lebih dari 5 huruf
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        System.out.println("\n=== Hari dengan lebih dari 5 huruf ===");
        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println(h);
            }
        }

        // No. 3: Hitung bilangan genap
        int[] angka = {4, 8, 15, 16, 23, 42};
        int genap = 0;
        for (int a : angka) {
            if (a % 2 == 0) genap++;
        }
        System.out.println("\n=== Bilangan Genap ===");
        System.out.println("Jumlah genap: " + genap);
    }
}
