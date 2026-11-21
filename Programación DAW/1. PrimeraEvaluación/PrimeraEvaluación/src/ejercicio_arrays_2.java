import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class ejercicio_arrays_2 {

    public static void main(String[] args) {
        System.out.println("Empezamos");
        Scanner sc = new Scanner(System.in);
        int arr[];
        arr = new int[10];
        int contador = 0;
        String opcion;

        do {
            System.out.println("\n - MENU -");
            System.out.println("0. Salir");
            System.out.println("1. Insertar");
            System.out.println("2. Mostrar");
            System.out.print("\nIntroduce opcion: ");

            opcion = sc.next();

            switch (opcion) {
                case "0":
                    opcion0();
                    break;
                case "1":
                    contador = opcion1(arr, contador);
                    break;
                case "2":
                    opcion2(arr);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (!opcion.equals("0"));
        System.out.println("\nFin");
    }

    public static void opcion0() {
        System.out.println("Fin del programa");
    }

    public static int opcion1(int arr[], int contador) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();
        boolean repetido = false;
        for (int i = 0; i < contador; i++) {
            if (arr[i] == numero) {
                repetido = true;
            }
        }
        
        if (repetido) {
            System.out.println("El numero ya ha sido insertado");
        }
        else if (contador < arr.length) {
            arr[contador] = numero;
            contador ++;
            System.out.println("Numero insertado correctamente");
        }
        
        if (contador == arr.length) {
            System.out.println("El array esta completo");
        }
        return contador;
    }

    public static void opcion2(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ":" + arr[i]);
        }
    }
}
