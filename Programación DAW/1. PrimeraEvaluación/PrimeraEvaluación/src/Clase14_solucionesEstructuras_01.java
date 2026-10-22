import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class Clase14_solucionesEstructuras_01 {
    
    public static void main(String[] args) {
        System.out.println("Empezamos");
        //ejer21();
        //ejer24();
        ejerH();
        
        System.out.println("Fin");
    }
    
    public static void ejerH() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce num1: ");
        int n1 = sc.nextInt();
        System.out.println("Introduce num2: ");
        int n2 = sc.nextInt();
        if (n1 < n2) {
            int cont = n1;
            int contar = 0;
            int numPares = 0;
            int sumaPares = 0;
            while (cont <= n2) {
                System.out.println(cont);
                if (cont%2 == 0) {
                    numPares++;
                    sumaPares+=cont;
                }
                contar ++;
                cont ++;
            }
            System.out.println(contar + ";" + numPares + ";" + sumaPares);
        } else {
            int contar = 0;
            int numPares = 0;
            int sumaPares = 0;
            for (int cont = n2; cont <= n1; cont++){
                System.out.println(cont);
                if (cont%2 == 0) {
                    numPares++;
                    sumaPares+=cont;
                }
                contar++;
            }
        }
    }
    
    public static void ejer24() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce horas: ");
        int h = sc.nextInt();
        while (h < 0 || h > 23) {
            System.out.println("ERROR: Introduce horas: ");
            h = sc.nextInt();
        }
        int m;
        do {
            System.out.println("Introduce minutos: ");
            m = sc.nextInt();
            if (m < 0 || m > 59)
                System.out.println("Error: ");
        } while (m < 0 || m > 59);
        int s;
        System.out.println("Introduce segundos: ");
        s = sc.nextInt();
        while (s < 0 || s > 59) {
            System.out.println("ERROR: Introduce segundos: ");
            s = sc.nextInt();
        }
        if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) {
            System.out.println("Error en la entrada");
        } else {
            s++;
        if(s == 60) {
            s = 0;
            m++;
            if (m == 60) {
                m = 0;
                h++;
                if (h == 24) {
                    h = 0;
                }
            }
        }
        System.out.println("La hora es: " +h+":"+m+":"+s);
        }
    }
    public static void ejer21() {
        Scanner sc = new Scanner (System.in);
        System.out.println("- MENU -");
        System.out.println("1. Equilatero");
        System.out.println("2. Isosceles");
        System.out.println("3. Escaleno");
        System.out.print("Introduce una opcion: ");
        String opcion = sc.next();
        switch(opcion) {
            case "1":
            {
                System.out.print("Introduce un lado: ");
                int lado = sc.nextInt();
                System.out.println("El perimetro es: " + (lado * 3));
                break;
            }
            case "2":
            {
                System.out.print("Introduce lado1: (dos aristas) ");
                int lado = sc.nextInt();
                System.out.print("Introduce lado2: ");
                int lado2 = sc.nextInt();
                System.out.println("El perimetro es: " + ((lado * 2) + lado2));
                break;
            }
            case "3":
            {
                System.out.print("Introduce lado1: ");
                int lado = sc.nextInt();
                System.out.print("Introduce lado2: ");
                int lado2 = sc.nextInt();
                System.out.print("Introduce lado3: ");
                int lado3 = sc.nextInt();
                System.out.println("El perimetro es: " + (lado + lado2 + lado3));
                break;
            }
            default:
                System.out.println("Opcion no valida");
        }
    }
}
