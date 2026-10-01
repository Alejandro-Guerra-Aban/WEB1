/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class Clase03_conversionesTipos {
    
    public static void main(String[] args) {
        System.out.println("Empezamos");
        
        byte variable1 = 30;
        short variable2 = 10000;
        int variable3 = 10;
        long variable4 = 5555520000L;
        float variable5 = 10.6f;
        double variable6 = 4.8;
        char variable7 = 'j';
        boolean variable8 = true;
        String variable9 = "Texto simple";
        
        System.out.println(variable1);
        System.out.println(variable2);
        System.out.println(variable3);
        System.out.println(variable4);
        System.out.println(variable5);
        System.out.println(variable6);
        System.out.println(variable7);
        System.out.println(variable8);
        System.out.println(variable9);
        
        System.out.println("---------------------------------------");
        
        // Conversiones entre enteros
        
        variable2 = variable1; // De menor a mayor SI
        variable2 = 15;
        variable1 = (byte)variable2; // De mayor a menor NO DIRECTAMENTE. SI CON CASTING
        System.out.println(variable1);
        variable2 = 215;
        variable1 = (byte)variable2;
        System.out.println(variable1);
        
        variable4 = variable3;
        variable3 = (int)variable4;
        
        // Conversion entre decimales
        
        variable6 = variable5;
        variable5 = (float)variable6;
        float variable25 = (float) 7.7; // Para asignar un float se puede usar un casting en lugar de la F
        
        // Conversiones de entero a decimal se puede directamente.
        
        variable5 = variable3;
        variable5 = variable4;
        
        // Conversiones de decimal a entero se puede pero con CASTING
        
        variable4 = (long)variable5;
        variable4 = (long)7.7;
        System.out.println(variable4);
        
        // Conversion de número a cadena
        variable9 = "valor "+"de "+"ejemplo"; // Concatenar cadenas -> unir cadenas
        System.out.println(variable9);
        variable9 = variable5+""; // Usando la concatenación
        System.out.println(variable9+variable2);
        
        // Conversion de cadena a número
        
        variable9 = "57";
        variable3 = Integer.parseInt(variable9);
        System.out.println(variable3);
        variable4 = Long.parseLong(variable9);
        System.out.println(variable4);
        variable6 = Double.parseDouble(variable9);
        System.out.println(variable6);
        // WRAPPERS
        /*
        byte -> Byte
        int -> Integer
        char -> Character
        */
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        
        // char <-> números ASCII
        
        variable7 = 'A';
        variable3 = variable7;
        System.out.println(variable3);
        variable3 = 67;
        variable7 = (char) variable3; // Entre variables fuerza a hacerlo con CASTING
        variable7 = 67; // Asignación directa SI permite
        System.out.println(variable7);
        
        
        System.out.println("Fin");
    }
}
