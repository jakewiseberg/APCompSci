/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConditionalLabs.Employee;

/**
 *
 * @author jakew
 */

public class Employee {
    String name;
    double salary;
    int years;
    int dependents;
    
    public Employee(String name, double salary, int years, int dependents) {
        this.name = name;
        this.salary = salary;
        this.years = years;
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public int getYearsEmployed() {
        return years;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setYearsEmployed(int years) {
        this.years = years;
    }
    
    public boolean isElegible() {
        return years>=3;
    }
    public void giveRaise(int percent) {
        salary+=(salary*percent);
    }
    public double netSalary() {
        double tax;
        if (salary<50000) tax = salary*.15;
        else if (salary<100000) tax = salary*.2;
        else tax = salary*.24;
        
        double dependentsMoney = dependents*1000;
        
        return salary - dependentsMoney - tax;
    }
    
    @Override
    public String toString() {
        String elegible;
        if (isElegible()) elegible = "";
        else elegible = "not yet ";
        
        double tax;
        if (salary<50000) tax = 1-.15;
        else if (salary<100000) tax = 1-.2;
        else tax = 1-.24;
        
        return name + " is making $" + salary + " per year, and has been working for " + years + " years; therefore, he is "
                + elegible + "elegible for a raise.  He has " + dependents + " dependents, so his/her net salary is $" + netSalary() +
                ".  [(" + salary + "-" + dependents + ")*" + tax + "]";
    }
    
}
