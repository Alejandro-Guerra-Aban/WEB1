import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class Clase06_ejercicios_bucles {
    public static void main(String[] args) {
        // 1) Escribir un programa que lea una nota de un examen por teclado y devuelva la calificación que tiene. La calificación podrá ser: Suspenso (0-4.99), Aprobado(5-6.99), Notable (7-8.99), Sobresaliente(9-9.99) o Matricula de Honor (10).
        // 2) Mejore el ejercicio anterior de modo que si el usuario introduce un valor menor que cero o un valor mayor que 10 se muestre por pantalla un mensaje de error y finalice el programa.
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce una nota de un examen: ");
        
        float nota = sc.nextFloat();
        
        boolean continuar = true;
        
        while (nota <= 4.99 && continuar) {
            System.out.println("Suspenso");
            continuar = false;
        }
        while (nota <= 6.99 && nota >= 5 && continuar) {
            System.out.println("Aprobado");
            continuar = false;
        }
        while (nota <= 8.99 && nota >= 7 && continuar) {
            System.out.println("Notable");
            continuar = false;
        }
        while (nota <= 9.99 && nota >= 9 && continuar) {
            System.out.println("Sobresaliente");
            continuar = false;
        }
        while (nota == 10 && continuar) {
            System.out.println("Matricula de Honor");
            continuar = false;
        }
        while (nota < 0 && nota > 10 && continuar) {
            System.out.println("Error de calificacion");
            continuar = false;
        }
        
        // 3) Escribir un programa que lea dos números enteros por teclado y determine cuál es el mayor y cual es el menor. También deberá considerar el caso en el que los dos números sean iguales.
        
        
        }
    }