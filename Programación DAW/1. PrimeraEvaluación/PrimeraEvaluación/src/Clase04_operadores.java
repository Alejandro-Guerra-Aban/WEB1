import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class Clase04_operadores {
    public static void main(String[] args) {
        System.out.println("Emepzamos");
        
        // Unarios
        // ++ Incremento
        // -- Decremento
        // - Cambio de signo
        int var1 = 5;
        System.out.println(var1);
        var1++;
        ++var1;
        System.out.println(var1);
        System.out.println(-var1);
        var1 = -var1;
        System.out.println(var1);
        
        var1 = 5;
        System.out.println("***"+ ++var1);
        
        // Aritmeticos
        // + - * / %modulo
        
        System.out.println(6+7);
        System.out.println(var1-7);
        int var2 = 10;
        System.out.println(var1*var2);
        System.out.println(var1+5+6+7+8+9);
        System.out.println(7/2.0); // División entera
        System.out.println(7%2);
        System.out.println(7.0/2); // División decimal
        var1 = 7;
        var2 = 2;
        System.out.println(var1/var2); // Entera
        System.out.println(var1/(float)var2); // Con decimales
        
        
        /*
        EJERCICIO: PEDIR AL USUAIRO DOS VALORES Y CALCULA EL REUSLTADO DE USAR LAS CINCO OPERACIONES ARITCMEICAS A ESOS 2 VALORES
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        
        byte numero1 = sc.nextByte();
        
        System.out.print("Introduce un segundo número: ");
        
        byte numero2 = sc.nextByte();
        
        System.out.println("SUMA");
        System.out.println("El resultado de la suma " + numero1 + " + " + numero2 + " es: " + (numero1 + +numero2));
        System.out.println("RESTA");
        System.out.println("El resultado de la resta " + numero1 + " - " + numero2 + " es: " + (numero1 + -numero2));
        System.out.println("MULTIPLICACIÓN");
        System.out.println("El resultado de la multiplicación " + numero1 + " * " + numero2 + " es: " + (numero1 * numero2));
        System.out.println("DIVISIÓN");
        System.out.println("El resultado de la división " + numero1 + " / " + numero2 + " es: " + ((float)numero1 / numero2) + " | con resto " + (numero1 % numero2));
        
        /*
        FIN DEL EJERCICIO
        */
        
        System.out.println("------------------------");
        // Comporación
        // == 1= < > <= >=
        // El reusltado es un valor booleano: true false
        var1 = 5;
        var2 = 7;
        System.out.println(var1 == var2); // IGUAL
        System.out.println(var1 != var2); // DISTINTO
        System.out.println(var1 > var2); // MAYOR
        System.out.println(var1 < var2); // MENOR
        System.out.println(var1 >= var2); // MAYOR O IGUAL
        System.out.println(var1 <= var2); // MENOR O IGUAL
        
        
        System.out.println("Fin");
    }
}
