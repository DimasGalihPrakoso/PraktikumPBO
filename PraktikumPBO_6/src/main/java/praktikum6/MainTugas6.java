/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author dimsg
 */
public class MainTugas6 {
      public static void main(String[] args) {

        Buku buku = new Buku("Pemrograman Java", 100000);
        Elektronik elektronik = new Elektronik("Mouse Wireless", 150000);
        Pakaian pakaian = new Pakaian("Kaos", 80000);

        KeranjangBelanja keranjang = new KeranjangBelanja();

        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        keranjang.tampilkanKeranjang();
    }
}
