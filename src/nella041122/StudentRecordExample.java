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
public class StudentRecordExample {
    public static void main(String[] args) {
        StudentRecord student1 = new StudentRecord();
        //
        student1.setName("Nella");
        student1.setAddress("Tandun");
        student1.setAge(19);
        student1.setMathGrade(70);
        student1.setEnglishGrade(80);
        student1.setScienceGrade(90);
        //
        System.out.println("Nama        :"+student1.getName());
        System.out.println("Alamat      :"+student1.getAddress());
        System.out.println("Umur        :"+student1.getAge());
        System.out.println("Matematika  :"+student1.getMathGrade());
        System.out.println("English     :"+student1.getEnglishGrade());
        System.out.println("Pengetahuan :"+student1.getScienceGrade());
        System.out.println("Rata-rata   :"+student1.getaverage());
        
        StudentRecord student2 = new StudentRecord("Nella", "Tandun");
         System.out.println("Nama        :"+student2.getName());
        System.out.println("Alamat      :"+student2.getAddress());
    }
}
