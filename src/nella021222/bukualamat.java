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
public class bukualamat {
    private String name; 
    private String address;
    private String notelp;
    private String email;
    
    public bukualamat(){
    }
    
    public bukualamat (String name, String address, String notelp, String email){
        this.name = name;
        this.address = address;
        this.notelp = notelp;
        this.email = email;
    }
    
    public String getName(){
        return name;
    }
    
     public String getAddress(){
        return address;
    }
     
    public String getNotelp(){
        return notelp;
    }
    
     public String getEmail(){
        return email;
     }

}
