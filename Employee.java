
package com.mycompany.oop;
import java.util.Scanner;

public class Employee {
    int id;
    String name;
    String lastname;
    String aka;
    
    //keybard scanning 
    Scanner keyboardInt = new Scanner(System.in);
    Scanner keyboardString = new Scanner(System.in);
    
    public Employee(){
        
    }
    
    public void ReadEmployeeData(){
        System.out.println("Please write your id number: ");
        id = keyboardInt.nextInt();
        System.out.println("Please write your name: ");
        name = keyboardString.nextLine();
        System.out.println("Please write your lastname: ");
        lastname = keyboardString.nextLine();
        System.out.println("Also known as: ");
        aka = keyboardString.nextLine();
    }
    
    public void Employee(int id, String name, String lastname, String aka){
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.aka = aka;
    }
    
     //getters and setters
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getLastname(){
        return lastname;
    }
    
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    
    public String getAka(){
        return aka;
    }
    
    public void setAka(String aka){
        this.aka = aka;
    }
    

}
