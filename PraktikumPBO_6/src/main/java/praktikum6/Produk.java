/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author dimsg
 */
public class Produk {
    String nama;
    double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public double hitungDiskon() {
        return 0;
    }

    public double hargaSetelahDiskon() {
        return harga - (harga * hitungDiskon());
    }

    public void tampilkanInfo() {
        System.out.println("Nama  : " + nama);
        System.out.println("Harga : Rp" + harga);
        System.out.println("Diskon: " + (hitungDiskon() * 100) + "%");
        System.out.println("Harga setelah diskon: Rp" + hargaSetelahDiskon());
    }
}
