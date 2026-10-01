import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class Clase06_ejercicios_estructura_decision {
    public static void main(String[] args) {
        // 1. Que pida un número del 1 al 5 y diga si es primo o no.
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un numero del 1 al 5: ");
        int numero = sc.nextInt();
        if (numero == 2) {
            System.out.println("Es primo");
        }
        else if (numero == 3) {
        System.out.println("Es primo");
        }
        else if (numero == 5) {
        System.out.println("Es primo");
        }
        else {
            System.out.println("Es natural");
        }
        
        // 2. Que pida un número y diga si es par o impar.
        
        System.out.print("Introduce un numero: ");
        byte numero2 = sc.nextByte();
        if (numero2%2==0) { // Precedencia de operadores
            System.out.println("Es par");
        }
        else {
            System.out.println("Es impar");
        }
        
        // 3. Que pida un número del 1 al 7 y diga el día de la semana correspondiente.
        
        System.out.print("Introduce un numero del 1 al 7: ");
        int dia = sc.nextInt();
        if (dia == 1) {
            System.out.println("Lunes");
        }
        else if (dia == 2) {
        System.out.println("Martes");
        }
        else if (dia == 3) {
        System.out.println("Miércoles");
        }
        else if (dia == 4) {
        System.out.println("Jueves");
        }
        else if (dia == 5) {
        System.out.println("Viernes");
        }
        else if (dia == 6) {
        System.out.println("Sábado");
        }
        else if (dia == 7) {
        System.out.println("Domingo");
        }
        else {
            System.out.println("No es un día de la semana");
        }
        
        // 4. Que pida un número del 1 al 12 y diga el nombre del mes correspondiente.
        
        System.out.print("Introduce un numero del 1 al 12: ");
        int mes = sc.nextInt();
        if (mes == 1) {
            System.out.println("Enero");
        }
        else if (mes == 2) {
        System.out.println("Febrero");
        }
        else if (mes == 3) {
        System.out.println("Marzo");
        }
        else if (mes == 4) {
        System.out.println("Abril");
        }
        else if (mes == 5) {
        System.out.println("Mayo");
        }
        else if (mes == 6) {
        System.out.println("Junio");
        }
        else if (mes == 7) {
        System.out.println("Julio");
        }
        else if (mes == 8) {
        System.out.println("Agosto");
        }
        else if (mes == 9) {
        System.out.println("Septiembre");
        }
        else if (mes == 10) {
        System.out.println("Octubre");
        }
        else if (mes == 11) {
        System.out.println("Noviembre");
        }
        else if (mes == 12) {
        System.out.println("Diciembre");
        }        
        else {
            System.out.println("No es un numero de mes valido");
        }
        
        // 5. Que pida 3 números y los muestre en pantalla de menor a mayor.
        
        System.out.print("Introduce tres numeros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        } 
        else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        } 
        else {
            if (num1 <= num2) {
                System.out.println(num3 + " " + num1 + " " + num2);
            } else {
                System.out.println(num3 + " " + num2 + " " + num1);
            }
        }

        // 6. Que pida 3 numeros y los muestre en pantalla de mayor a menor.
        
        System.out.print("Introduce tres numeros: ");
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        int num6 = sc.nextInt();

        if (num4 >= num5 && num4 >= num6) {
            if (num5 >= num6) {
                System.out.println(num4 + " " + num5 + " " + num6);
            } else {
                System.out.println(num4 + " " + num6 + " " + num5);
            }
        } 
        else if (num5 >= num4 && num5 >= num6) {
            if (num4 >= num6) {
                System.out.println(num5 + " " + num4 + " " + num6);
            } else {
                System.out.println(num5 + " " + num6 + " " + num4);
            }
        } 
        else {
            if (num4 >= num5) {
                System.out.println(num6 + " " + num4 + " " + num5);
            } else {
                System.out.println(num6 + " " + num5 + " " + num4);
            }
        }
        
        // 7. Que pida 3 numeros y los muestre en pantalla de mayor a menor en lineas distintas. En caso de haber numeros iguales se pintan en la misma linea.
        
        
        
        
        // 8. Que pida un numero y diga si es positivo o negativo.
        
        System.out.print("Introduce un numero: ");
        int positivonegativo = sc.nextInt();
        if (positivonegativo > 0) {
            System.out.println("El numero es positivo");
        }
        else if (positivonegativo == 0){
            System.out.println("El 0 es un numero neutro, es decir, no es ni positivo ni negativo");
        }
        else {
            System.out.println("El numero es negativo");
        }
        
        // 9. Que solo permita introducir los caracteres S y N.
        
        System.out.println("Introduce un caracter: ");
        sc.nextLine();
        String caracter1 = sc.next();
        if (caracter1.equals("S") || caracter1.equals("N")) {
            System.out.println("El caracter introducido es valido");
        }
        else {
            System.out.println("El caracter introducido es invalido, solo puedes insertar caracteres S y N");
        }

        
        // 10. Que pida un numero y diga si es mayor de 100.
        
        System.out.print("Introduce un numero: ");
        int numeromayor100 = sc.nextInt();
        if (numeromayor100 > 100) {
            System.out.println("El numero: " + numeromayor100 + " es mayor que 100");
        }
        else {
            System.out.println("El numero: " + numeromayor100 + " es menor que 100");
        }
        
        // 11. Que pida una letra y detecte si es una vocal.
        
        System.out.print("Introduce una letra: ");
        sc.nextLine();
        String letra11 = sc.nextLine();
        if (letra11 == "a" && letra11 == "e" && letra11 == "i" && letra11 == "o" && letra11 == "u" && letra11 == "A" && letra11 == "E" && letra11 == "I" && letra11 == "O" && letra11 == "U") {
            System.out.println("La letra introducida es una vocal");
        }
        else {
            System.out.println("La letra introducida es una consontante");
        }
        
        // 12. Que pida tres numeros y detecte si se han introducido en orden creciente.
        
        System.out.print("Introduce tres numeros: ");
        int numero4 = sc.nextInt();
        int numero5 = sc.nextInt();
        int numero6 = sc.nextInt();
        if (numero4 < numero5 && numero5 < numero6) {
            System.out.println("Los numeros han sido introducidos en orden creciente");
        }
        else {
            System.out.println("Los numeros no han sido introducidos en orden creciente");
        }
        
        // 13. Que pida tres numeros y detecte si se han introducido en orden decreciente.
        
        System.out.print("Introduce tres numeros: ");
        int numero7 = sc.nextInt();
        int numero8 = sc.nextInt();
        int numero9 = sc.nextInt();
        if (numero7 > numero8 && numero8 > numero9) {
            System.out.println("Los numeros han sido introducidos en orden decreciente");
        }
        else {
            System.out.println("Los numeros no han sido introducidos en orden decreciente");
        }
        
        // 14. Que pida 10 numeros y diga cual es el mayor y cual el menor.
        
        System.out.print("Introduce 10 numeros: ");
        int ejer14num1 = sc.nextInt();
        int mayor = ejer14num1;
        int menor = ejer14num1;
        
        int ejer14num2 = sc.nextInt();
        mayor = Math.max(mayor, ejer14num2);
        menor = Math.min(menor, ejer14num2);
        
        int ejer14num3 = sc.nextInt();
        mayor = Math.max(mayor, ejer14num3);
        menor = Math.min(menor, ejer14num3);
        
        int ejer14num4 = sc.nextInt();
        mayor = Math.max(mayor, ejer14num4);
        menor = Math.min(menor, ejer14num4);
        
        int ejer14num5 = sc.nextInt();
        mayor = Math.max(mayor, ejer14num5);
        menor = Math.min(menor, ejer14num5);
        
        int ejer14num6 = sc.nextInt();
        mayor = Math.max(mayor, ejer14num6);
        menor = Math.min(menor, ejer14num6);
        
        int ejer14num7 = sc.nextInt();
        mayor = Math.max(mayor, ejer14num7);
        menor = Math.min(menor, ejer14num7);
        
        int ejer14num8 = sc.nextInt();
        mayor = Math.max(mayor, ejer14num8);
        menor = Math.min(menor, ejer14num8);
        
        int ejer14num9 = sc.nextInt();
        mayor = Math.max(mayor, ejer14num9);
        menor = Math.min(menor, ejer14num9);
        
        int ejer14num10 = sc.nextInt();
        mayor = Math.max(mayor, ejer14num10);
        menor = Math.min(menor, ejer14num10);
        
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        
        // 15. Que pida tres numeros e indicar si el tercero es igual a la suma del primero y el segundo.
        
        System.out.print("Introduce tres numeros: ");
        
        int ejer15num1 = sc.nextInt();
        int ejer15num2 = sc.nextInt();
        int ejer15num3 = sc.nextInt();
        
        if ((ejer15num1 + ejer15num2) == ejer15num3) {
            System.out.println("La suma del los dos primeros numeros coincide con el tercer numero insertado");
        }
        else {
            System.out.println("La suma de los dos primeros numeros no coincide con el tercer numero insertado");
        }
        
        // 16. Que muestre un menu que contemple las opciones Archivo, Buscar y Salir, en caso de que no se introduzca una opcion correcta se notificara por pantalla.
        
        System.out.println("1. Archivo");
        System.out.println("2. Buscar");
        System.out.println("3. Salir");
        System.out.println("Introduce una opcion: ");
        
        byte opcion = sc.nextByte();
        if (opcion == 1) {
            System.out.println("Opcion Archivo");
        }
        else if (opcion == 2) {
            System.out.println("Opcion Buscar");
        }
        else if (opcion == 3) {
            System.out.println("Salida");
        }
        else {
            System.out.println("La opcion introducida no es valida");
        }
        
        // 17. Que tome dos numeros del 1 al 5 y diga si ambos son primos.
        
        System.out.println("Introduce dos numeros del 1 al 5: ");
        int ejer17num1 = sc.nextInt();
        int ejer17num2 = sc.nextInt();
        
        if (ejer17num1 == 2 && ejer17num2 == 3) {
            System.out.println("Es primo");
        }
        else if (ejer17num1 == 3 && ejer17num2 == 5) {
        System.out.println("Es primo");
        }
        else {
            System.out.println("Los numeros introducidos no son primos");
        }
    }
}
