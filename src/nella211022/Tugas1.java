/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nella211022;

/**
 *
 * @author Asus
 */
import java.io.*;
public class Tugas1 {
         public static void main( String[] args ){ 
 
        BufferedReader dataIn = new BufferedReader( 
            new InputStreamReader( System.in) ); 
            
        int nilai1 = 0;
        int nilai2 = 0;
        int nilai3 = 0;
        int rata = 0;
        
        

        try{
            System.out.print("Masukkan nilai ujian yang ke-1:");
            nilai1 = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan nilai ujian yang ke-2:");
            nilai2 = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan nilai ujian yang ke-3 :");
            nilai3 = Integer.parseInt(dataIn.readLine());
            
            rata = (nilai1 + nilai2 + nilai3) / 3 ;
            
           
            
             
        }catch( IOException e ){ 
            System.out.println("Error!"); 
        } 
            System.out.println("Rata - rata nilai ujian = " + rata); 
            
            if( rata >= 60 ){ 
                System.out.println( ":-)" ); 
            } 
             else{
                System.out.println(":-(" ); 
            }       
    }
    
}
