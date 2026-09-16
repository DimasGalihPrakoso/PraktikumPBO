/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author dimsg
 */
// kelas turunan Mobil
public class Mobil extends KendaraanDarat {
   int jumlahPintu;

    public void tampilkanInfoMobil() {
        tampilkanInfo();
        tampilkanRoda();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
