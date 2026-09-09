/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author dimsg
 */
public class MainPekerja {
    public static void main(String[] args) {

        // Membuat objek Pekerja
        Pekerja pekerja = new Pekerja(
                "Dimas Galih Prakoso",
                20,
                "Mahasiswa",
                5000000
        );

        // Menampilkan informasi awal
        System.out.println("=== DATA AWAL PEKERJA ===");
        System.out.println(pekerja);

        // Mengubah nama menggunakan setter
        pekerja.setNama("Dimas Galih");

        // Mengubah gaji menggunakan setter
        pekerja.setGaji(6000000);

        // Menampilkan informasi setelah perubahan
        System.out.println("\n=== DATA SETELAH DIUBAH ===");
        System.out.println(pekerja);

        // Akses langsung atribut pekerjaan
        System.out.println("\n=== AKSES LANGSUNG ===");
        System.out.println("Pekerjaan: " + pekerja.pekerjaan);

        // usia protected masih dapat diakses
        // karena Main berada dalam package yang sama
        System.out.println("Usia: " + pekerja.usia);

        // Baris berikut AKAN ERROR karena nama private:
        System.out.println(pekerja.nama);

        // Baris berikut AKAN ERROR karena gaji private:
        System.out.println(pekerja.gaji);
    }
}
