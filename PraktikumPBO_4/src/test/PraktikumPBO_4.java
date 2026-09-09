/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author dimsg
 */
public class PraktikumPBO_4 {

        Kendaraan mobil = new Kendaraan("Toyota", "Avanza", 2020);
        
        //menampilkan data awal
        System.out.println("Merek: " + mobil.getMerek());
        System.out.println("Model: " + mobil.getModel());
        System.out.println("Tahun: " + mobil.getTahun());
        
        //mengubah data
        mobil.setModel("Innova");
        mobil.setTahun(2021);
        
        //menampilkan data setelah perubahan
        System.out.println("Model baru: " + mobil.getModel());
        System.out.println("Tahun baru: " + mobil.getTahun());
    }
}
