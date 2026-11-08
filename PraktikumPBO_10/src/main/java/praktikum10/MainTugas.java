/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author dimsg
 */

public class MainTugas {
    public static void main(String[] args) {

        // Objek Elektronik
        Pembayaran elektronik = new Elektronik();
        double pajakElektronik = elektronik.hitungPajak(2000000);

        // Objek Makanan
        Pembayaran makanan = new Makanan();
        double pajakMakanan = makanan.hitungPajak(50000);

        // Menampilkan hasil
        System.out.println("Pajak Elektronik: Rp" + pajakElektronik);
        System.out.println("Pajak Makanan: Rp" + pajakMakanan);
    }
}