/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author dimsg
 */
public class MainHierarki {
        public static void main(String[] args) {

        Mobil mobil = new Mobil();
        mobil.nama = "Toyota";
        mobil.jumlahRoda = 4;
        mobil.jumlahPintu = 4;

        mobil.tampilkanInfoMobil();

        System.out.println();

        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Beat";
        motor.jumlahRoda = 2;
        motor.jenisMesin = "2-tak";

        motor.tampilkanInfoMotor();
    }
}
