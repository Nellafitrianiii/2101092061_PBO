/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts181122;

/**
 *
 * @author Asus
 */
public class PeminjamanNella {
    private String kodepinjam; 
    private String tanggal; 
    private String kodenasabah; 
    private String nama; 
    private int jumlah; 
    private int lama;
    
    private double bunga;
    private double angsuranpokok;
    private double angsuranbulan;
    private double hutang;
    
    private static int studentCount;
    
    public String getKodepinjam(){
        return kodepinjam;
    }
    
    public void setKodepinjam(String kodepinjam){
        this.kodepinjam = kodepinjam;
    }
    
    public String getTanggal(){
        return tanggal;
    }
    
    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }
    
    public String getKodenasabah(){
        return kodenasabah;
    }
    
    public void setKodenasabah(String kodenasabah){
        this.kodenasabah = kodenasabah;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getJumlah(){
        return jumlah;
    }
    
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    
    public int getLama(){
        return lama;
    }
    
    public void setLama(int lama){
        this.lama = lama;
    }
    
    public double getAngsuranpokok(){
        angsuranpokok = jumlah/lama;
        return angsuranpokok;
    }
    
    public double getBunga(){
        bunga= 0.12 * jumlah;
        return bunga;
    }
    
    public double getAngsuranperbulan(){
        
        angsuranbulan=bunga+angsuranpokok;
        return angsuranbulan;
    }
    
     public double getTotalHutang(){
        hutang = jumlah +bunga;
        return hutang;
    }
 
     public static int getStudentCount(){
        return studentCount;
     }
}
