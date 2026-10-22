
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class Clase09_Bucles_01 {
    public static void main(String[] args) {
        System.out.println("Empezamos");
        
        System.out.println("-------------------------");
        
        int cont = 0;
        while (cont < 10) {
            System.out.println(cont);
            cont++;
        }
        
        System.out.println("-------------------------");
        
        /*
        EJERCICIO CREA UN PROGRAMA QUE MUESTRE UN PROGRAMA DEL 1 AL 10
        */
        
        int numero = 1;
        while (numero <= 10) {
            System.out.println(numero);
            numero++;
        }
        
        System.out.println("-------------------------");
        
        /*
        EJERCICIO CREA UN PROGRAMA QUE MUESTRE UN PROGRAMA DEL 10 AL 1
        */
        
        int numero2 = 10;
        while (numero2 > 0) {
            System.out.println(numero2);
            numero2--;
        }
        
        System.out.println("-------------------------");
        
        /*
        EJERCICIO CREA UN PROGRAMA QUE MUESTRE UN PROGRAMA DEL 2 AL 20 DE 2 EN 2
        */
        
        int numero3 = 2;
        while (numero3 <= 20) {
            System.out.println(numero3);
            numero3+=2;
        }
        
        System.out.println("-------------------------");
        
        /*
        TABLAS DE MULTIPLICAR
        */
        
        System.out.print("Introduce un numero: ");
        Scanner sc = new Scanner(System.in);
        int numero4 = sc.nextInt();
        int numero5 = 0;
        while (numero5 <= 9) {
            numero5++;
            int resultado = numero5 * numero4;
            System.out.println(numero4 + " X " + numero5 + " = " + resultado);
        }
        
        System.out.println("-------------------------");
        
        System.out.println("Fin");
    }
}
