
package poo;


public class POO {

    public static void main(String[] args) {
        Alumno alumnazo1 = new Alumno(1045690979, "Samuel", "Rudas");
        Alumno alumnazo2 = new Alumno(369, "Nikolas", "Tesla");
        Alumno alumnazo3 = new Alumno();
        Alumno alumnazo4 = new Alumno(44444, "Corrigeme", "Careverga");
        
        
        System.out.println("----Primero-----");
        System.out.println("El numero de identificacion del alumno numero 1 es: " + alumnazo1.getId());
        System.out.println("Su nombre es " + alumnazo1.getNombre());
        System.out.println("Su apellido es " + alumnazo1.getApellido());
        System.out.println("-------------------");
        
        System.out.println("----Segundo-----");
        System.out.println("El numero de identificacion del alumno numero 2 es: " + alumnazo2.getId());
        System.out.println("Su nombre es " + alumnazo2.getNombre());
        System.out.println("Su apellido es " + alumnazo2.getApellido());
        System.out.println("-------------------");
        //colocar datos con seters
        
        alumnazo3.setId(777);
        alumnazo3.setNombre("Yazhid");
        alumnazo3.setApellido("Krevkadskin");
 
        System.out.println("----Tercero-----");
        System.out.println("El numero de identificacion del alumno numero 3 es: " + alumnazo3.getId());
        System.out.println("Su nombre es " + alumnazo3.getNombre());
        System.out.println("Su apellido es " + alumnazo3.getApellido());
        System.out.println("-------------------");
        
        //corregir ultimo alumno 
        
        alumnazo4.setId(1045666786);
        alumnazo4.setNombre("Josue");
        alumnazo4.setApellido("Sanchez");
 
        System.out.println("----Cuarto-----");
        System.out.println("El numero de identificacion del alumno numero 4 es: " + alumnazo4.getId());
        System.out.println("Su nombre es " + alumnazo4.getNombre());
        System.out.println("Su apellido es " + alumnazo4.getApellido());
        System.out.println("-------------------");
    }
    
}
