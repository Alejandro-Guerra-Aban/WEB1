import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class Clase05_operadores2 {
    public static void main(String[] args) {
        System.out.println("Empezamos");
        
        
        // Operadores Logicos
        /*
        & and
        | or
        ! not
        && and
        || or
        
        0 false
        1 true
        
        AND
        00 0
        01 0
        10 0
        11 1
        
        OR
        00 0
        01 1
        10 1
        11 1
        
        NOT
        0 1
        1 0
        */
        
        System.out.println("AND");
        System.out.println(false && false);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(true && true);
        System.out.println("OR");
        System.out.println(false | false);
        System.out.println(false | true);
        System.out.println(true | false);
        System.out.println(true | true);
        System.out.println("NOT");
        System.out.println(!true);
        System.out.println(!false);
        
        System.out.println(false && false && true);
        
        int var1 = 5;
        System.out.println("**********"+!(var1 < 25));
        
        
        System.out.println(5 < 10 || var1== 10);
        
        System.out.println(5 < 10 || (var1 = 5) != 5);
        
        int var2 = 5;
        // ASIGNACIÓN
        // = += -= *= /= %=
        // var1 <= var2;
        var1 = var2;
        System.out.println(var1);
        var1++;
        var1 = var1 + 5;
        System.out.println(var1);
        var1 = var1 * 5;
        System.out.println(var1);
        var1 += 5;
        System.out.println(var1);
        var1 /=5; // var1 = var1 / 5;
        System.out.println(var1);
        
        int sueldo = 25000;
        boolean familiaNumerosa = true;
        
        boolean concesionBeca = sueldo < 30000 && familiaNumerosa == true;
        System.out.println("Concedida: " + concesionBeca);
        
        String cadena = "cadena de texto";
        cadena = cadena + " de ejemplo";
        System.out.println(cadena);
        
        /*
        EJERCICIO: CREA UN PROGRAMA QUE USE TODOS LOS OPERADORES
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
        
        System.out.println(numero1 == var1);
        System.out.println(numero2 != var1);
        System.out.println(numero2 += var1);
        System.out.println(numero2 -= var1);
        System.out.println(numero2 *= var1);
        System.out.println(numero2 /= var1);
        System.out.println(numero2 %= var1);
        System.out.println(numero2 <= var1);
        System.out.println(numero2 >= var1);
        System.out.println(numero2 < var1);
        System.out.println(numero2 > var1);
        System.out.println(numero2 & var1);
        System.out.println(numero2 | var1);
        
        // PARA LOS STRINGS NO VALEN == !=
        
        System.out.println(cadena.equals("valor"));
        System.out.println(cadena.equalsIgnoreCase("valor"));
        System.out.println(!cadena.equals("valor"));
        
        System.out.print("Introduce una password: ");
        String password = sc.next();
        System.out.println("Contraseya valida?: " + (password.equals("qwerty")));
        
        /*
        FIN DEL EJERCICIO
        */
        
        System.out.println("Fin");
    }
}
