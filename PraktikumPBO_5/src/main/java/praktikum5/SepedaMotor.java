/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author dimsg
 */
class SepedaMotor extends KendaraanDarat {
    String jenisMesin;

    public void tampilkanInfoMotor() {
        tampilkanInfo();
        tampilkanRoda();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}
