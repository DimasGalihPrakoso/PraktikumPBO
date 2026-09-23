/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author dimsg
 */
import java.util.ArrayList;

public class KeranjangBelanja {

    ArrayList<Produk> daftarProduk = new ArrayList<>();

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public double hitungTotal() {
        double total = 0;

        for (Produk produk : daftarProduk) {
            total += produk.hargaSetelahDiskon();
        }

        return total;
    }

    public void tampilkanKeranjang() {
        System.out.println("===== KERANJANG BELANJA =====");

        for (Produk produk : daftarProduk) {
            produk.tampilkanInfo();
            System.out.println("-----------------------------");
        }

        System.out.println("Total harga setelah diskon: Rp" + hitungTotal());
    }
}