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
public class Manager extends Employee {
    
    private double bonus;

    public Manager(String name, String addres, double salary, double bonus) {
        super(name, addres, salary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }  

    @Override
    public double getSalary() {
        return super.getSalary() + getBonus();
    }
    
}
