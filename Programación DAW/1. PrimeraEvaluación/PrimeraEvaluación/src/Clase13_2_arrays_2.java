import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class Clase13_2_arrays_2 {
    public static void main(String[] args) {
        System.out.println("Empezamos");
        // ejer1();
        // ejer2();
        ejer3();
        System.out.println("Fin");
    }
    
    public static void ejer1() {
    /* Guardar en un array de 10 la tabla de multipilicar de ese numero introducido por un usuario */
    System.out.println("------------------");
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int numero = sc.nextInt();
    int arr_1[]; // Declaración
    arr_1 = new int [10]; // Reserva en memoría
    for (int i = 0; i < arr_1.length; i++) {
        arr_1[i] = numero*(i+1);
        System.out.println(i+1 + ":" + arr_1[i]);
    }
    
    }
    
    public static void ejer2() {
    /* Guardar en un array de 10 la tabla de multipilicar de ese numero introducido por un usuario (Recorriendo por el final) */
    System.out.println("------------------");
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int numero = sc.nextInt();
    int arr_1[]; // Declaración
    arr_1 = new int [10]; // Reserva en memoría
    for (int i = arr_1.length-1; i>=0; i--) {
        arr_1[i] = numero * i;
        System.out.println(i + ":" + arr_1[i]);
    }
    
    }
    
    public static void ejer3() {
    /* Rellenar un array de tamaño 10 con numeros aleatorios, pero las posiciones par el numero debe ser par y en las impares el numero debe ser impar */
    System.out.println("------------------");
    int arr_3[]; // Declaración
    arr_3 = new int [10]; // Reserva en memoría
    for (int i = 0; i < arr_3.length; i++) {
               
        if (i % 2 == 0) { // Si posición par
            arr_3[i] = (int) (Math.random()*10)*2; // Genero un numero par multiplicado por 2
        } else { // Si posicion impar
            int numero = (int) (Math.random()*10);
            if (numero%2==1) // Si el numero es impar
                arr_3[i] = numero; // Lo guardo
            else arr_3[i] = numero + 1; // Si no es impar le sumo 1, para hacerlo impar, y lo guardo
        }
        
        System.out.println(i + ":" + arr_3[i]); // Mostarlo por pantalla
        
        }
    }
}
