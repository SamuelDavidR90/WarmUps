
package com.mycompany.oop;


public class OOP {

    public static void main(String[] args) {
        Employee emp0 = new Employee();
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        
        //introducing employee data
        emp1.ReadEmployeeData();
        emp2.ReadEmployeeData();
        emp3.ReadEmployeeData();
        
        System.out.println("-----------------------------");
        System.out.println("Id registered: " + emp1.getId());
        System.out.println("Name registered: " + emp1.getName());
        System.out.println("Lastname registered: " + emp1.getLastname());
        System.out.println("AKA: " + emp1.getAka());
        System.out.println("-----------------------------");
        
        System.out.println("-----------------------------");
        System.out.println("Id registered: " + emp2.getId());
        System.out.println("Name registered: " + emp2.getName());
        System.out.println("Lastname registered: " + emp2.getLastname());
        System.out.println("AKA: " + emp2.getAka());
        System.out.println("-----------------------------");
        
        System.out.println("-----------------------------");
        System.out.println("Id registered: " + emp3.getId());
        System.out.println("Name registered: " + emp3.getName());
        System.out.println("Lastname registered: " + emp3.getLastname());
        System.out.println("AKA: " + emp3.getAka());
        System.out.println("-----------------------------");
  
        
        
        
        
    }
}
