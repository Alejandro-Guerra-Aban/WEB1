
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class ejercicios_arrays {
    public static void main(String[] args) {
        System.out.println("Empezamos");
        
        // ejer1();
        // ejer2();
        // ejer3();
        // ejer4();
        // ejer5();
        // ejer6();
        // ejer7();
        // ejer8();
         ejer9();
        
        System.out.println("Fin");
    }
    
    public static void ejer1() {
        // 1. Rellenar y mostrar un array de tamaño 10 con números del 0 al 9
        
        int arr_1[]; // Declaración del array
        arr_1 = new int [10]; // Guardar 10 posiciones de memoría (0-9)
        for (int i = 0; i < arr_1.length; i++) { // Para cada posicion (empenzando por la posicion 0), comprobamos si la posicion es menor a la longitud, si se cumple se le suma 1
            arr_1[i] = i; // Asignamos el valor del índice a la posición actual
            System.out.println(i + ":" + arr_1[i]); // Mostramos la posicion del indice + : + el valor de dicha posicion
        }
    }
    
    public static void ejer2() {
    // 2. Rellenar y mostrar un array de tamaño 10 con numeros del 10 al 20 (11 al 20 o 10 al 19)

    int arr_2[]; // Declaración del array
    arr_2 = new int [10]; // Guardar 10 posiciones de memoría (0-9)
    for (int i = 0; i < arr_2.length; i++) { // Para cada posicion (empenzando por la posicion 0), comprobamos si la posicion es menor a la longitud, si se cumple se le suma 1
        arr_2[i] = i; // Asignamos el valor del índice a la posición actual
        arr_2[i] = i + 10; // Asignamos el valor del índice a la posición actual y le sumamos 10 para que el primer valor sea 10
        System.out.println(i + ":" + arr_2[i]); // Mostramos la posicion del indice + : + el valor de dicha posicion
       }
    }
    
    public static void ejer3() {
    // 3. Rellenar y mostrar un array de tamaño 10 con numeros del 10 al 1

    int arr_3[]; // Declaración del array
    arr_3 = new int [10]; // Guardar 10 posiciones de memoría (0-9)
    for (int i = arr_3.length - 1; i >= 0 ; i--) { // Para cada posicion de la longitud del array (-1 para empezar por el final), si i es mayor o igual a 0, le resto 1
        arr_3[i] = i + 1; // Le sumamos uno al valor para poder obtener numeros del 10 al 1
        System.out.println(i + ":" + arr_3[i]); // Mostramos el array por pantalla
       }
    }
    
    public static void ejer4() {
    // 4. Rellenar y mostrar un array de tamaño 10 con numeros pares del 2 al 20

    int arr_4[]; // Declaración del array
    arr_4 = new int [10]; // Guardar 10 posiciones de memoría (0-9)
    for (int i = 0; i < arr_4.length ; i++) { // Para cada posicion (empenzando por la posicion 0), comprobamos si la posicion es menor a la longitud, si se cumple se le suma 1
        arr_4[i] = (i + 1) * 2; // Le sumamos uno al valor para poder obtener numeros del 10 al 1
        System.out.println(i + ":" + arr_4[i]); // Mostramos el array por pantalla
       }
    }
    
    public static void ejer5() {
    // 5. Rellenar un array con números introducidos por el usuario y mostrarlo

    Scanner sc = new Scanner (System.in);
    int arr_5[]; // Declaración
    arr_5 = new int [5]; // Reserva en memoría
    for (int i = 0; i < arr_5.length; i++) { // Para cada posicion (empenzando por la posicion 0), comprobamos si la posicion es menor a la longitud, si se cumple se le suma 1
        System.out.print("Introduce numero " + i + ": "); // Pedir al usuario introducir numeros segun la longitud del array
        arr_5[i] = sc.nextInt(); // Tomar los valores introducidos como valores de numeros enteros
    }
    for (int a = 0; a < arr_5.length; a++) { // Para cada posicion (empenzando por la posicion 0), comprobamos si la posicion es menor a la longitud, si se cumple se le suma 1
        System.out.println(a + ":" + arr_5[a]); // Mostramos el array por pantalla
        }
    }
    
    public static void ejer6() {
    // 6. Rellenar y mostrar un array de tamaño 10 con la tabla de multiplicar de un número aleatorio

    int arr_6[]; // Declaración
    arr_6 = new int [10]; // Reserva en memoría
    int numero = (int) (Math.random()*10) + 1; // Generación de númeor rnadom entre 1 y 9 + 1
    System.out.println("Tabla de multiplicar del numero: " + numero); // Mostar por pantalla el numero de la tabla de multiplicar
    System.out.println("-----------------------------------"); // Mostar por pantalla separador
    for (int i = 0; i < arr_6.length; i++) { // Para cada posición (empezando por la posicion 0), comprobamos si la posicion es menor a la longitud total del array, si se cumple se le suma 1
        int multiplicador = i + 1; // Iniciamos la variable multiplicador con la posicion + 1 (para que llegue a 10)
        arr_6[i] = multiplicador * numero; // Multiplicamos el array por el número seleccionado aleatoriamente
        System.out.println(i+1 + ":" + arr_6[i]); // Mostrar por pantalla el resultado del array ya multiplicado
        }
    }
    
    public static void ejer7() {
    // 7. Rellenar dos arrays de tamaño 10 con números aleatorios, muéstralos. A continuación, sumalos guardando el resultado en el primer array. La suma se realiza elemento a elemento como si fueran vectores.

    int arr_7[]; // Declaración
    int arr_7_2[]; // Declaración
    arr_7 = new int [10]; // Reserva en memoría
    arr_7_2 = new int [10]; // Reserva en memoría
    System.out.println("========== ARRAY 1 ================"); // Mostrar por pantalla el array 1
    for (int i = 0; i < arr_7.length; i++) { // Para cada posicion (empezando por la posicion 0), comprobamos is la posicion es menor a la longitud total de array, si se cumple se le suma 1
            arr_7[i] = (int) (Math.random()*10); // Rellenamos el array con números aleatorios ente 1 y 10
            System.out.println(i + ":" + arr_7[i]); // Mostramos el primer array
        }
    System.out.println("========== ARRAY 2 ================");
    for (int i = 0; i < arr_7_2.length; i++) { // Para cada posicion (empezando por la posicion 0), comprobamos is la posicion es menor a la longitud total de array, si se cumple se le suma 1
            arr_7_2[i] = (int) (Math.random()*10); // Rellenamos el array con números aleatorios ente 1 y 10
            System.out.println(i + ":" + arr_7_2[i]); // Mostramos el segundo array
        }
    System.out.println("========== SUMA DE ARRAYS ================");
    for (int i = 0; i < 10; i++) { // Para cada posicion (empezando por la posicion 0), comprobamos is la posicion es menor a 10, si se cumple se le suma 1
        arr_7[i] = arr_7[i] + arr_7_2[i]; // Declarar el primer array como la suma de los dos arrays
        System.out.println(i + ":" + arr_7[i]); // Mostrar la suma de los arrays
    }
    }
    
    public static void ejer8() {
    // 8. Rellenar un array de tamaño 10 con números aleatorios, muéstralo. A continuación, pide al usuario que introduzca un número. En caso de estar dicho número, el programa deberá indicar la posición o posiciones donde se encuentre dentro del array.
    Scanner sc = new Scanner (System.in); // Declaración del scanner
    int arr_8[]; // Declaración
    arr_8 = new int [10]; // Reserva en memoría
    for (int i = 0; i < arr_8.length; i++) { // Para cada posicion (empezando por la posicion 0), comprobamos is la posicion es menor a la longitud total de array, si se cumple se le suma 1
            arr_8[i] = (int) (Math.random()*10); // Rellenamos el array con números aleatorios ente 1 y 10
            System.out.println(i + ":" + arr_8[i]); // Mostar el array por pantalla
        }
        System.out.print("Introduce un numero: "); // Pedir al usuario que introduzca un número
        int numero = sc.nextInt(); // Tomar los valores introducidos como valores de numeros enteros
        
        System.out.println("Resultado de la busqueda: "); // Mostrar "Resultado de la busqueda: " por pantalla
        for (int i = 0; i < arr_8.length; i++) { // Para cada posicion (empezando por la posicion 0), comprobamos is la posicion es menor a la longitud total de array, si se cumple se le suma 1 
            if (arr_8[i] == numero) // Si cada posicion del array es igual al numero
                System.out.println("\nEncontrado en la posicion (indice): " + i); // Mostar por pantalla el indice del array donde se haya encontrado
        }
    }
    
    public static void ejer9() {
    // 9. Rellenar un array de tamaño 10 con números aleatorios, muéstralo. A continuación, pide al usuario que introduzca dos números correspondientes a dos posiciones. En caso de ser posiciones válidas, el programa deberá intercambiar los valores de dichas posiciones
    Scanner sc = new Scanner (System.in);
    int arr_9 [];
    arr_9 = new int [10];
    for (int i = 0; i < arr_9.length; i++) {
        arr_9[i] = (int) (Math.random()*10);
        System.out.println(i + ":" + arr_9[i]);
    }
    System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();
        System.out.print("Introduce otro numero: ");
        int numero2 = sc.nextInt();
        for (int i = 0; i < arr_9.length; i++) {
        if (numero < arr_9[i] || numero > arr_9[i]) {
            arr_9[numero] = i;
            arr_9[numero2] = i;
            
        }
        System.out.println(i + ":" + arr_9[i]);
        }
    }
}