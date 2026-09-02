/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author dimsg
 */
public class MainMobil {
    public static void main(String[] args) {

        
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2022, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2023, "Putih");

        System.out.println("MOBIL 1");
        mobil1.displayInfo();
        mobil1.startEngine();

        System.out.println();

        
        System.out.println("MOBIL 2");
        mobil2.displayInfo();
        mobil2.startEngine();

     
        mobil1.ubahWarna("Merah");

        System.out.println();
        System.out.println("SETELAH WARNA DIUBAH");
        mobil1.displayInfo();
    }
}
