
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */ 
public class Clase02_variables {
    
    public static void main(String[] args) {
        System.out.println("Empezamos");
        
        // ENTEROS
        byte var1 = 5; // 1 byte -> -128 +127
        short var2 = 5555; // 2 bytes
        int var3 = 5555555; // 4 bytes
        long var4 = 6555555555L; // 8 bytes
        
        // LITERALES ENTEROS SE GUARDAN COMO UN INT
        
        System.out.println(var1);
        System.out.println("var1");
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        
        // DECIMALES
        float var5 = 5.5f; // LITERALES
        // float var5 = (float) 5.5; CASTING
        double var6 = 7.7;
        // LITERALES DECIMALES SE GUARDAN COM UN DOUBLE
        
        System.out.println(var5);
        System.out.println(var6);
        
        // JUEGO DE CARACTERÉS
        
        char var7 = 'r';
        var7 = '5';
        System.out.println(var7);
        char var7_2 = 65;
        System.out.println(var7_2); // A del ASCII
        
        boolean var8 = true;
        System.out.println(var8);
        
        String var9 = "cadenas de texto";
        System.out.println(var9);
        
        /* 
        Tipos de datos simples: solo guardan un dato
        Tipos de datos basciso: los 8 primeros
        */
        
        /*
        EJERCICIO
        */
        
        byte variable1 = 1;
        short variable2 = 333; 
        int variable3 = 99999999; 
        long variable4 = 710000000;
        float variable5 = 50.3f;
        double variable6 = 9.9;
        char variable7 = 98;
        boolean variable8 = true;
        String variable9 = "Texto";
        
        System.out.println(variable1);
        System.out.println(variable2);
        System.out.println(variable3);
        System.out.println(variable4);
        System.out.println(variable5);
        System.out.println(variable6);
        System.out.println(variable7);
        System.out.println(variable8);
        System.out.println(variable9);
        
        /*
        FIN DEL EJERCICIO
        */
        
        // LEER VARIABLES POR TECLADO
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Tu edad es: " + edad);
        
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.next();
        sc.nextLine();
        System.out.println("Introduce tus apellidos: ");
        String apellidos = sc.nextLine();
        System.out.println("Introduce tu edad: ");
        int edad2 = sc.nextInt();
        System.out.println("Hola " + nombre + " " + apellidos + ", tienes " + edad2 + " años");
        
        byte n1,n2=5,n3;
        System.out.println("Introduce un valor para n1: ");
        n1 = sc.nextByte();
        System.out.println("Introduce un valor para n2: ");
        n2 = sc.nextByte();
        System.out.println("Introduce un valor para n3: ");
        n3 = sc.nextByte();
        System.out.println("VALORES: " + n1 + " " + n2 + " " + n3);
        
        System.out.println("Fin");
    }
}