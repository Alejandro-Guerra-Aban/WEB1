/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class Clase01_inicio {

    public static void main(String[] args) {
        System.out.println("Empezamos");

        System.out.println("12345");
        System.out.print("12345");
        System.out.println("----------");
        
        // Declaracion de variables
        // Caracteres que puedo usar: a_zA_Z0_9$
        int variable_1; // DECLARACIÓN DE LA VARIABLE
        // int 2variable; Error porque empieza con un número
        variable_1 = 5; // ASIGNACIÓN DE VALOR
        System.out.println(variable_1);
        variable_1 = 15; // ASIGNACIÓN/MODIFICACIÓN DE VALOR
        System.out.println(variable_1); // Imprime EL NÚMERO GUARDADO EN LA VARIABLE
        System.out.println("variable_1"); // Imprime TEXTO
        
        String nombre = "Alejandro";
        String apellidos = "Guerra Abán";
        System.out.println("**********************");
        System.out.println(nombre);
        System.out.println(nombre);
        System.out.println(nombre);
        System.out.println(apellidos);
        // nombre = 5; ERROR PORQUE NO ES UN TEXTO
        
        // POSIBLES TIPOS DE DATOS

        // ENTEROS
        byte var1 = 5; // 1 byte -> -128 +127
        short var2 = 555; // 2 bytes
        int var3 = 5555555; // 4 bytes
        long var4 = 655555555; // 8 bytes
        
        System.out.println(var1);
        System.out.println("var1");
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        
        /*
        1 bit -> 0,1
        1 byte -> 8 bits 00000001 -> 2^8
        
        */
        
        // DECIMALES
        float var5 = 5.5f;
        double var6 = 7.7;
        
        System.out.println(var5);
        System.out.println(var6);
        
        System.out.print("Fin");
    }
}
