/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author dimsg
 */

public class Pekerja extends Manusia {

    public double gaji;

    // Constructor
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }

    // Getter gaji
    public double getGaji() {
        return gaji;
    }

    // Setter gaji
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Menampilkan data
    @Override
    public String toString() {
        return "Nama: " + getNama()
                + "\nUsia: " + usia
                + "\nPekerjaan: " + pekerjaan
                + "\nGaji: Rp" + gaji;
    }
}