import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class Clase04_ejercicio {
    public static void main(String[] args) {
              
        System.out.println("Empezamos");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce una variable de tipo byte: ");
        byte variable1 = sc.nextByte();
        System.out.println("El byte introducido es: " + variable1);
        
        System.out.print("Introduce una variable de tipo short: ");
        short variable2 = sc.nextShort();
        System.out.println("El short introducido es: " + variable2);
        
        System.out.print("Introduce una variable de tipo int: ");
        int variable3 = sc.nextInt();
        System.out.println("El int introducido es: " + variable3);
        
        System.out.print("Introduce una variable de tipo long: ");
        long variable4 = sc.nextLong();
        System.out.println("El long introducido es: " + variable4);
        
        System.out.print("Introduce una variable de tipo float: ");
        float variable5 = sc.nextFloat();
        System.out.println("El float introducido es: " + variable5);

        System.out.print("Introduce una variable de tipo double: ");
        double variable6 = sc.nextDouble();
        System.out.println("El byte introducido es: " + variable6);
        
        System.out.print("Introduce una variable de tipo char: ");
        //char variable7 = sc.next();
        //System.out.println("El char introducido es: " + variable7);
        System.out.println("Imposible de ejecutar");

        System.out.print("Introduce una variable de tipo boolean: ");
        boolean variable8 = sc.nextBoolean();
        System.out.println("El booleano introducido es: " + variable8);
        
        System.out.print("Introduce una variable de tipo string: ");
        String variable9 = sc.next();
        System.out.println("El byte introducido es: " + variable9);
        
        
        System.out.println("Fin");
    }
}
