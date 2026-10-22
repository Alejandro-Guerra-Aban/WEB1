import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class Clase12_for_02 {
    public static void main(String[] args) {
        ejem1();
        ejem2();
        ejem3();
        ejem4();
        ejercicio1();
        ejercicio2();
    }
    
    public static void ejem1() {
        int cont = 1; // Inicialización
        while (cont <= 10) { // Condición
            System.out.println(cont);
            cont++; // Variación
            if (cont==5) {
                continue;
            }
            if (cont==10){
                break;
            }
        }
    }
    
    public static void ejem2() {
    int cont = 1; // Inicialización
    while (cont <= 10) { // Condición
        if (cont == 5) {
            System.out.println(cont);
            cont++; // Incremento específico para cuando es 5
            continue;
        }
        
        if (cont == 10) {
            break; // Rompe el bucle si llega a 10
        }
        
        cont++; // Incremento general para el resto de números
    }
}
    
    public static void ejem3() {
        int cont = 1; // Inicialización
        while (cont <= 9) { // Condición
            if (cont!=6)
                System.out.println(cont);
                cont++;
        }
    }
    
    public static void ejem4() {
        int cont = 1; // Inicialización
        while (cont <= 10) { // Condición
                System.out.println(cont);
                cont++;
        }
        
        for(cont = 1; cont <= 10 ; cont++) {
            System.out.println(cont);
        }
    }
    public static void ejercicio1() {
        // Realizar una suma, pero SOLO con valores de entre 1 y 10, en caso de ser invalido hay que pedirle otra vez el número
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un numero entre 1 y 10: ");
        int num1, num2;
        num1 = sc.nextInt();
        while (num1 > 10 || num1 < 1) {
            System.out.print("ERROR: Introduce un numero entre 1 y 10: ");
            num1 = sc.nextInt();
    }
        System.out.print("Introduce otro numero entre 1 y 10: ");
        num2 = sc.nextInt();
        while (num2 > 10 || num2 < 1) {
            System.out.print("ERROR: Introduce otro numero entre 1 y 10: ");
            num2 = sc.nextInt();
        }
        
        System.out.println("La suma es: " + (num1 + num2));
    }
    
    public static void ejercicio2() {
        // Realizar una suma, pero SOLO con valores de entre 1 y 10, en caso de ser invalido hay que pedirle otra vez el número
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un numero entre 1 y 10: ");
        int num1, num2;
        num1 = sc.nextInt();
        for (; num1 > 10 || num1 < 1 ;) {
            System.out.print("ERROR: Introduce un numero entre 1 y 10: ");
            num1 = sc.nextInt();
    }
        System.out.print("Introduce otro numero entre 1 y 10: ");
        num2 = sc.nextInt();
        for (; num2 > 10 || num2 < 1 ;) {
            System.out.print("ERROR: Introduce otro numero entre 1 y 10: ");
            num2 = sc.nextInt();
        }
        
        System.out.println("La suma es: " + (num1 + num2));
    }
}
