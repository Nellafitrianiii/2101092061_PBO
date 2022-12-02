/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nella041122;

/**
 *
 * @author Asus
 */
public class StudentRecord {
    private String name; 
    private String address; 
    private int age; 
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade; 
    private double average; 
    
    private static int studentCount;

    public StudentRecord(){ 
        
    }
    
    
    public StudentRecord(String temp){
        this.name = temp;
    }
    
    public StudentRecord(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    public StudentRecord(double mGrade, double eGrade,double sGrade){
        mathGrade=mGrade;
        englishGrade=eGrade;
        scienceGrade=sGrade;
    }
    
  
    public String getName(){ 
     return name; 
    } 
    
    public void setName(String temp){
        name = temp;
    }
    
    public String getAddress(){ 
     return address; 
    } 
    public void setAddress(String address){
        this.address = address;
    }
    //age
    public int getAge() {
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    //mathGrade
    public double getMathGrade() {
        return mathGrade;
    }
    
    public void setMathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }
    
    //englishGrade
    public double getEnglishGrade() {
        return englishGrade;
    }
    public void setEnglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }
    public double getScienceGrade() {
        return scienceGrade;
    }
    
    public void setScienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    
    public double getaverage(){ 
        average = (mathGrade+englishGrade+scienceGrade)/3;
        return average; 
    }
   public static int getstudentCount(){
       return studentCount;
   }
}
