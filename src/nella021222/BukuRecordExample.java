/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nella021222;

/**
 *
 * @author Asus
 */
public class BukuRecordExample {
    public static void main(String[] args){

        bukualamat buku1 = new bukualamat("Nella", "Tandun", "0851569895939", "nellafitrian@gmail.com");
        System.out.println("Nama                    :"+buku1.getName());
        System.out.println("Alamat                  :"+buku1.getAddress());
        System.out.println("No.Telpon               :"+buku1.getNotelp());
        System.out.println("Alamat Email            :"+buku1.getEmail());
    }
}
