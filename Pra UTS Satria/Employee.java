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
class Employee {
    private String name;
    private String addres;
    private double salary;

    public Employee(String name, String addres, double salary) {
        this.name = name;
        this.addres = addres;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}