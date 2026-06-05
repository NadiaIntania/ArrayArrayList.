package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiri2 {
    public static void main(String[] args) {

        // === No. 1: Daftar belanja ===
        ArrayList<String> belanja = new ArrayList<>();
        belanja.add("Beras");
        belanja.add("Minyak");
        belanja.add("Gula");
        belanja.add("Telor");
        System.out.println("=== Daftar Belanja ===");
        System.out.println("Sebelum hapus: " + belanja);
        belanja.remove(1); // hapus item ke-2 (indeks 1)
        System.out.println("Sesudah hapus: " + belanja);
        System.out.println("Jumlah akhir : " + belanja.size());

        // === No. 2: Nilai terbesar ===
        ArrayList<Integer> nilai = new ArrayList<>();
        nilai.add(70);
        nilai.add(95);
        nilai.add(60);
        nilai.add(88);
        nilai.add(75);
        int max = nilai.get(0);
        for (int n : nilai) {
            if (n > max) max = n;
        }
        System.out.println("\n=== Nilai Terbesar ===");
        System.out.println("Data    : " + nilai);
        System.out.println("Terbesar: " + max);

        // === No. 3: Nama berawalan huruf A ===
        ArrayList<String> nama = new ArrayList<>();
        String[] data = {"Andi", "Budi", "Ayu", "Citra", "Adit", "Doni"};
        for (String d : data) nama.add(d);
        System.out.println("\n=== Nama Berawalan A ===");
        for (String n : nama) {
            if (n.startsWith("A")) System.out.println(n);
        }
    }
}
