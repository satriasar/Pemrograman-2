/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.java.pkg2.pra.uts.pkg3;

/**
 *
 * @author acer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        
        System.out.println("**************************************************** ");
        
        System.out.println("                Satria Nasution                      ");
        
        System.out.println("**************************************************** ");
        
        Employee boss = new Manager("Satria", "Burangrang", 1200000, 500000);
        Employee Staff_Pertama = new Staff("Nasution", "Panghegar", 200000);
        Employee Staff_Kedua = new Staff("Satria Nasution", "Parakansaat", 100000);
        
        System.out.println("Nama Manager: " + boss.getName());
        System.out.println("Alamat Manager: " + boss.getAddres());
        System.out.println("Salary Manager adalah : Rp. " + boss.getSalary());
        
        System.out.println("\nNama Staff: " + Staff_Pertama.getName());
        System.out.println("Alamat Staff: " + Staff_Pertama.getAddres());
        System.out.println("Salary Staff adalah : Rp. " + Staff_Pertama.getSalary());
        
        System.out.println("\nNama Staff: " + Staff_Kedua.getName());
        System.out.println("Alamat Staffr: " + Staff_Kedua.getAddres());
        System.out.println("Salary Staff adalah : Rp. " + Staff_Kedua.getSalary());
        
 
    }
    
}
