import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class Clase06_estructurasDecision {
    public static void main(String[] args) {
        System.out.println("Empezamos");
        
        
        // ESTRUCUTRAS DE PROGRAMACIÓN
        // Sirven para definir el orden de ejecucción de las instrucciones
        // Secuencia
        // Estructuras de decisióno condicionales
        // if switch
        // Estructuras de repetición o bucles
        // while do-while for
        
        // Estrucuturas de decisión o condicionales
        // Permiten ejecutar un conjunto de instrucción o no
//        if (condicion -> boolean){
//            Si la condicion se cumple esto se ejecuta
//        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        byte edad = sc.nextByte();
        if(edad >= 18) {
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }
        
        /*
        EJERCICIO: PIDE AL USUAIRO UN NUMERO Y EL PROGRAMA TENGA QUE DECIR SI EL NUMERO ES PAR O IMPAR
        */
        
        System.out.print("Introduce un numero: ");
        byte numero = sc.nextByte();
        if (numero%2==0) { // Precedencia de operadores
            System.out.println("Es par");
        }
        else {
            System.out.println("Es impar");
        }
        
        /*
        FIN DEL EJERCICIO
        */
        
        int cantidad = 250;
        
        if (cantidad < 1000) {
            System.out.println("Pago en metalico");
        }
        else if (cantidad < 3000 && cantidad>=1000) {
            System.out.println("Pagon con tarjeta");
        }
        else {
                System.out.println("Pago con transferencia");
                }
        
        System.out.println("Fin");
    }
}
