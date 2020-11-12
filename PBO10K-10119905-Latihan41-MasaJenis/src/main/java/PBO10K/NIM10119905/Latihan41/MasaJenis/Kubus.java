/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan41.MasaJenis;

/**
 *
 * @author aruma
 */
public class Kubus {
    private int sisi ;
    private int massa ;
    int volume;
    
    public int getSisi(){
        return sisi ;
    }
    
    public void setSisi(int sisi){
        this.sisi=sisi;
    }
    
    public int getMassa(){
        return massa;     
    }
    
    public void setMassa(int massa){
        this.massa=massa;
    }
    
    public int hitungVolume(int parSisi){
        return sisi*sisi*sisi;
    }
    
    public int hitungMassaJenis(int parMassa , int parVolume){
        return massa/(sisi*sisi*sisi);
    }
    
}
