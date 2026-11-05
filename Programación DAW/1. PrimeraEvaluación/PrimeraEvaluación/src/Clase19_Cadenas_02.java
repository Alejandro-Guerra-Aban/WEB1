import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class Clase19_Cadenas_02 {
    
    public static void main(String[] args) {
        System.out.println("Empezamos");
        // ejer1();
        // ejer2();
        ejer3();
        System.out.println("Fin");
    }
    
     // Metodo que reciba una cadena (String) y devuelva la misma cadena pero con las vocales borradas
    public static String eliminarVocales(String cadena) {
        // Cadena de prueba -> Cdn d prb
        cadena = cadena.replace("a", " ");
        cadena = cadena.replace("e", " ");
        cadena = cadena.replace("i", " ");
        cadena = cadena.replace("o", " ");
        cadena = cadena.replace("u", " ");
        cadena = cadena.replace("A", " ");
        cadena = cadena.replace("E", " ");
        cadena = cadena.replace("I", " ");
        cadena = cadena.replace("O", " ");
        cadena = cadena.replace("U", " ");
        
        return cadena;
        }
    
    public static void ejer3() {
        String cadena = "Cadena de texto";
        System.out.println("La cadena de texto sin vocales seria: " + eliminarVocales(cadena));
    }
    
    public static boolean esNumero(String valor) {
        boolean esNum = true;
        char digitos[] = valor.toCharArray();
        for (int i = 0; i < digitos.length && esNum; i++) {
        if (!Character.isDigit(digitos[i])) {
            esNum = false;
        }
    }
        
        return esNum;
    }
    
    public static void ejer2() {
        // Hacer una versión complicada de una suma de dos números introducidos por el usuario comprobando que sean números.
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un numero: ");
        String valor1 = sc.nextLine(); // WRAPPER
        while (!esNumero(valor1)){
            System.out.println("Error: El numero introducido no es un numero valido");
            System.out.print("Introduce un numero: ");
            valor1 = sc.nextLine();
        }
        int num1 = Integer.parseInt(valor1);
        String valor2;
        do {
            System.out.print("Introduce otro numero: ");
            valor2 = sc.nextLine();
            if (!esNumero(valor2)) {
                System.out.println("Error: El numero introducido no es un numero valido");
            }
        } while (!esNumero(valor2));
        int num2 = Integer.parseInt(valor2);       
        System.out.println("El resultado de la suma es: " + (num1 + num2));
    }
    
    public static void ejer1() {
        // Hacer una versión sencilla de la suma de dos números introducidos por el usuario.
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un numero: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce otro numero: ");
        int num2 = sc.nextInt();
        System.out.println("El resultado de la suma es: " + (num1 + num2));
    }
}
