/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nella071022;

/**
 *
 * @author Asus
 */
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

            String nama;
            int jum, gol, jkerja, jlembur, gapok, glembur, tun_pengabdian;
            double pajakgapok, pajaklembur, totpajak,gajibersih;

            System.out.println("PROGRAM MENGHITUNG GAJI KARYAWAN");
            System.out.println("-------------------------------------------------");
            System.out.println("##  Program Java Menghitung Gaji Karyawan ##");
            System.out.println("============================================");
            System.out.println();
            System.out.println(" gol\t\tgaji pokok\t\tgaji perjam");  
            System.out.println(" 1A\t\t500000\t\t\t2000");
            System.out.println(" 2A\t\t600000\t\t\t3000");
            System.out.println(" 1B\t\t700000\t\t\t4000");
            System.out.println(" 2B\t\t800000\t\t\t5000");
            System.out.println(" 3B\t\t900000\t\t\t6000");
            
            System.out.print("Masukan Golongan : ");
            gol=input.nextInt();
            System.out.print("Masukan Jam Kerja : ");
            jkerja=input.nextInt();

            switch(gol){
                case 1 : 
                        gapok=1486500;
                        tun_pengabdian=250000;
                        break;
                case 2 :
                        gapok=1926000;
                        tun_pengabdian=300000;
                        break;
                case 3 :
                        gapok=2456700;
                        tun_pengabdian=350000;
                        break;
                case 4 :
                        gapok=2899500;
                        tun_pengabdian=400000;
                        break;
                default :
                        gapok=0;
                        tun_pengabdian=0;
            }

            if (jkerja>173){
                jlembur=jkerja-173;	
            }else{
                 jlembur=0;
            }

            formatRp.setCurrencySymbol("Rp. ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');
            kursIndonesia.setDecimalFormatSymbols(formatRp);

            glembur=jlembur*20000;
            pajakgapok=0.05*gapok;
            pajaklembur=0.05*glembur;
            totpajak=pajakgapok+pajaklembur;
            gajibersih=((gapok+tun_pengabdian+glembur)-totpajak);

            System.out.println("Nama                 : "+nama);
            System.out.println("Gaji Pokok           : "+ kursIndonesia.format(gapok));
            System.out.println("Gaji Lembur          : "+kursIndonesia.format(glembur));
            System.out.println("Pajak Gaji Pokok     : "+kursIndonesia.format(pajakgapok));
            System.out.println("Pajak Lembur         : "+kursIndonesia.format(pajaklembur));
            System.out.println("Total Pajak          : "+kursIndonesia.format(totpajak));
            System.out.println("Tunjangan Pengabdian : "+kursIndonesia.format(tun_pengabdian));
            System.out.println("Gaji Diterima        : "+kursIndonesia.format(gajibersih));
  }  
}

