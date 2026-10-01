/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class Clase07_ternarioyMath {
    
    public static void main(String[] args) {
        System.out.println("Empezamos");
        
        System.out.println(Math.random());
        System.out.println(Math.random()*10);
        
        
        System.out.println("---------------------");
        int edad = (int)(Math.random()*50);
        System.out.println("Edad: " + edad);
        String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(mensaje);
        
        {
            int num = 5; // AMBITO DE LAS VARIABLES
            System.out.println(num);
        }
        
        // System.out.println(num); ERROR - FUERA DEL AMBITO DE LA VARIABLE
        
        {
            int num = 5; // AMBITO DE LAS VARIABLES
            System.out.println(num);
        }
        
        /*
        CREA UN PROGRAMA QUE ME GENERE UN NUMERO ALEATORIO ENTRE 00001 Y 79999
        */
        System.out.println("LOTERIA");
        System.out.println((int)(Math.random()*1000000));
        System.out.println("********");
        System.out.print((int)(Math.random()*8));
        System.out.print((int)(Math.random()*10));
        System.out.print((int)(Math.random()*10));
        System.out.print((int)(Math.random()*10));
        System.out.println((int)(Math.random()*10));
        
        
        System.out.println("********");
        System.out.println(((int)(Math.random()*21))-10); // Valores entre -10 y 10
        System.out.println(((int)(Math.random()*(20-10+1)))+10); // Valores entre 10 y 20
        // (int)(Math.random() * MAX-MIN+1);
        
        
        System.out.println("Fin");
    }
    
}
