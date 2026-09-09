///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package praktikum4;
//
///**
// *
// * @author dimsg
// */
//public class Kendaraan {
//        
//    //atribut dengan akses modifier berbeda
//    protected int kecepatanMaks; //bisa diakses package yang sama dan subclass
//    public String jenisMesin; //bisa diakses dari mana saja
//    private String nama; //hanya bisa diakses dalam kelas ini
//    
//    //constructor
//    public Kendaraan(String nama, int kecepatanMaks, String jenisMesin) {
//        this.nama = nama;
//        this.kecepatanMaks = kecepatanMaks;
//        this.jenisMesin = jenisMesin;
//    }
//    //getter and setter nama
//    public String getNama() {
//        return nama;
//    }
//    public void setNama(String nama) {
//        this.nama = nama;
//    }
//    // method public untuk menampilkan informasi kendaraan
//    public void tampilkanInfoKendaraan(){
//        System.out.println("Nama Kendaraan: " + nama);
//        System.out.println("Kecepatan Maksimum: " + kecepatanMaks + "km/h");
//        System.out.println("Jenis Mesin: " + jenisMesin);
//    }
//    public static void main(String[] args){
//        
//    }
//}
//
