import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-09
 */
public class Clase11_for {
    public static void main(String[] args) {
        ejem1();
        System.out.println("********************");
        ejem2();
        System.out.println("********************");
        ejem3();
        System.out.println("********************");
        ejem4();
        System.out.println("********************");
        ejem5();
        System.out.println("********************");
        ejem6();
    }
    public static void ejem1() {
        int cont = 1; // Inicialización
        while (cont <= 10) { // Condición
            System.out.println(cont);
            cont++; // Variación
        }
    }
    public static void ejem2() {
        int suma = 0;
        for (int cont = 1; cont<=50; cont++) {
            suma+= cont;
        }
        System.out.println("Suma: " + suma);
    }
    public static void ejem3() {
        int suma = 0;
        int valor = 0;
        while (valor != 10) {
            valor = 1+(int)(Math.random()*10);
            suma += valor;
            System.out.println("Valor: " + valor);
        }
        System.out.println("Suma: " + suma);
    }
    public static void ejem4() {
        int cont = 1;
        for(;cont<=10;) {
            System.out.println(cont);
            cont ++;
        }
    }
    public static void ejem5() {
        for (int cont = 1, cont2 = 10, cont3 = 4;(cont <= 10 && cont3<=4); cont++, cont2--){
            System.out.println(cont+" "+cont2+" "+cont3);
            cont3 = (int) (Math.random()*6);
        }
    }
    
    /*
    PIDE AL USUARIO INTRODUCIR UN NUMERO Y CON UN BUCLE FOR IMPRIMIR LA TABLA DE MULTIPLICAR DE ESE NUMERO
    */
    
    public static void ejem6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
