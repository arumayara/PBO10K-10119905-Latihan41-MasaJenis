/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan41.MasaJenis;

/**
 *
 * @author 
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program menghitung Masa Jenis Kubus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kubus objKubus = new Kubus();
        System.out.println("=== Massa Jenis Kubus ===");
        objKubus.setSisi(5);
        System.out.println("Sisi : "+ objKubus.getSisi());
        objKubus.setMassa(250);
        System.out.println("Massa : "+ objKubus.getMassa());
        System.out.println();
        System.out.println("=== Hasil Perhitungan ===");
        System.out.println("Volume : "+ objKubus.hitungVolume(objKubus.getSisi()));
        System.out.println("Massa Jenis : "+ objKubus.hitungMassaJenis(objKubus.getSisi(),objKubus.getMassa()));
                       
    }
    
}
