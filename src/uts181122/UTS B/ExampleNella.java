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
public class ExampleNella {
   public static void main(String[] args){
        PeminjamanNella pinjam1 = new PeminjamanNella();
        
        pinjam1.setKodepinjam("01");
        pinjam1.setTanggal("171122");
        pinjam1.setKodenasabah("2061");
        pinjam1.setNama("Nella");
        pinjam1.setJumlah(200000);
        pinjam1.setLama(1);
        
        System.out.println("Kode Peminjaman: "+pinjam1.getKodepinjam());
        System.out.println("Tanggal: "+pinjam1.getTanggal());
        System.out.println("Kode Nasabah: "+pinjam1.getKodenasabah());
        System.out.println("Nama Nasabah: "+pinjam1.getNama());
        System.out.println("Jumlah Pinjaman: "+pinjam1.getJumlah());
        System.out.println("Lama Pinjaman (dalam bulan): "+pinjam1.getLama());
        System.out.println("Bunga : "+pinjam1.getBunga());
        System.out.println("Angsuran Pokok : "+pinjam1.getAngsuranpokok());
        System.out.println("Angsuran Perbulan : "+pinjam1.getAngsuranperbulan());
        System.out.println("Total Hutang : "+pinjam1.getTotalHutang());
   }
}
